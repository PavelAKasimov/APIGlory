package utils;

public class UserDataSentLink extends CreateRandomData {
    private String email;
    private String resetPasswordUrl;


    public UserDataSentLink(String email, String resetPasswordUrl) {
        this.email = email;
        this.resetPasswordUrl = resetPasswordUrl;
    }

    public String getEmail() {
        return email;
    }

    public String getResetPasswordUrl() {
        return resetPasswordUrl = "https://mvnrepository.com/artifact/org.codehaus.groovy/groovy/3.0.14";
    }

    public UserDataSentLink() {
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setResetPasswordUrl(String resetPasswordUrl){
        this.resetPasswordUrl = resetPasswordUrl;
    }
}


