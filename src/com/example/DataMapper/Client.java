package com.example.DataMapper;

import java.util.Optional;

public final class Client {

	// private static Logger log = Logger.getLogger(App.class);

	/**
	 * Program entry point.
	 * 
	 * @param args command line args.
	 */
	public static void main(final String... args) {

		/* Create new data mapper for type 'first' */
		final StudentDataMapper mapper = new StudentDataMapperImpl();

		/* Create new student */
		Student student = new Student(1, "Adam", 'A');

		/* Add student in respectibe store */
		mapper.insert(student);

		//log.debug("App.main(), student : " + student + ", is inserted");

		/* Find this student */
		final Optional<Student> studentToBeFound = mapper.find(student.studentId());

		//log.debug("App.main(), student : " + studentToBeFound + ", is searched");

		/* Update existing student object */
		student = new Student(student.studentId(), "AdamUpdated", 'A');

		/* Update student in respectibe db */
		mapper.update(student);

		//log.debug("App.main(), student : " + student + ", is updated");
		//log.debug("App.main(), student : " + student + ", is going to be deleted");

		/* Delete student in db */
		mapper.delete(student);
	}
}