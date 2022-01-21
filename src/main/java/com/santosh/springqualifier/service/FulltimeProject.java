package com.santosh.springqualifier.service;

public class FulltimeProject implements Project {

    @Override
    public void createProject(String name, String description) {
        System.out.println("Full time project has been created");
    }

    @Override
    public void addTask(String taskName, String taskDescription) {
        System.out.println("New task created for full time project");
    }

    @Override
    public void assignTask(int taskId, int userId) {
        System.out.println("Resource assigned to created task");
    }
}
