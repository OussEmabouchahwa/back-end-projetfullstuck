package Service;

import Entity.Reservation;
import Entity.Room;
import Entity.User;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    Reservation createReservation(Reservation reservation);
    Optional<Reservation> findReservationById(Long id);
    List<Reservation> findAllReservations();
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Long id);
    List<Reservation> findReservationsByUser(User user);
    List<Reservation> findReservationsByRoom(Room room);
}
