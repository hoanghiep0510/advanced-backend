package org.hoanghiep.advanced_backend.domain.airport.service.impl;


import lombok.RequiredArgsConstructor;
import org.hoanghiep.advanced_backend.domain.airport.dto.response.AirportResponse;
import org.hoanghiep.advanced_backend.domain.airport.mapper.AirportMapper;
import org.hoanghiep.advanced_backend.domain.airport.repository.AirportRepository;
import org.hoanghiep.advanced_backend.domain.airport.service.AirportService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AirportServiceImpl implements AirportService {

    private final AirportRepository airportRepository;
    private final AirportMapper airportMapper;

    public List<AirportResponse> getAll() {
        return airportRepository
                .findAll()
                .stream()
                .map(airportMapper::map)
                .toList();
    }

    @Override
    @Cacheable(cacheNames = "airports")
    public List<AirportResponse> getAllCache() {
        return airportRepository
                .findAll()
                .stream()
                .map(airportMapper::map)
                .toList();
    }
}
