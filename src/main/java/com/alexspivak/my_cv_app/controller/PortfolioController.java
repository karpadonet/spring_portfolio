package com.alexspivak.my_cv_app.controller;

import com.alexspivak.my_cv_app.model.Project;
import com.alexspivak.my_cv_app.model.Recommendation;
import com.alexspivak.my_cv_app.model.UserProfile;
import com.alexspivak.my_cv_app.repository.UserProfileRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class PortfolioController {

    private final UserProfileRepository profileRepo;
    // (Later we will add ProjectRepository here too)

    public PortfolioController(UserProfileRepository profileRepo) {
        this.profileRepo = profileRepo;
    }

    @GetMapping("/")
    public UserProfile getProfile() {
        // Find the first user in the database, or return null if empty
        return profileRepo.findAll().stream().findFirst().orElse(null);
    }
}

