
import java.util.*;

public class BagaglioPrezzoCalculator {
    private static final double COSTO_PER_KG = 5.00;
   
    private static final double SOVRAPPREZZO = 10.00;
    private Bagaglio bag;

    public BagaglioPrezzoCalculator() {
        bag = new Bagaglio();
    }

    public void start() {
        this.descriviAttivit√†();
        this.prendiInput();
        double p = this.calcolaPrezzo();
        this.visualizzaRisultati(p);
    }

    public double calcolaPrezzo() {
        double out = bag.getWeight() * COSTO_PER_KG;
        if (bag.sovrapprezzoW()) {
            out += SOVRAPPREZZO;
        }
        if (bag.sovrapprezzoD()) {
            out += SOVRAPPREZZO;
        }
        return out;
    }

    public void descriviAttivit√†() {
        System.out.println("questo programma calcola il prezzo dei bagagli");
    }

    public void prendiInput() {
        Scanner E = new Scanner(System.in);
        System.out.println("inserire peso bagaglio: ");
        bag.setWeight(E.nextDouble());
    }

    public void visualizzaRisultati(double r) {
        System.out.println(bag.toString() + "quindi il costo del bagaglio √®: " + r);
    }
}
