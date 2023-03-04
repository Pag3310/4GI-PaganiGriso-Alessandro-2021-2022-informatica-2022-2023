import java.util.*;

public class Sim {
  private String numero;
  private int creditoAttuale;
  private int creditoPrecedente; // new field
  private int consumoAttuale;

  private static final double consumoMax = 9999.99;
  private static final double costoMinInternet = 0.10;
  private int cicliConsumo;

  public Sim(Sim c) {
    this.numero = "0000000000";
    this.creditoAttuale = 0;
    this.creditoPrecedente = 0; // initialize to 0
    this.consumoAttuale = 0;
    this.cicliConsumo = 0;
  }

  public Sim(int creditoAttuale, String numero, int consumoAttuale, int cicliConsumo) {
    this.creditoAttuale = creditoAttuale;
    this.numero = numero;
    this.consumoAttuale = consumoAttuale;
    this.cicliConsumo = cicliConsumo;
    this.creditoPrecedente = 0; // initialize to 0
  }

  public void setNumero(String numero) {
    if (numero != null) {
      this.numero = numero;
    }
  }

  public void setCicliConsumo(int cicliConsumo) {
    if (cicliConsumo >= 0) {
      this.cicliConsumo = cicliConsumo;
    }
  }

  public void setCreditoAttuale(int creditoAttuale) {
    if (creditoAttuale >= 0) {
      // set the previous credit before updating the current credit
      this.creditoPrecedente = this.creditoAttuale;
      this.creditoAttuale = creditoAttuale;
    }
  }

  public int consumoAttuale() {
    int consumo = creditoPrecedente - creditoAttuale;
    double costo = consumo * costoMinInternet;
    System.out.println("Hai consumato " + consumo + " minuti di internet");
    System.out.println("Hai speso " + costo + " euro");
    return consumo;
  }

  public String getNumero() {
    return numero;
  }

  public static double getConsumomax() {
    return consumoMax;
  }

  public int getCicliConsumo() {
    return cicliConsumo;
  }

  public int getCreditoAttuale() {
    return creditoAttuale;
  }

  public int getCreditoPrecedente() {
    return creditoPrecedente;
  }

  public int getConsumoAttuale() {
    return consumoAttuale;
  }

  public static double getCostomininternet() {
    return costoMinInternet;
  }

  // metodo per connettersi a internet
  public void connessioneInternet(int tempoUtilizzo) {
    double costoConnessione = costoMinInternet * tempoUtilizzo;
    if (costoConnessione <= creditoAttuale) {
      creditoAttuale -= costoConnessione;
      consumoAttuale += tempoUtilizzo;
      System.out.println("Connessione avvenuta con successo!");
    } else {
      System.out.println("Credito insufficiente per la connessione richiesta!");
    }
  }
}
