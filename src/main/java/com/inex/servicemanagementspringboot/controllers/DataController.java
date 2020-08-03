package com.inex.servicemanagementspringboot.controllers;

import com.inex.servicemanagementspringboot.models.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;  

@RestController
public class DataController {

    @Autowired  
    DataService dataService;  

    @GetMapping("/api/servicetype")  
    private List<ServiceType> getAllServiceType(){
        return dataService.getAllServiceType();
    }
    
    @GetMapping("/api/servicetype/{id}")  
    private ServiceType getServiceType(@PathVariable("id") Long id){  
        return dataService.getServiceType(id);  
    }  

    @DeleteMapping("/api/servicetype/{id}")  
    private ServiceType deleteServiceType(@PathVariable("id") Long id){  
        ServiceType item = dataService.getServiceType(id);
        dataService.delete(id);
        return item;
    }

    @PostMapping("/api/servicetype")  
    private ServiceType saveStudent(@RequestBody ServiceType item){  
        dataService.saveOrUpdate(item);  
        return item ;
    }  
}