package main.java.representations;

public class User 
{
    private String firstName;
    private String lastName;
    private String username;
    private String emailAddress;
    private int userID;
    
    public User(String fName, String lName, String uName, String email, int uid)
    {
        this.firstName = fName;
        this.lastName = lName;
        this.username = uName;
        this.emailAddress = email;
        this.userID = uid;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() 
    {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() 
    {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    /**
     * @return the username
     */
    public String getUsername() 
    {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) 
    {
        this.username = username;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() 
    {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) 
    {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the userID
     */
    public int getUserID() 
    {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) 
    {
        this.userID = userID;
    }
}
