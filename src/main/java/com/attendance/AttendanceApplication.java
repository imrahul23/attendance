package com.attendance;

import org.skife.jdbi.v2.DBI;

import com.attendance.dao.SampleDao;
import com.attendance.resources.AdminResource;
import com.attendance.resources.EmployeeResource;

import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class AttendanceApplication extends Application<AttendanceConfiguration> {

    public static void main(final String[] args) throws Exception {
        new AttendanceApplication().run(args);
    }

    @Override
    public String getName() {
        return "Attendance";
    }

    @Override
    public void initialize(final Bootstrap<AttendanceConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final AttendanceConfiguration configuration,
                    final Environment environment) {
		final DBIFactory factory = new DBIFactory();
		final DBI jdbi = factory.build(environment, configuration.getDataSourceFactory(), "mysql");
		final SampleDao dao = jdbi.onDemand(SampleDao.class);

		environment.jersey().register(new AdminResource(dao));
		environment.jersey().register(new EmployeeResource(dao));

    }

}
