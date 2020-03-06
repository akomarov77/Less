package lesson8.homeWork;

public class ExternalWorker extends Exception {
    private Coder coder;
    private Accountant accountant;

    public void doCoffee() {
        System.out.println("Pfff...");
    }

    public Coder getCoder() {
        return coder;
    }

    public void setCoder(Coder coder) {
        this.coder = coder;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }
}
