public class Contatore{\
    private double valoreAttuale;
    private double valorePrecedente;

    public Contatore(){
      this.valoreAttuale=0;
       this.valorePrecedente=0;
    }
    public Contatore(double a, double p){
        this.valoreAttuale=0;
        this.valorePrecedente=0;
        setValoreAttuale(a);
        setValorePrecedente(p);
    }
    public void setValoreAttuale(double a){
        if(a>0){
            this.valoreAttuale=a;
        }else{
            this.valoreAttuale=0;
        }
    }
    public void setValorePrecedente(double p){
        if(p>0){
            this.valorePrecedente=p;
        }else{
            this.valorePrecedente=0;
        }
    }
    public getValoreAttuale(){
        return this.valoreAttuale;
    }
    public getValorePrecedente(){
        return this.valorePrecedente;
    }
}