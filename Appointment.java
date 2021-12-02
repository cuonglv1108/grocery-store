import java.util.Scanner;
public class Appointment {
    protected String appointmentID;
    protected String doctorName;
    protected double startTime;
    protected double endTime;

    public Appointment(String appointmentID, String doctorName, double startTime, double endTime) {
        super();
        this.appointmentID = appointmentID;
        this.doctorName = doctorName;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Appointment(String appointmentID, Appointment base){
        super();
        this.appointmentID = base.appointmentID;
        this.doctorName = base.doctorName;
        this.startTime = base.startTime;
        this.endTime = base.endTime;
    }
    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }
    public Appointment clone(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the appointment: ");
        String apID = scanner.nextLine();
        return new Appointment(apID, this);
    }
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }
}
