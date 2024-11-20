package Repositories;

import Entity.Reservation;
import Entity.Room;
import Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByUser(User user);
    List<Reservation> findByRoom(Room room);
}
