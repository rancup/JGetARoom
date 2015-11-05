package org.rtk.getaroom.web.api.v1;

import org.rtk.getaroom.entity.Building;
import org.rtk.getaroom.repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * /api/v1/building
 */
@RestController
public class BuildingController {
    @Autowired
    private BuildingRepository buildingRepository;

    @RequestMapping(value = Routes.buildingSingle, method =
            RequestMethod.GET)
    @ResponseBody
    public Building building(@PathVariable(value = "code") String code) {
        return buildingRepository.findBuildingByCode(code);
    }

    @RequestMapping(value = Routes.building, method = RequestMethod.GET)
    @ResponseBody
    public Iterable<Building> getAllBuildings() {
        return buildingRepository.findAll();
    }

}
