package Test;

import org.junit.Test;

import info.Appointment;

import static org.junit.Assert.*;

import java.util.Date;

public class AppointmentTest {
	@Test
	public void testCreateAppointment() {
		Date futureDate = new Date(System.currentTimeMillis() + 86400000); // Tomorrow
		Appointment appointment = new Appointment("ABC123", futureDate, "Test Case");

		assertNotNull(appointment);
		assertEquals("ABC123", appointment.getAppointmentId());
		assertEquals(futureDate, appointment.getAppointmentDate());
		assertEquals("Test Case", appointment.getDescription());
	}
}
