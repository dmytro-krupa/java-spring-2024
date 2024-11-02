package com.lpnu.bus.service;

import com.lpnu.bus.dto.BusDTO;

public interface BusService {
    BusDTO createBus(BusDTO busDTO);
    BusDTO getBusById(Long id);
}
