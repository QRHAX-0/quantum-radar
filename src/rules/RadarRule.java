package rules;

import entities.Observation;
import entities.Violation;

public interface RadarRule {
    Violation checkRule(Observation obs);
}
