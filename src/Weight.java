public class Weight
{
    private final int OUNCES_IN_A_POUND = 16;
    private int pounds;
    private double ounces;

    public Weight(int pounds, double ounces) {
        this.pounds = pounds;
        this.ounces = ounces;

        if (ounces >= OUNCES_IN_A_POUND) {
            normalize();
        }

    }

    private double toOunces() {
        return ((this.pounds * OUNCES_IN_A_POUND) + this.ounces);
    }

    private void normalize() {
        this.pounds = (int) (this.pounds + (this.ounces / OUNCES_IN_A_POUND));
        this.ounces = this.ounces % OUNCES_IN_A_POUND;
        System.out.println("from normalize(): " + this.ounces);
        return;
    }

    public boolean lessThan(Weight otherWeight) {
        if (this.toOunces() < otherWeight.toOunces()) {
            return true;
        } else {
            return false;
        }
    }

    public void addTo(Weight otherWeight) {
        this.ounces += otherWeight.toOunces();
        normalize();
        return;
    }

    public String toString() {
        return String.format("%d pounds and %.2f ounces", pounds, ounces);

    }

    public double getTotalOunces() {
        return this.toOunces();
    }
}
