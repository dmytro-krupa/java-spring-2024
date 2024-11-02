package com.lpnu.bus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seat {
    private Long id;
    private String name;
    private int bookingPrice;
    private Bus bus;
}
