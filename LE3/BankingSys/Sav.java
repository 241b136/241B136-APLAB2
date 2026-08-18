    class Sav extends BankAccount { 
    Sav(String num, double balance){
        super(num,balance);
        }
    public void withdraw(double amt){
        if (this.balance>amt){
        this.balance=this.balance-amt;
        System.out.println("withdraw successfully");
        }
        else{
            System.out.println("Insufficient Funds. cannot go below 0.");
            return;
        }
    } 
    public double getBalance() { 
        return balance; 
            } 
    }