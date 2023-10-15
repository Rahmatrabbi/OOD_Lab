public class Saving implements BankAccount{
    int ammount;
    Saving(int ammount){
        this.ammount = ammount;
    }

    @Override
    public void deposit() {
        System.out.println("Deposited Ammount: "+ammount);
    }
    @Override
    public void withdraw() {
        System.out.println("Withdraw Ammount: "+ammount);
    }
    @Override
    public void transfer(BankAccount account,int ammount,int srcAccNumber,int desAccNumber){
        System.out.println("Transfer ammount: "+ammount+" from account"+srcAccNumber+" to: "+desAccNumber);
    }
    @Override
    public int getAccountNumber(){
        return 5333;
    }
}
