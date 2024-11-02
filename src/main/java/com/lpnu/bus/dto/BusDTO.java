package com.lpnu.bus.dto;

import com.lpnu.bus.entity.Bus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusDTO {
    private Long id;
    private String registrationNumber;
    private List<SeatDTO> seats;

    public static BusDTO fromBus(Bus bus){
        final BusDTO busDTO = new BusDTO();

        busDTO.setId(bus.getId());
        busDTO.setRegistrationNumber(bus.getRegistrationNumber());
        busDTO.setSeats(bus.getSeats().stream()
                .map(SeatDTO::fromEntity)
                .collect(Collectors.toList()));

        return busDTO;
    }
}
