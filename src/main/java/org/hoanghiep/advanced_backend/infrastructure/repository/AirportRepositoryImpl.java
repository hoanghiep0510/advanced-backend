package org.hoanghiep.advanced_backend.infrastructure.repository;

import net.datafaker.Faker;
import org.hoanghiep.advanced_backend.domain.airport.entity.Airport;
import org.hoanghiep.advanced_backend.domain.airport.repository.AirportRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AirportRepositoryImpl implements AirportRepository {
    @Override
    public List<Airport> findAll() {
        Faker faker = new Faker();
        List<Airport> airports = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            airports.add(Airport.builder()
                    .airportId(String.valueOf(i))
                    .airportName(faker.aviation().airportName())
                    .version(1)
                    .status(faker.aviation().flightStatus())
                    .data(faker.aviation().flight())
                    .createdAt(LocalTime.now())
                    .updatedAt(LocalTime.now())
                    .createdBy(faker.name().name())
                    .build());
        }
        return airports;
    }
}
