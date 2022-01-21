package com.santosh.springqualifier.service;

public interface Project {

    void createProject(String name, String description);

    void addTask(String taskName, String taskDescription);

    void assignTask(int taskId, int userId);
}
