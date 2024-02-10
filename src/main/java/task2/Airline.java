package task2;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;
import java.util.Scanner;

public class Airline {
    private Scanner scanner = new Scanner(System.in);
    private String destiny;
    private int flightId;
    private String planeType;
    private LocalDateTime takeOffPlane;
    private String dayOfWeek;

    public Airline(String destiny, int flightId, String planeType, LocalDateTime takeOffPlane, String dayOfWeek) {
        this.destiny = destiny;
        this.flightId = flightId;
        this.planeType = planeType;
        this.takeOffPlane = takeOffPlane;
        this.dayOfWeek = dayOfWeek;
    }

    public Airline() {
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public void setTakeOffPlane(LocalDateTime takeOffPlane) {
        this.takeOffPlane = takeOffPlane;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getDestiny() {
        return destiny;
    }

    public int getFlightId() {
        return flightId;
    }

    public String getPlaneType() {
        return planeType;
    }

    public LocalDateTime getTakeOffPlane() {
        return takeOffPlane;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destiny='" + destiny + '\'' +
                ", flightId=" + flightId +
                ", planeType='" + planeType + '\'' +
                ", takeOffPlane=" + takeOffPlane +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                '}';
    }
}
