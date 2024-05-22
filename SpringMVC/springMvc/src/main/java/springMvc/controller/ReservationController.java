package springMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springMvc.model.Reservation;
import springMvc.service.ReservationService;

@RequestMapping("/reservation")
@Controller
public class ReservationController {
	@Autowired
	private ReservationService  reservationService;
	
	@ModelAttribute
	public void commanData(Model model) {
		model.addAttribute("msg", "ReservationForm");
		
	}

	@RequestMapping("/bookingForm")
	public String bookingForm(Model model) {
		// create a reservation object
		Reservation res = new Reservation();
		// provide reservation object to the model
		model.addAttribute("reservation", res);
		return "reservation-page";
	}

	@RequestMapping("/submitForm")
	public String submitForm(@ModelAttribute Reservation res, Model model) {
		
		int createReservation=this.reservationService.createReservation(res);
		model.addAttribute("FNAME", res);
		return "confirmation-form";
	}
}