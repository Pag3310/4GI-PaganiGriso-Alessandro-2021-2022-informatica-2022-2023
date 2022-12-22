class LoanCalculator {
    // Data members
    private Loan loan;

    // Main method
    public static void main(String[] arg) {
        LoanCalculator calculator = new LoanCalculator();
        calculator.start();
    }

    // Constructor
    public LoanCalculator() {
        loan = new Loan();
    }

    // Top-level method that calls other private methods
    public void start() {
        describeProgram(); // tell what the program does
        getInput(); // get three input values
        computePayment(); // compute the monthly payment and total
        displayOutput(); // display the results
    }

    // Computes the monthly and total loan payments
    private void computePayment() {
        System.out.println("inside computePayment"); // TEMP
    }

    // Provides a brief explanation of the program to the user
    private void describeProgram() {
        System.out.println("inside describeProgram"); // TEMP
    }

    // Displays the input values and monthly and total payments
    private void displayOutput() {
        System.out.println("inside displayOutput"); // TEMP
    }

    private void getInput() {
        System.out.println("inside getInput"); // TEMP
    }

    public Loan getLoan() {
        return loan;
    }

}