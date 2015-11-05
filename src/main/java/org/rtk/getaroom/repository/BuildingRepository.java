package org.rtk.getaroom.repository;

import org.rtk.getaroom.entity.Building;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends CrudRepository<Building, Long> {
    public Building findBuildingByCode(String code);
}