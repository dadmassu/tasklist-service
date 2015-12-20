package com.bjedrzejewski.tasklistservice;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class TaskListServiceApplication extends Application<TaskListServiceConfiguration> {
    public static void main(String[] args) throws Exception {
        new TaskListServiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "chat-service-application";
    }

    @Override
    public void initialize(Bootstrap<TaskListServiceConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(TaskListServiceConfiguration configuration,
                    Environment environment) {
        // nothing to do yet
    }

}