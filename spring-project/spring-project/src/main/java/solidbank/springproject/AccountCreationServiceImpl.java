package solidbank.springproject;

public class AccountCreationServiceImpl implements AccountCreationService {

    private AccountDAO accountDAO;

    public AccountCreationServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void create(AccountType accountType, long bankID, String clientID, long accountID) {
        Account account = new Account(accountType, String.valueOf(accountID), clientID, 0.0, true);
        if (accountType.getAccountType().equals("CheckingAccount") ||
                accountType.getAccountType().equals("SavingAccount") ) {
        this.accountDAO.createNewAccount(account);
        }
        else {
            Account account2 = new Account(accountType, String.valueOf(accountID), clientID, 0.0, false);
            this.accountDAO.createNewAccount(account2);
        }
    }
}
