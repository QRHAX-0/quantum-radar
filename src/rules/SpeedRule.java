package rules;

import entities.CarType;
import entities.Observation;
import entities.Violation;

public class SpeedRule implements RadarRule{

    @Override
    public Violation checkRule(Observation obs) {
        if(obs.getCarType() == CarType.Truck && obs.getSpeed() > 60){
            return new Violation("speed of " + obs.getSpeed() + " exceeded max allowed 60", 300);
        } else if (obs.getCarType() == CarType.Private && obs.getSpeed() > 80) {
            return new Violation("speed of " + obs.getSpeed() + " exceeded max allowed 80", 300);
        }

        return null;
    }
}
