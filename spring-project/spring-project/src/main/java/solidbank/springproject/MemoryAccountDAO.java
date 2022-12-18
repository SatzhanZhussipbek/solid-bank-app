package solidbank.springproject;

import java.util.List;

public class MemoryAccountDAO implements AccountDAO{

    private List<Account> accountList;

    @Override
    public List<Account> getClientAccounts(String clientID) {
        if (accountList.isEmpty()) {
            System.out.println("You have no account.");
        }
        return accountList;
    }

    @Override
    public void createNewAccount(Account account) {
         accountList.add(account);
    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return null;
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        return null;
    }
}
