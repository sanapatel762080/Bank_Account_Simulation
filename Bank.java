import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String bankName;

    private String branchName;

    private String ifscCode;

    private List<Account> accounts = new ArrayList<>();

    @Override
    public String toString() {
        return "Bank [bankName=" + bankName + ", branchName=" + branchName + ", ifscCode=" + ifscCode + ", accounts="
                + accounts + "]";
    }

    public Bank() {
    }

    public Bank(String bankName, String branchName, String ifscCode) {
        this.bankName = bankName;
        this.branchName = branchName;
        this.ifscCode = ifscCode;
        this.accounts = new ArrayList<>();

    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account created for " + account.getAccountHolderName());
    }

    public Account findAccount(long accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }
        return null;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

}