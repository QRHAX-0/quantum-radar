package entities;

import java.util.ArrayList;

public class Fine {
    private String plateNumber;
    private ArrayList<Violation> violations;

    public Fine(String plateNumber, ArrayList<Violation> violations) {
        this.plateNumber = plateNumber;
        this.violations = violations;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public ArrayList<Violation> getViolations() {
        return violations;
    }

    public int getTotalAmount() {
        int total = 0;
        for(Violation el:violations){
            total += el.getTotalPrice();
        }
        return total;
    }
}
