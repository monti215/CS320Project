package info;

import java.util.Date;

public class Appointment {
	private final String appointmentId;
	private Date appointmentDate;
	private String description;

	public Appointment(String appointmentId, Date appointmentDate, String description) {
		if (appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Invalid appointment ID");
		}
		if (appointmentDate == null || appointmentDate.before(new Date())) {
			throw new IllegalArgumentException("Invalid appointment date");
		}
		if (description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid description");
		}
		this.appointmentId = appointmentId;
		this.setAppointmentDate(appointmentDate);
		this.setDescription(description);
	}

	public String getAppointmentId() {
		return appointmentId;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
