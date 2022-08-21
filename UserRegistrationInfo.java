

public class UserRegistrationInfo {
    
    private String userID;
    private String userName;
    private String userPassword;
    private String userEmail;

    public UserRegistrationInfo() {
    }

    
    public UserRegistrationInfo(String userID, String userName, String userPassword, String userEmail) {
        this.userID = userID;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
    }
    
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    
    public String concatenateCredentials(){

        String custRegCredentials = this.userID + "|" +
                this.userName + "|" +
                this.userPassword + "|" +
                this.userEmail;
        
        return custRegCredentials;
    }
}
