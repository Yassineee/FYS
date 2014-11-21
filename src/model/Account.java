package model;

public class Account {

    private int accountId;
    private String name;
    private String username;
    private String password;
    private String function;

    public Account() {
        this(-1, "", "", "", "");
    }

    public Account(int account_id, String name, String username, String password, String function) {
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
