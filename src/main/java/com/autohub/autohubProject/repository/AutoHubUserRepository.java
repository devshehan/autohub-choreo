package com.autohub.autohubProject.repository;

import com.autohub.autohubProject.model.AHUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoHubUserRepository extends JpaRepository<AHUser,Long> {
}
