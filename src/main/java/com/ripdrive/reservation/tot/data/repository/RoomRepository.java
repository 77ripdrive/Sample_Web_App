package com.ripdrive.reservation.tot.data.repository;

import com.ripdrive.reservation.tot.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository <Room, Long> {
    Room findByNumber(String number);
}
