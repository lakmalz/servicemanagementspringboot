package com.inex.servicemanagementspringboot.controllers;

import java.util.ArrayList;
import java.util.List;

import com.inex.servicemanagementspringboot.models.*;
import com.inex.servicemanagementspringboot.repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataService{

    @Autowired  
    DataServiceRepository dataServiceRepository; 
     
    public List<ServiceType> getAllServiceType(){
        List<ServiceType> list = new ArrayList<ServiceType>();

        dataServiceRepository.findAll().forEach(item -> list.add(item));

        return list;
    }

    public ServiceType getServiceType(Long id){
        return dataServiceRepository.findById(id).get();
    }
    
    public void saveOrUpdate(ServiceType item){  
        dataServiceRepository.save(item);  
    }

    public void delete(Long id){  
        dataServiceRepository.deleteById(id);
    } 
}