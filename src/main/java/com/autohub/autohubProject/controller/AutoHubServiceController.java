package com.autohub.autohubProject.controller;

import com.autohub.autohubProject.model.AHService;
import com.autohub.autohubProject.service.AutoHubServiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/autohubservice")
@RequiredArgsConstructor
public class AutoHubServiceController {

    private final AutoHubServiceService autoHubServiceService;

    @PostMapping("/addService")
    public AHService createNewService(@RequestBody AHService ahService){
        return autoHubServiceService.addNewService(ahService);
    }

    @GetMapping("/getService/{id}")
    public AHService getServiceById(@PathVariable Long id){
        return autoHubServiceService.getServiceById(id);
    }
}
