package org.hoanghiep.advanced_backend.api;

import org.hoanghiep.advanced_backend.domain.airport.dto.response.AirportResponse;
import org.hoanghiep.advanced_backend.domain.airport.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping("/list")
    List<AirportResponse> list() {
        return airportService.getAll();
    }

    @GetMapping("/list-cache")
    List<AirportResponse> listCache() {
        return airportService.getAllCache();
    }
}