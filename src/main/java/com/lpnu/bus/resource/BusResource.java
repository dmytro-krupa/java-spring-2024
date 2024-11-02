package com.lpnu.bus.resource;

import com.lpnu.bus.dto.BusDTO;
import com.lpnu.bus.service.BusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/bus")
public class BusResource {
    private final BusService busService;

    @GetMapping("/{id}")
    public BusDTO getBusById(@PathVariable Long id){
        return busService.getBusById(id);
    }

    @PostMapping
    public BusDTO createBus(@RequestBody BusDTO busDTO){
        return busService.createBus(busDTO);
    }
}
