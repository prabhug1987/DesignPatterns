package com.example.objectpool;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		JDBCConnectionPool jdbcConnectionPool = new JDBCConnectionPool("com.mysql.jdbc.Driver",
				"jdbc:mysql:3306/testdb", "root", "root");

		Connection connection = jdbcConnectionPool.peekOut();
		jdbcConnectionPool.peekIn(connection);

	}

}
