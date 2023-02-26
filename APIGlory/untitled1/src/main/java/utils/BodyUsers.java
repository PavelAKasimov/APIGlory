package utils;

public class BodyUsers {

 //   https://backend-test.gloryssplash.com/v1/admin/localization
    DataGenerate dataGenerate = new DataGenerate();
    public String getBodyAuth = "{\n" +
            "    \"login\": \"" + dataGenerate.getRandomEmail() + "\",\n" +
            "    \"password\": \"" + dataGenerate.getPasswordR() + "\",\n" +
            "    \"currencyCode\": \"EUR\",\n" +
            "    \"depositUrl\": \"https://mvnrepository.com/artifact/org.codehaus.groovy/groovy/3.0.14\",\n" +
            "    \"welcomeBonusUrl\": \"https://mvnrepository.com/artifact/org.codehaus.groovy/groovy/3.0.14\",\n" +
            "    \"languageId\": 3 \n" +
            "}";

    public String getBodyLogin = "{\n" +
            "  \"login\": \"" + dataGenerate.data.get("login") + "\",\n" +
            "  \"password\": \"" + dataGenerate.data.get("password") + "\"\n" +
            "}";

    public String getBodyAuthChangeMail = "{\n" +
            "  \"password\": \"" + dataGenerate.data.get("password") + "\",\n" +
            "  \"newEmail\": \""+"jгixd" + dataGenerate.getRandomEmail() + "\"\n" +
            "}";
}
