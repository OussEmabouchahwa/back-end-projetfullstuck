package Service;

import Repositories.ReservationRepository;
import Entity.Reservation;
import Entity.Room;
import Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    @Override
    public Reservation createReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Optional<Reservation> findReservationById(Long id) {
        return reservationRepository.findById(id);
    }

    @Override
    public List<Reservation> findAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public List<Reservation> findReservationsByUser(User user) {
        return reservationRepository.findByUser(user);
    }

    @Override
    public List<Reservation> findReservationsByRoom(Room room) {
        return reservationRepository.findByRoom(room);
    }
}
