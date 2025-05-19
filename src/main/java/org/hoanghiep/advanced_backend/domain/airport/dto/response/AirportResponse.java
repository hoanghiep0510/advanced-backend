package org.hoanghiep.advanced_backend.domain.airport.dto.response;

import lombok.Data;

import java.time.LocalTime;

@Data
public class AirportResponse {
    private String airportId;

    private String airportName;

    private String data;

    private String status;

    private long version;

    private LocalTime createdAt;

    private String createdBy;

    private LocalTime updatedAt;

    private String updatedBy;
}
