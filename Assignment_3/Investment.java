public class Investment implements BankAccount{
    int ammount;
    Investment(int ammount){
        this.ammount = ammount;
    }
    @Override
    public void deposit(){
        System.out.println("Deposited Ammount"+ammount);
    }
    public void withdraw(){
        System.out.println("Withdraw ammount: "+ammount);
    }

    public void transfer(BankAccount account,int ammount,int srcAccNumber,int desAccNumber){
        System.out.println("Transfer ammount: "+account+" from account: "+srcAccNumber+" to: "+desAccNumber);
    }
    public int getAccountNumber(){
        return 45676;
    }
}
