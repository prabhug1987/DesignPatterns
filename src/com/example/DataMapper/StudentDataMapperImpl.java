package com.example.DataMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDataMapperImpl implements StudentDataMapper {
	/* Note ; Normally this would be in the form of an actual database */

	private List<Student> students = new ArrayList<>();

	@Override
	public Optional<Student> find(int studentId) {
		// TODO Auto-generated method stub

		/**
		 * compare with existing students
		 */
		for (final Student student : this.getStudents()) {
			// check if the student is found
			if (student.studentId() == studentId) {
				return Optional.of(student);
			}
		}
		// return empty value
		return Optional.empty();
	}

	@Override
	public void insert(Student student) throws DataMapperException {
		// TODO Auto-generated method stub
		// check with existing student list
		if (!this.getStudents().contains(student)) {
			// add the student in the list
			this.getStudents().add(student);
		} else {
			throw new DataMapperException("Student already [" + student.getName() + "] exists");
		}
	}

	@Override
	public void update(Student student) throws DataMapperException {
		// TODO Auto-generated method stub
		/* Check with existing students */
		if (this.getStudents().contains(student)) {

			final int index = this.getStudents().indexOf(student);
			/* Add student in list */
			this.getStudents().set(index, student);

		} else {

			/* Throw user error after wrapping in a runtime exception */
			throw new DataMapperException("Student already [" + student.getName() + "] exists");
		}
	}

	@Override
	public void delete(Student student) throws DataMapperException {
		// TODO Auto-generated method stub
		// check with existing student list
		if (this.getStudents().contains(student)) {
			// add the student in the list
			this.getStudents().remove(student);
		} else {
			throw new DataMapperException("Student already [" + student.getName() + "] exists");
		}
	}

	public List<Student> getStudents() {
		return this.students;
	}

}
