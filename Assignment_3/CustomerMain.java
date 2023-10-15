public class CustomerMain{
    public static void main(String[] args){
        BankService bankservice = new BankService();
        int CustomerSavingAccount = bankservice.createNewAccount("saving",500);
        System.out.println(CustomerSavingAccount);
        int CustomerInvestAccount = bankservice.createNewAccount("investment",700);
        System.out.println(CustomerInvestAccount);
        bankservice.transferMoney(CustomerSavingAccount,CustomerInvestAccount,225);
    }
}