package solidbank.springproject;

import java.util.Scanner;

public class MyCLI implements CLIUI{
    private Scanner scan;

    MyCLI() {
        this.scan = new Scanner(System.in);
    }

    public MyCLI(Scanner scanner) {
        this.scan = scanner;
    }

    public double requestClientAmount() {
        return 0.0;
    }

    public String requestClientAccountNumber() {
        return "";
    }

    public AccountType requestAccountType() {
        return new AccountType(scan.next());
    }
}
