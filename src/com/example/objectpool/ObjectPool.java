package com.example.objectpool;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Java program to illustrate object pool design pattern
 * 
 * @author Prabhu G
 *
 * @param <T>
 */
public abstract class ObjectPool<T> {
	long aliveTime;

	Hashtable<T, Long> usedObjects, unusedObjects;

	public ObjectPool() {
		aliveTime = 100000; // 50 seconds
		usedObjects = new Hashtable<T, Long>();
		unusedObjects = new Hashtable<T, Long>();
	}

	abstract T create();

	abstract boolean validate(T o);

	abstract void destroy(T o);

	synchronized T peekOut() {
		long now = System.currentTimeMillis();
		T t;
		if (unusedObjects.size() > 0) {
			Enumeration<T> e = unusedObjects.keys();
			while (e.hasMoreElements()) {
				t = e.nextElement();
				if ((now - unusedObjects.get(t)) > aliveTime) {
					// object is not referenced by others or unused
					unusedObjects.remove(t);
					destroy(t);
					t = null;
				} else {
					if (validate(t)) {
						unusedObjects.remove(t);
						usedObjects.put(t, now);
						return (t);
					} else {
						unusedObjects.remove(t);
						destroy(t);
						t = null;
					}
				}
			}
		}
		// if none of the objects are present then create a object place it in hashtable
		t = create();
		usedObjects.put(t, now);
		return t;
	}

	public synchronized void peekIn(T t) {
		usedObjects.remove(t);
		unusedObjects.put(t, System.currentTimeMillis());
	}

}
