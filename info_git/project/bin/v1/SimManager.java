import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.*;

public class SimManager {

    private ArrayList<Sim> lista;
    private static final double COSTO = 2.5;

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
            ris = c.calcolaBolletta();
            System.out.println("\nI valori del Sim sono: \n" + c.toString() + "\n");
            System.out.println("Il consumo risulta: " + ris + "\n");
            System.out.println("L'importo del gas a mq: " + COSTO + "\n");
            System.out.println("L'importo della bolletta è: " + ris * COSTO);
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
                for (Sim c : this.lista) {
                    str = "" + c.getConsumiPrec() + ";" + c.getConsumiAtt() + ";";
                    str += +c.calcolaBolletta() + '\n';
                    fileOut.write(str);
                }
                fileOut.close(); // chiude il file
            } catch (Exception e) {
                System.out.println("An error occurred.");
            }
        }
        System.out.println("\nBye bye!");
    }

    public void memorizzaSimNellaLista(String[] public void memorizzaSimNellaLista(String[] valori) {
        try {
        int cont = Integer.parseInt(valori[0]);
        double prec = Double.parseDouble(valori[1]);
        double att = Double.parseDouble(valori[2]);
        if (cont > 0 && prec >= 0 && att >= 0) {
        lista.add(new Sim(cont, prec, att));
        } else {
        System.out.println("Dati non validi");
        }
        } catch (NumberFormatException e) {
        System.out.println("Dati non validi");
        }
    }
    public void effettuaChiamata(int durata) {
        if (durata < 0) {
        System.out.println("La durata della chiamata deve essere maggiore o uguale a zero.");
        return;
        }
        if (durata > this.creditoAttuale) {
        System.out.println("Credito insufficiente per effettuare la chiamata.");
        return;
        }
        this.creditoAttuale -= durata;
        this.consumoAttuale += durata;
        this.cicliConsumo++;
        }
        
        public void connettiInternet(float minuti) {
        if (minuti < 0) {
        System.out.println("Il numero di minuti deve essere maggiore o uguale a zero.");
        return;
        }
        if (minuti > this.creditoAttuale) {
        System.out.println("Credito insufficiente per connettersi a internet.");
        return;
        }
        double consumo = minuti * costoMinInternet;
        if (this.consumoAttuale + consumo > consumoMax) {
        System.out.println("Il consumo massimo è stato raggiunto, non è possibile connettersi a internet.");
        return;
        }
        this.creditoAttuale -= minuti;
        this.consumoAttuale += consumo;
        this.cicliConsumo++;
        }
        
        public String toString() {
        String res = "Numero: " + this.numero + "\n";
        res += "Credito attuale: " + this.creditoAttuale + "\n";
        res += "Consumo attuale: " + this.consumoAttuale + "\n";
        res += "Cicli di consumo: " + this.cicliConsumo;
        return res;
        }
        }

        

        
        
        
        
