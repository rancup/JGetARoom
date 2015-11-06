package org.rtk.getaroom.repository;

import org.rtk.getaroom.entity.Building;
import org.rtk.getaroom.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface RoomRepository extends
        PagingAndSortingRepository<Room, Long> {
}