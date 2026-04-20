package com.alexspivak.my_cv_app.controller;

import com.alexspivak.my_cv_app.model.Project;
import com.alexspivak.my_cv_app.model.Recommendation;
import com.alexspivak.my_cv_app.model.UserProfile;
import com.alexspivak.my_cv_app.repository.UserProfileRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@Controller
public class PortfolioController {

    private final UserProfileRepository profileRepo;
    // (Later we will add ProjectRepository here too)

    public PortfolioController(UserProfileRepository profileRepo) {
        this.profileRepo = profileRepo;
    }

    @GetMapping("/")
    public String getProfile(Model model) { // Now returns a String (the file name)
        UserProfile profile = profileRepo.findAll().stream().findFirst().orElse(null);

        // This "injects" the data into the HTML page
        model.addAttribute("profile", profile);

        return "index"; // This looks for a file named index.html in /templates
    }
}

