import java.util.ArrayList;

public class Virus {
    private double infectability;
    private double mortality;
    private boolean[] susceptibilities;
    private int incubation;
    private int resistance;
    public Virus(double infectability, double mortality, boolean[] susceptibilities, int incubation, int resistance){
        this.infectability = infectability;
        this.mortality = mortality;
        this.susceptibilities = susceptibilities;
        this.incubation = incubation;
        this.resistance = resistance;
    }

    public double getInfectability() {
        return infectability;
    }

    public double getMortality() {
        return mortality;
    }

    public boolean[] getSusceptibilities() {
        return susceptibilities;
    }

    public int getIncubation() {
        return incubation;
    }

    public int getResistance() {
        return resistance;
    }

    


}
