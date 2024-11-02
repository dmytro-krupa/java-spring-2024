package com.lpnu.bus.service.impl;

import com.lpnu.bus.dto.BusDTO;
import com.lpnu.bus.entity.Bus;
import com.lpnu.bus.repository.BusRepository;
import com.lpnu.bus.service.BusService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BusServiceImpl implements BusService {
    private final BusRepository busRepository;

    @Override
    public BusDTO createBus(BusDTO busDTO) {
        Bus bus = new Bus();

        bus.setRegistrationNumber(busDTO.getRegistrationNumber());

        busRepository.save(bus);

        return BusDTO.fromBus(bus);
    }

    @Override
    public BusDTO getBusById(Long id) {
        return BusDTO.fromBus(busRepository.getBusById(id));
    }
}
