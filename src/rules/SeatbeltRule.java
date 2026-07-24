package rules;

import entities.Observation;
import entities.Violation;

public class SeatbeltRule implements RadarRule{

    @Override
     public Violation checkRule(Observation obs) {
        if(!obs.isSeatbeltFastened()) {
            return new Violation("Seatbelt not fastned", 100);
        }

        return null;
    }


}
