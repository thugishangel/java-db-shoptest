
package se.humanusproject.example.app;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.flywaydb.core.Flyway;

public class Main {

	public static void main(final String[] args) throws SQLException {

		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:~/DataB");
		ds.setUsername("sa");
		ds.setPassword("");

		try {
			
		Flyway flyway=new Flyway();
		flyway.setDataSource(ds);
		flyway.migrate();	
		} finally {
			ds.close();
		}
	}

}
