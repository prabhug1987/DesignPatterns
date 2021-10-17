package com.example.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Creating obejct poool
 * @author modified by Prabhu G
 *
 */
public class JDBCConnectionPool extends ObjectPool<Connection> {
	String dsn;
	String username;
	String pass;

	public JDBCConnectionPool(String driver, String dsn, String username, String pass) {
		super();
		try {
			Class.forName(driver).getDeclaredConstructor().newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		this.dsn = dsn;
		this.username = username;
		this.pass = pass;
	}

	@Override
	Connection create() {
		Connection connection = null;
		try {
			connection = (DriverManager.getConnection(dsn, username, pass));
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}

	@Override
	boolean validate(Connection o) {
		boolean connectionState = false;
		try {
			connectionState = (!((Connection) o).isClosed());
			return connectionState;
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return connectionState;
	}

	@Override
	void destroy(Connection o) {
		try {
			((Connection) o).isClosed();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	

}
// thanks to geek for geeks
