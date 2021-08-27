package MavenProjects.Question3;

public interface BankAccountRepository {
public double getBalance(long aacountId);
public double updateBalance(long accountId,double newBalance);
}
