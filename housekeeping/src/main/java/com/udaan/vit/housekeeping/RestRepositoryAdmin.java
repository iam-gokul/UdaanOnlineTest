package com.udaan.vit.housekeeping;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RestRepositoryAdmin extends CrudRepository<Admin,Long> {


}

