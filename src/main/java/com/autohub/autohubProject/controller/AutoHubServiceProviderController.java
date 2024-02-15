package com.autohub.autohubProject.controller;

import com.autohub.autohubProject.model.AHServiceProvider;
import com.autohub.autohubProject.service.AutoHubServiceProviderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/autohubserviceprovider")
@RequiredArgsConstructor
public class AutoHubServiceProviderController {

    private final AutoHubServiceProviderService autoHubServiceProviderService;

    @PostMapping("/addnewserviceprovider")
    public AHServiceProvider addNewServiceProvider(@RequestBody AHServiceProvider ahserviceProvider){
        return autoHubServiceProviderService.addNewServiceProvider(ahserviceProvider);
    }

    @GetMapping("getallserviceproviders")
    public List<AHServiceProvider> getAllServiceProviders(){
        return autoHubServiceProviderService.getAllServiceProviders();
    }

    @DeleteMapping("deleteserviceprovider/{id}")
    public void deleteServiceProvider(@PathVariable Long id){
        autoHubServiceProviderService.deleteServiceProvider(id);
    }
}
