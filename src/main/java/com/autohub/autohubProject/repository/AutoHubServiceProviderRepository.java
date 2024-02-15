package com.autohub.autohubProject.repository;

import com.autohub.autohubProject.model.AHServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoHubServiceProviderRepository extends JpaRepository<AHServiceProvider,Long> {
}
