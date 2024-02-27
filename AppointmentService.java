package info;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppointmentService {
	private List<Appointment> appointments;

	public AppointmentService() {
		this.appointments = new ArrayList<>();
	}

	public boolean addAppointment(String appointmentId, Date appointmentDate, String description) {
		for (Appointment appointment : appointments) {
			if (appointment.getAppointmentId().equals(appointmentId)) {
				return false; 
			}
		}

		if (appointmentDate.before(new Date())) {
			return false; 
		}

		if (description == null || description.length() > 50) {
			return false; 
		}

		Appointment newAppointment = new Appointment(appointmentId, appointmentDate, description);
		appointments.add(newAppointment);
		return true; 
	}

	public boolean deleteAppointment(String appointmentId) {
		for (Appointment appointment : appointments) {
			if (appointment.getAppointmentId().equals(appointmentId)) {
				appointments.remove(appointment);
				return true; 
			}
		}
		return false; 
	}
}
