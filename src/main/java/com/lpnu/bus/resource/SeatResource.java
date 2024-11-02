package com.lpnu.bus.resource;

import com.lpnu.bus.dto.CreateSeatDTO;
import com.lpnu.bus.service.SeatService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/seat")
public class SeatResource {
    private final SeatService seatService;

    @PostMapping
    public void createSeat(@RequestBody CreateSeatDTO createSeatDTO){
        seatService.createSeat(createSeatDTO);
    }
}
