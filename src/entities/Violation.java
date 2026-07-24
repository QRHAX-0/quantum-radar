package entities;

public class Violation {
    private String violationInfo;
    private int totalPrice;

    public Violation(String violationInfo, int totalPrice) {
        this.violationInfo = violationInfo;
        this.totalPrice = totalPrice;
    }

    public String getViolationInfo() {
        return violationInfo;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString(){
        String res = String.format("- %s : %d EGP", violationInfo, totalPrice);
        return res;
    }
}
