package utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;




public class CreateRandomData {

    public static Random random = new Random();
    private Integer id;
    private String name;
    private String login;
    private String password;


    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswordRandom() {
        return password;
    }



    public String userNameGenerate (){

        return RandomStringUtils.randomAlphabetic(89);
    }

    public String passwordGenerate (){
        return RandomStringUtils.randomAlphabetic(8);
    }

    public static String generateRandomEmail(int length) {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 1) + "@testdata.com";
        return email;
    }

    public int idGenerate(){
        return random.nextInt(3);
    }
}
