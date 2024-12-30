package com.hastycode.DakarHotel.repo;

import com.hastycode.DakarHotel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
     
}
