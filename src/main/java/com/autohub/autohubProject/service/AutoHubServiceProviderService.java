package com.autohub.autohubProject.service;

import com.autohub.autohubProject.model.AHServiceProvider;
import com.autohub.autohubProject.repository.AutoHubServiceProviderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AutoHubServiceProviderService {

    private final AutoHubServiceProviderRepository autoHubServiceProviderRepository;
    public AHServiceProvider addNewServiceProvider(AHServiceProvider ahserviceProvider) {
        return autoHubServiceProviderRepository.save(ahserviceProvider);
    }
    public List<AHServiceProvider> getAllServiceProviders() {
        return autoHubServiceProviderRepository.findAll();
    }
    public void deleteServiceProvider(Long id) {
        autoHubServiceProviderRepository.deleteById(id);
    }
}
