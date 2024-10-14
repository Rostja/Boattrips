package com.tripsdev.BoatTrips.repo;

import com.tripsdev.BoatTrips.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Long> {


    List<Booking> findByRoomId(Long roomId);
    List<Booking> findByBookingConfigurationCode(String ConfigurationCode);
    List<Booking> findByUserId(Long userId);
}
