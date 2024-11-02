package com.lpnu.bus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Route {
    private Long id;
    private String name;
    private Map<Integer, BusStation> busStations = new HashMap<>(); //<Order, BusStation>
    private List<RouteSchedule> scheduleList = new ArrayList<>();
}
