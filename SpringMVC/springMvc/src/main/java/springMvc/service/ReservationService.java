package springMvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springMvc.dao.ReservationDao;
import springMvc.model.Reservation;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationDao dao;
	
	public int createReservation(Reservation reservation) {
		return this.dao.saveRegistration(reservation);
	}

}
