package org.hoanghiep.advanced_backend.domain.airport.repository;


import org.hoanghiep.advanced_backend.domain.airport.entity.Airport;

import java.util.List;

public interface AirportRepository {
    List<Airport> findAll();
}
