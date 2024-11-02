package com.lpnu.bus.service.impl;

import com.lpnu.bus.dto.CreateSeatDTO;
import com.lpnu.bus.dto.SeatDTO;
import com.lpnu.bus.entity.Bus;
import com.lpnu.bus.entity.Seat;
import com.lpnu.bus.repository.BusRepository;
import com.lpnu.bus.repository.SeatRepository;
import com.lpnu.bus.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SeatServiceImpl implements SeatService {
    private final SeatRepository seatRepository;
    private final BusRepository busRepository;

    @Override
    public void createSeat(CreateSeatDTO createSeatDTO) {
        Bus bus = busRepository.getBusById(createSeatDTO.getBusId());

        Seat seat = new Seat();

        seat.setName(createSeatDTO.getName());
        seat.setBookingPrice(createSeatDTO.getBookingPrice());
        seat.setBus(bus);
        bus.getSeats().add(seat);

        seatRepository.save(seat);
    }
}
