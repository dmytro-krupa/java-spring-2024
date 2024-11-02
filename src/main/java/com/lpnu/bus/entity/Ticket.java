package com.lpnu.bus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private User user;

    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime = LocalDateTime.now();
}
