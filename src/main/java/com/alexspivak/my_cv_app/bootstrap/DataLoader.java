package com.alexspivak.my_cv_app.bootstrap;

import com.alexspivak.my_cv_app.model.Project;
import com.alexspivak.my_cv_app.model.UserProfile;
import com.alexspivak.my_cv_app.repository.ProjectRepository;
import com.alexspivak.my_cv_app.repository.UserProfileRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserProfileRepository profileRepo;
    private final ProjectRepository projectRepo;

    // Constructor Injection
    public DataLoader(UserProfileRepository profileRepo, ProjectRepository projectRepo) {
        this.profileRepo = profileRepo;
        this.projectRepo = projectRepo;
    }

    @Override
    public void run(String... args) throws Exception {
        // 1. Create and Save your Profile
        UserProfile alex = new UserProfile(null, "Alexandra Spivak", "Java Developer", "Building a portfolio with Spring Boot", "photo.jpg");
        profileRepo.save(alex);

        // 2. Create and Save a Project
        Project project = new Project(null, "Portfolio Site", "Personal CV website", "Java, Spring Boot", "https://github.com/alex");
        projectRepo.save(project);

        System.out.println("✅ Success: Data saved to the database!");
    }
}