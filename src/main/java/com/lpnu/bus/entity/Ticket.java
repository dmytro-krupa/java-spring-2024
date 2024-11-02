package com.lpnu.bus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    private User user;
    private RouteSchedule routeSchedule;
    private Seat seat;
}
