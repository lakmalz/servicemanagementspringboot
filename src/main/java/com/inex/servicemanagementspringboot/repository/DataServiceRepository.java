package com.inex.servicemanagementspringboot.repository;
import com.inex.servicemanagementspringboot.models.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DataServiceRepository extends CrudRepository<ServiceType, Long>{
    
}