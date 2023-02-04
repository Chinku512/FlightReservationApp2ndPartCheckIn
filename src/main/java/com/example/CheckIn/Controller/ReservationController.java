package com.example.CheckIn.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.CheckIn.integration.ReservationRestfulClientImpl;
import com.example.CheckIn.integration.dto.Reservation;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationRestfulClientImpl restfulClient;
	
	@RequestMapping("/startCheckIn")
	public String startCheckIn() {
		return "startCheckIn";
	} 
	
	@RequestMapping("/proceedCheckIn")
	public String proceedChechIn(@RequestParam("id")Long id) {
		Reservation reservation = restfulClient.findReservation(id);
		System.out.println(reservation.getFlight().getId());
		System.out.println(reservation.getNumberOfBags());
		System.out.println(reservation.isCheckedIn());
		System.out.println(reservation.getPassenger());
		System.out.println(reservation.getFlight());
		return "welcome";
		
	}
}
