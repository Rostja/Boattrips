package com.tripsdev.BoatTrips.repo;

import com.tripsdev.BoatTrips.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface RoomRepository extends JpaRepository<Room,Long> {

    @Query("Select distinct r.roomType from Room r")
    List<String> findDistinctRoomTypes();

    @Query("Select r from Room r where r.roomType like %:roomType% AND r.id not in (select bk.room.id from Booking bk where" +
            "(bk.checkInDate <= :checkOutDate) and (bk.checkOutDate >= : checkInDate))")
    List<Room> findAvailableRoomsByDateAndTypes(LocalDate checkInDate, LocalDate checkOutDate, String roomType);

    @Query("Select r from r where r.id not in (select b.room.id from Booking b)")
    List<Room> getALlAvailableRooms();
}
