
public class calcoloBagaglio {
    private static final double COSTO_PER_KG = 5.00;
    private static final double SOVRAPPREZZO = 10.00;
    private Bagaglio bag;
    private boolean sovrapprezzo;

    public calcoloBagaglio() {
        bag = new Bagaglio();
    }

    public void start() {
        this.descriviAttività();
        this.prendiInput();
        this.calcolaPrezzo();
        this.visualizzaRisultati();
    }

    public double calcolaPrezzo() {
        if (bag < 0) {
            if (this.sovrapprezzo) {

            }
        }

    }

    public void descriviAttività() {

    }

    public void prendiInput() {

        bag.setWeight(e.nextDouble());

    }

    public void visualizzaRisultati() {

    }
}
