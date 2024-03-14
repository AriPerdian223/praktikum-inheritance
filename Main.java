//NAMA  : ARI PERDIAN
//KELAS : TI22J
//NIM   : 20220040072

public class Main {
    public static void main(String[] args) {
        //kelas Account
        Account acc = new Account(1000.0);
        System.out.println("Account balance: " + acc.getBalance());
        acc.deposit(500.0);
        System.out.println("Account balance after deposit: " + acc.getBalance());
        boolean withdrawResult = acc.withdraw(300.0);
        System.out.println("Withdrawal successful? " + withdrawResult);
        System.out.println("Account balance after withdrawal: " + acc.getBalance());

        //kelas SavingAccount
        SavingAccount savingAcc = new SavingAccount(2000.0, 0.05);
        System.out.println("\nSaving Account balance: " + savingAcc.getBalance());
        savingAcc.deposit(500.0);
        System.out.println("Saving Account balance after deposit: " + savingAcc.getBalance());
        boolean savingWithdrawResult = savingAcc.withdraw(300.0);
        System.out.println("Withdrawal successful? " + savingWithdrawResult);
        System.out.println("Saving Account balance after withdrawal: " + savingAcc.getBalance());

        //kelas CheckingAccount
        CheckingAccount checkingAcc = new CheckingAccount(3000.0, 500.0);
        System.out.println("\nChecking Account balance: " + checkingAcc.getBalance());
        checkingAcc.deposit(500.0);
        System.out.println("Checking Account balance after deposit: " + checkingAcc.getBalance());
        boolean checkingWithdrawResult = checkingAcc.withdraw(3500.0);
        System.out.println("Withdrawal successful? " + checkingWithdrawResult);
        System.out.println("Checking Account balance after withdrawal: " + checkingAcc.getBalance());
    }
}
