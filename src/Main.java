import entities.CarType;
import entities.Fine;
import entities.Observation;
import entities.Violation;
import rules.SeatbeltRule;
import rules.SpeedRule;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Radar radar = new Radar();
        radar.addRule(new SeatbeltRule());
        radar.addRule(new SpeedRule());
        Observation obs = new Observation("ABC1234", CarType.Private, 94, LocalDate.now(), false);
        radar.processObservation(obs);

        for (Fine fine : radar.getAllFines()) {
            System.out.println("Traffic fine for car " + fine.getPlateNumber());
            System.out.println("Total amount: " + fine.getTotalAmount() + " EGP");
            System.out.println("Violations:");
            for (Violation v : fine.getViolations()) {
                System.out.println(v);
            }
        }
    }
}
