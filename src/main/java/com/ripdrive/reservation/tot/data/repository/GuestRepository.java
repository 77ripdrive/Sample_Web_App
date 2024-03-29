package com.ripdrive.reservation.tot.data.repository;


import com.ripdrive.reservation.tot.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository <Guest, Long> {
}