package com.lpnu.bus.repository;

import com.lpnu.bus.entity.Bus;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.ResourceAccessException;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BusRepository {
    private List<Bus> entityList = new ArrayList<>();
    private static Long ID = 1L;

    public Bus getBusById(long id) {
        return entityList.stream()
                .filter(e -> e.getId() == id)
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("Bus not found"));
    }

    public List<Bus> getBus() {
        return entityList;
    }

    public Bus save(Bus bus) {
        bus.setId(ID);
        entityList.add(bus);

        ++ID;

        return bus;
    }

    public Bus updateBus(Bus updatedBus) {
        Bus bus = entityList.stream()
                .filter(e -> e.getId() == updatedBus.getId())
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("Bus not found"));

        bus.setSeats(updatedBus.getSeats());
        bus.setRegistrationNumber(updatedBus.getRegistrationNumber());

        return bus;
    }

    public void deleteById(long id) {
        entityList.removeIf(e -> e.getId() == id);
    }
}
