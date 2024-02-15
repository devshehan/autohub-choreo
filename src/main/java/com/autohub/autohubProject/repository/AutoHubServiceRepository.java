package com.autohub.autohubProject.repository;

import com.autohub.autohubProject.model.AHService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoHubServiceRepository extends JpaRepository<AHService,Long> {
}
