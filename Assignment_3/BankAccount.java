public interface BankAccount {
    void deposit();
    void withdraw();
    void transfer(BankAccount account , int ammount, int srcAccNumber,int desAccNumber);
    int getAccountNumber();
}
