package com.lpnu.bus.repository;

import com.lpnu.bus.entity.BusStation;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.ResourceAccessException;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BusStationRepository {
    private List<BusStation> entityList = new ArrayList<>();
    private static Long ID = 1L;

    public BusStation getBusStationById(long id) {
        return entityList.stream()
                .filter(e -> e.getId() == id)
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("Bus Station not found"));
    }

    public List<BusStation> getBusStation() {
        return entityList;
    }

    public BusStation save(BusStation busStation) {
        busStation.setId(ID);
        entityList.add(busStation);

        ++ID;

        return busStation;
    }

    public BusStation updateBusStation(BusStation updatedBusStation) {
        BusStation busStation = entityList.stream()
                .filter(e -> e.getId() == updatedBusStation.getId())
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("Bus Station not found"));

        busStation.setName(updatedBusStation.getName());
        busStation.setAddress(updatedBusStation.getAddress());

        return busStation;
    }

    public void deleteById(long id) {
        entityList.removeIf(e -> e.getId() == id);
    }
}
