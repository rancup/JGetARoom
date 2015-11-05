package org.rtk.getaroom.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Building {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Column(unique=true)
    private String code;

    @OneToMany(targetEntity = Room.class)
    private List<Room> rooms;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
