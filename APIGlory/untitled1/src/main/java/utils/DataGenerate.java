package utils;

import java.util.HashMap;

public class DataGenerate extends CreateRandomData {

    public HashMap <String, String> data = new HashMap<>();

    public String getRandomEmail () {
        data.put("login", generateRandomEmail(8));
        return data.get("login");
    }

    public String getPasswordR() {
        data.put("password", passwordGenerate());
        return data.get("password");
    }

    public String getPasswordSimple () {
        return passwordGenerate();
    }
    public String getEmailSimple () {
        return generateRandomEmail(8);
    }

}
