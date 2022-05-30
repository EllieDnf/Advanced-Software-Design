package Advanced_Software_Design.lab4_factoryPattern;

public class CustomerServiceImpl extends ServiceFactory implements CustomerService{
    @Override
    public AccountDAO createAccountDAO(EnvironmentType type) {
        AccountDAO accountDAO = null;
        if (type == EnvironmentType.PRODUCTION) accountDAO = new AccountDAOImpl();
        else accountDAO = new MockAccountDAOImpl();
        return accountDAO;
    }

    public CustomerServiceImpl(EnvironmentType type) {
        super();
        super.setAccountDao(type);
    }

    @Override
    public void getAccountEntries(Account account) {

    }
}
