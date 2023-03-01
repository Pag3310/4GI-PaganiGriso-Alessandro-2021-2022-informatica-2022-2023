import java.util.*;

public class Sim {
  private String numero;
  private int creditoAttuale;
  private int consumoAttuale;
  private static final float costoMinInternet = 0.10;
  private static final double consumoMax = 9999.99;
  private int cicliConsumo;

  public Sim() {
    this.numero = "0000000000";
    this.creditoAttuale = 0;
    this.consumoAttuale = 0;
    this.cicliConsumo = 0;
  }

  public Sim(double a) {

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
      this.creditoAttuale = creditoAttuale;
    }
  }

  public void setConsumoAttuale(int consumoAttuale) {
    if (consumoAttuale >= 0) {
      this.consumoAttuale = consumoAttuale;
    }
  }

  public int getNumero() {
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

  public int getConsumoAttuale() {
    return consumoAttuale;
  }

  public static float getCostomininternet() {
    return costoMinInternet;
  }

}
