package com.lpnu.bus.dto;

import com.lpnu.bus.entity.Seat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatDTO {
    private long id;
    private String name;
    private int bookingPrice;

    public static SeatDTO fromEntity(Seat seat){
        final SeatDTO seatDTO = new SeatDTO();

        seatDTO.setId(seat.getId());
        seatDTO.setName(seat.getName());
        seatDTO.setBookingPrice(seat.getBookingPrice());

        return seatDTO;
    }
}
