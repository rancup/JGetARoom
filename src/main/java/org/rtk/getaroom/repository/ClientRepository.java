package org.rtk.getaroom.repository;

import org.rtk.getaroom.entity.Building;
import org.rtk.getaroom.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource
public interface ClientRepository extends
        PagingAndSortingRepository<Client, Long> {
}