package model;

public class Account {

    private int accountId;
    private String name;
    private String username;
    private String password;
    private int function;

    public Account() {
        this(-1, "", "", "", -1);
    }

    public Account(int account_id, String name, String username, String password, int function) {
        this.accountId = account_id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.function = function;
    }

    /**
     * @return the categoryId
     */
    public int getAccountId() {
        return accountId;
    }

    /**
     * @param accountId the accountId to set
     */
    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getFunction() {
        return function;
    }

    /**
     * @param function the function to set
     */
    public void setFunction(int function) {
        this.function = function;
    }
}
