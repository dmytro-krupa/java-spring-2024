package com.lpnu.bus.repository;

import com.lpnu.bus.entity.Seat;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.ResourceAccessException;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SeatRepository {
    private List<Seat> entityList = new ArrayList<>();
    private static Long ID = 1L;

    public Seat getSeatById(long id) {
        return entityList.stream()
                .filter(e -> e.getId() == id)
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("Seat not found"));
    }

    public List<Seat> getSeat() {
        return entityList;
    }

    public Seat save(Seat seat) {
        seat.setId(ID);
        entityList.add(seat);

        ++ID;

        return seat;
    }

    public Seat updateBus(Seat updatedSeat) {
        Seat bus = entityList.stream()
                .filter(e -> e.getId() == updatedSeat.getId())
                .findAny()
                .orElseThrow(() -> new ResourceAccessException("Seat not found"));

        bus.setName(updatedSeat.getName());
        bus.setBus(updatedSeat.getBus());
        bus.setBookingPrice(updatedSeat.getBookingPrice());

        return bus;
    }

    public void deleteById(long id) {
        entityList.removeIf(e -> e.getId() == id);
    }
}
