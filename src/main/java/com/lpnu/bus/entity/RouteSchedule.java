package com.lpnu.bus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RouteSchedule {
    private Long id;
    private Bus bus;
    private Route route;

    private LocalDate departureTime;
    private LocalDate arrivalTime;
}
