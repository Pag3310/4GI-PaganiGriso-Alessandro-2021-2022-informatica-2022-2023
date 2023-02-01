public class Calculator {
    private Contatore c;
    private static final double COSTO = 3,5;
    public Calculator(Contatore con){
        if (con!=null) c=con;
    }
    public void start(){
        double ris;
        descizione();
        input();
        ris= calcolabBolletta();
        VisRis();
    }
    public void input(){
        Scanner s = new Scanner (System.in)
        System.out.println()
        
    }
}