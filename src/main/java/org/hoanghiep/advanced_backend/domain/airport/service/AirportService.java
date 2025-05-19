package org.hoanghiep.advanced_backend.domain.airport.service;

import org.hoanghiep.advanced_backend.domain.airport.dto.response.AirportResponse;

import java.util.List;

public interface AirportService {
    List<AirportResponse> getAll();
}
