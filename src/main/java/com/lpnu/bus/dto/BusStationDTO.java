package com.lpnu.bus.dto;

import com.lpnu.bus.entity.BusStation;
import com.lpnu.bus.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusStationDTO {
    private long id;
    private String address;
    private String name;

    public static BusStationDTO fromBusStation(BusStation busStation){
        final BusStationDTO busStationDTO = new BusStationDTO();

        busStationDTO.setId(busStation.getId());
        busStationDTO.setName(busStation.getName());
        busStationDTO.setAddress(busStation.getAddress());

        return busStationDTO;
    }
}
