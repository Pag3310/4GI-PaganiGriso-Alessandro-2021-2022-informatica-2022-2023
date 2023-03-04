import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.*;

public class SimManager {

    private ArrayList<Sim> lista;
    private static final double costoMinInternet = 0.10;

    public SimManager() {
        lista = new ArrayList<Sim>();
    }

    public SimManager(ArrayList<Sim> lis) {
        lista = new ArrayList<Sim>();
        if (lis != null) {
            for (Sim c : lis) {
                lista.add(new Sim(c));
            }
        }
    }

    public void start() {
        descriviApp();
        inputDati();
        visualizzaRisultati();
        scriviFile();
    }

    public void descriviApp() {
        String out = "";
        out += "L'applicazione prende i dati storici dei contatori \n";
        out += "ed elabora la bolletta dei consumi di ogni Sim \n";
        out += "dopo aver preso in ingresso le nuove letture dei consumi. ";
        System.out.println(out);
    }

    public void inputDati() {
        Scanner s = new Scanner(System.in);
        double inp;
        System.out.println("Dammi il nome del file con i dati storici");
        String fileN = s.next();
        if (fileN != null) {
            leggiFile(fileN);
        }
    }

    public void visualizzaRisultati() {
        double ris;
        for (Sim c : lista) {
            ris = c.consumoAttuale();
            System.out.println("\nI valori del Sim sono: \n" + c.toString() + "\n");
            System.out.println("Il consumo risulta: " + ris + "\n");
            System.out.println("L'importo al minuto è: " + costoMinInternet + "\n");
            System.out.println("L'importo della bolletta è: " + ris * costoMinInternet);
        }
    }

    public void leggiFile(String fileName) {
        String data;
        String[] valori;
        File myObj;
        if (fileName != null) {
            try {
                myObj = new File(fileName);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNext()) {
                    data = myReader.next();
                    valori = data.split(";");
                    memorizzaSimNellaLista(valori);
                }
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
            }
        }
    }

    public void scriviFile() {
        Scanner s = new Scanner(System.in);
        FileWriter fileOut = null;
        double inp;
        System.out.println("Dammi il nome del file con i dati storici");
        String fileN = s.next();
        if (fileN != null) {
            try {
                // apre il file in scrittura
                fileOut = new FileWriter(fileN);
                String str;
                for (Sim c : c.lista) {
                    str = "" + c.getCreditoPrecedente() + ";" + c.getCreditoAttuale() + ";";
                    str += +c.getConsumoAttuale() + '\n';
                    fileOut.write(str);
                }
                fileOut.close(); // chiude il file
            } catch (Exception e) {
                System.out.println("An error occurred.");
            }
        }
        System.out.println("\nBye bye!");
    }

    public void memorizzaSimNellaLista(String[] valori) {
        try {
            int creditoAttuale = Integer.parseInt(valori[0]);
            String numero = valori[1];
            int consumoAttuale = Integer.parseInt(valori[2]);
            int cicliConsumo = Integer.parseInt(valori[3]);
            lista.add(new Sim(creditoAttuale, numero, consumoAttuale, cicliConsumo));
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Dati non validi");
        }
    }

    public void effettuaChiamata(int durata) {
        if (durata < 0) {
            System.out.println("La durata della chiamata deve essere maggiore o uguale a zero.");
            return;
        }
        if (durata > c.creditoAttuale) {
            System.out.println("Credito insufficiente per effettuare la chiamata.");
            return;
        }
        c.creditoAttuale -= durata;
        c.consumoAttuale += durata;
        c.cicliConsumo++;
    }

    public void connettiInternet(float minuti) {
        if (minuti < 0) {
            System.out.println("Il numero di minuti deve essere maggiore o uguale a zero.");
            return;
        }
        if (minuti > c.creditoAttuale) {
            System.out.println("Credito insufficiente per connettersi a internet.");
            return;
        }
        double consumo = minuti * costoMinInternet;
        if (c.consumoAttuale + consumo > consumoMax) {
            System.out.println("Il consumo massimo è stato raggiunto, non è possibile connettersi a internet.");
            return;
        }
        c.creditoAttuale -= minuti;
        c.consumoAttuale += consumo;
        c.cicliConsumo++;
    }

    public String toString() {
        String res = "Numero: " + c.numero + "\n";
        res += "Credito attuale: " + c.creditoAttuale + "\n";
        res += "Consumo attuale: " + c.consumoAttuale + "\n";
        res += "Cicli di consumo: " + c.cicliConsumo;
        return res;
    }
}


        
        
        
        
