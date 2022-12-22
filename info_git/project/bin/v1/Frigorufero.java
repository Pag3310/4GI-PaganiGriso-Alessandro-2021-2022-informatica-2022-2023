public class Frigorifero {
    private String marca;
    private String modello;
    private int litriFrigo;
    private int litriFrizer;
    private double prezzo;
    private boolean acceso;
    private double consumokwat;
    private int temperaturaFrigo;
    private int temperaturaFrizer;

    public Frigorifero(String marca, String modello, int litriFrigo, int litriFrizer, double prezzo, double consumokwat, int temperaturaFrigo, int temperaturaFrizer) {
        this.marca = marca;
        this.modello = modello;
        this.litriFrigo = litriFrigo;
        this.litriFrizer = litriFrizer;
        this.prezzo = prezzo;
        this.consumokwat = consumokwat;
        this.temperaturaFrigo = temperaturaFrigo;
        this.temperaturaFrizer = temperaturaFrizer;
        this.acceso = false;
    }

    public void accendi() {
        this.acceso = true;
        System.out.println("Il frigorifero è stato acceso.");
    }

    public void spegni() {
        this.acceso = false;
        System.out.println("Il frigorifero è stato spento.");
    }

    public void aumentaTemperaturaFrigo(int gradi) {
        this.temperaturaFrigo += gradi;
        System.out.println("La temperatura del frigorifero è stata aumentata di " + gradi + " gradi.");
    }

    public void diminuisciTemperaturaFrigo(int gradi) {
        this.temperaturaFrigo -= gradi;
        System.out.println("La temperatura del frigorifero è stata diminuita di " + gradi + " gradi.");
    }

    public void aumentaTemperaturaFrizer(int gradi) {
        this.temperaturaFrizer += gradi;
        System.out.println("La temperatura del freezer è stata aumentata di " + gradi + " gradi.");
    }

    public void diminuisciTemperaturaFrizer(int gradi) {
        this.temperaturaFrizer -= gradi;
        System.out.println("La temperatura del freezer è stata diminuita di " + gradi + " gradi.");
    }
}
