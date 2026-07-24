import entities.Fine;
import entities.Observation;
import entities.Violation;
import rules.RadarRule;

import java.util.ArrayList;
import java.util.HashMap;

public class Radar {
    private ArrayList<RadarRule> rules = new ArrayList<>();
    private ArrayList<Fine> allFines = new ArrayList<>();
    private HashMap<String, Integer> violationsCount = new HashMap<>();


    public void processObservation(Observation obs) {
        ArrayList<Violation> violations=new ArrayList<>();
        for (RadarRule rule : rules) {

            Violation violation = rule.checkRule(obs);

            if (violation != null) {
                violations.add(violation);
                String info = violation.getViolationInfo();
                int currentCount = violationsCount.getOrDefault(info, 0);
                violationsCount.put(info, currentCount + 1);

            }
        }
        if(!violations.isEmpty()){
            Fine fine = new Fine(obs.getPlateNumber(), violations);
            allFines.add(fine);
        }
    }

    public ArrayList<Fine> getAllFines() {
        return allFines;
    }

    public HashMap<String, Integer> getViolationsCount() {
        return violationsCount;
    }

    public ArrayList<RadarRule> getRules() {
        return rules;
    }

    public void addRule(RadarRule rule) {
        this.rules.add(rule);
    }
}

