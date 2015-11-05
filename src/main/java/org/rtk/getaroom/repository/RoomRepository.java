package org.rtk.getaroom.repository;

import org.rtk.getaroom.entity.Building;
import org.rtk.getaroom.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
//    public List<Room> findRoomsByBuilding(String code);
}
