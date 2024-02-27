package Test;
import org.junit.Before;
import org.junit.Test;

import info.AppointmentService;

import static org.junit.Assert.*;

import java.util.Date;

public class AppointmentServiceTest {
	private AppointmentService appointmentService;

	@Before
	public void setUp() {
		appointmentService = new AppointmentService();
	}

	@Test
	public void testAddAppointment() {
		Date futureDate = new Date(System.currentTimeMillis() + 86400000); // Tomorrow

		assertTrue(appointmentService.addAppointment("ABC123", futureDate, "Test Case"));
		assertFalse(appointmentService.addAppointment("ABC123", futureDate, "Duplicate Appointment"));
		assertFalse(appointmentService.addAppointment("ABC123", new Date(), "Invalid Date"));
		assertFalse(appointmentService.addAppointment("ABC123", futureDate, null));
		assertFalse(appointmentService.addAppointment("ABC123", futureDate, "This is a very very very long description to go over 50 characters so that it will tell us that it is invalid."));
	}

	@Test
	public void testDeleteAppointment() {
		Date futureDate = new Date(System.currentTimeMillis() + 86400000); // Tomorrow
		appointmentService.addAppointment("ABC123", futureDate, "Test Case");

		assertTrue(appointmentService.deleteAppointment("ABC123"));
		assertFalse(appointmentService.deleteAppointment("NonExistentID"));
	}
}
