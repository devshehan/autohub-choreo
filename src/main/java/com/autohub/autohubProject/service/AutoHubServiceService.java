package com.autohub.autohubProject.service;

import com.autohub.autohubProject.model.AHService;
import com.autohub.autohubProject.repository.AutoHubServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
@RequiredArgsConstructor
public class AutoHubServiceService {

    private final AutoHubServiceRepository autoHubServiceRepository;

    // save new auto_hub service
    public AHService addNewService(AHService ahService) {
        return autoHubServiceRepository.save(ahService);
    }

    // if service id not found raise internal server error
    public AHService getServiceById(Long id) {
        return autoHubServiceRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(
                        HttpStatus.INTERNAL_SERVER_ERROR,"Service id not found"));
    }
}
