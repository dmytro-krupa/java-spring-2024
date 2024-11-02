package com.lpnu.bus.dto;

import com.lpnu.bus.entity.Seat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateSeatDTO {
    private String name;
    private int bookingPrice;
    private Long busId;
}
