import java.util.HashMap;

public class BankService {
    HashMap<Integer, BankAccount> bankAccount;

    BankService(){
        this.bankAccount = new HashMap<>();
    }

    int createNewAccount(String accountType , int ammount){
        BankAccount ba = null;
        if(accountType.equals("chequing"))
        ba = new Chequing(ammount);
        else if(accountType.equals("saving"))
        ba = new Saving(ammount);
        if(ba != null){
            this.bankAccount.put(ba.getAccountNumber(),ba);
            return ba.getAccountNumber();
        }
        return -1;
    }

    void transferMoney(int srcAccNumber, int desAccNumber, int ammount){
        BankAccount sourceAccount = this.bankAccount.get(srcAccNumber);
        BankAccount destinationAccount = this.bankAccount.get(desAccNumber);
        sourceAccount.transfer(destinationAccount, ammount, srcAccNumber, desAccNumber);
    }
}
