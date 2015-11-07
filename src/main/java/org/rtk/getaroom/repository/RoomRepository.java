package org.rtk.getaroom.repository;

import org.rtk.getaroom.entity.Room;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RoomRepository extends
        PagingAndSortingRepository<Room, Long> {
}