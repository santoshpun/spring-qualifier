package com.santosh.springqualifier.service;

public class HourlyProject implements Project {

    @Override
    public void createProject(String name, String description) {
        System.out.println("Hourly project has been created");
    }

    @Override
    public void addTask(String taskName, String taskDescription) {
        System.out.println("New task created for hourly project");
    }

    @Override
    public void assignTask(int taskId, int userId) {
        System.out.println("Resource assigned to created task");
    }
}
