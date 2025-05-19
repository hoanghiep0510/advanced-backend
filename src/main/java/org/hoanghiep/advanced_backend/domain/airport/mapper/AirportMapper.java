package org.hoanghiep.advanced_backend.domain.airport.mapper;


import org.hoanghiep.advanced_backend.domain.airport.dto.response.AirportResponse;
import org.hoanghiep.advanced_backend.domain.airport.entity.Airport;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AirportMapper {
    AirportResponse map(Airport airport);
}
