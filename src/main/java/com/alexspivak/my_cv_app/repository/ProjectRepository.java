package com.alexspivak.my_cv_app.repository;

import com.alexspivak.my_cv_app.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // Spring magic happens here
}
