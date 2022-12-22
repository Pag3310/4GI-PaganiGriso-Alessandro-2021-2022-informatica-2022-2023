public class Loan {
    private int AnnualCycle;
    private int amount;
    private int numPayment;
    private double interest;
    private double maxInterest;

    public Loan() {
        this.amount = 0;
        this.numPayment = 0;
        this.interest = 0;
    }

    public Loanpublic Loan(int amount, int numPayment, double interest) {
        int setAmount;

    }

    {

    }

    public setAmount(int a){
        if(a>0){
            this.amount=a;
        }else{
            this.amount=0;
        }
    }

    public setNumPayment(int p){
        if(p>0){
            this.numPayment=p;
        }
    }

    public  setInterest(double i,){
        if(i>0 && i<100){
            this.interest=i;
        }
    }

    public int getAmount() {
        return this.amount;
    }

    public int getNumPayment() {
        return this.numPayment;
    }

    public double getInterest() {
        return this.interest;
    }

    public String toString() {
        String out = "";
        out += "l'importo del mutuo è" + this.getAmount();
        out += "il numero di pagamenti è" + this.getNumPayment();
        out += "l'interesse è" + this.getInterest();
        return out;
    }

    public int getAnnualCycle() {
        return AnnualCycle;
    }

    public void setAnnualCycle(int annualCycle) {
        AnnualCycle = annualCycle;
    }

    public double getMaxInterest() {
        return maxInterest;
    }

    public void setMaxInterest(double maxInterest) {
        this.maxInterest = maxInterest;
    }
}
