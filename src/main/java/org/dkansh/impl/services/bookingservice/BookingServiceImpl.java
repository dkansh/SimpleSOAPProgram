package org.dkansh.impl.services.bookingservice;

import java.util.Random;

import org.dkansh.entities.booking.BookingRequestType;
import org.dkansh.entities.booking.BookingResponseType;
import org.dkansh.services.bookingservice.IBookingService;

public class BookingServiceImpl implements IBookingService {

	@Override
	public BookingResponseType bookTicket(BookingRequestType requestType) {
		BookingResponseType responseType = new BookingResponseType();
		responseType.setBookedCabinNumber(String.valueOf(new Random().nextInt(1000)));
		responseType.setBookingID(String.valueOf(new Random().nextInt(1000)));
		responseType.setComponentID(String.valueOf(new Random().nextInt(1000)));
		responseType.setBookingDate(requestType.getBookingDate());
		responseType.setBookingSource(requestType.getBookingSource());
		responseType.setBookingDestination(requestType.getBookingDestination());
		responseType.setPaxName(requestType.getPaxName());
		responseType.setPaxAge(requestType.getPaxAge());
		return responseType;
	}

}
