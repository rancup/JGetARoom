package org.rtk.getaroom.repository;

import org.rtk.getaroom.entity.Building;
import org.rtk.getaroom.entity.Time;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@RepositoryRestResource
public interface TimeRepository extends
        PagingAndSortingRepository<Time, Long> {
}