package com.lpnu.bus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bus {
    private Long id;
    private String registrationNumber;
    private List<Seat> seats = new ArrayList<>();
}
