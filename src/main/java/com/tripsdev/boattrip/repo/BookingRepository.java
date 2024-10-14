package com.tripsdev.boattrip.repo;

import com.tripsdev.boattrip.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking,Long> {


    List<Booking> findByRoomId(Long roomId);
    List<Booking> findByBookingConfigurationCode(String configurationCode);
    List<Booking> findByUserId(Long userId);
}
