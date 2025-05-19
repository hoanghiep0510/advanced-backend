package org.hoanghiep.advanced_backend.domain.airport.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalTime;

@Data
@Builder
public class Airport {
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
