package com.alexspivak.my_cv_app.repository;

import com.alexspivak.my_cv_app.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {
}
