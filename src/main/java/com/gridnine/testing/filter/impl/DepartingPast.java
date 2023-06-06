package com.gridnine.testing.filter.impl;

import com.gridnine.testing.filter.FlightFilter;
import com.gridnine.testing.flight.Flight;
import com.gridnine.testing.flight.Segment;

import java.time.LocalDateTime;

public class DepartingPast implements FlightFilter {


    @Override
    public boolean check(Flight flight) {
        for (Segment seg : flight.getSegments()) {
            if (seg.getDepartureDate().isBefore(LocalDateTime.now())) {
                return false;
            }
        }
        return true;
    }
}
