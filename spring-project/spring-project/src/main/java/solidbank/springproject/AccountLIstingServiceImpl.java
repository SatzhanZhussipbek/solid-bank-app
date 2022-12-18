package solidbank.springproject;

import java.util.List;

public class AccountLIstingServiceImpl implements AccountListingService {

    private AccountDAO accountDAO;

    @Override
    public Account getClientAccount(String clientID, String accountID) {
        if (accountDAO.getClientAccounts(clientID).isEmpty()) {
            System.out.println("You don't have accounts.");
        }
        return accountDAO.getClientAccount(clientID, accountID);
    }

    @Override
    public AccountWithdraw getClientWithdrawAccount(String clientID, String accountID) {
        return null;
    }

    @Override
    public List<Account> getClientAccounts(String clientID) {
        //return accountDAO.getClientAccounts(clientID);
        AccountDAO accountDAO1 = new MemoryAccountDAO();
        return accountDAO1.getClientAccounts(clientID);
    }

    @Override
    public List<Account> getClientAccountsByType(String clientID, AccountType accountType) {
        return accountDAO.getClientAccountsByType(clientID, accountType);
    }
}
