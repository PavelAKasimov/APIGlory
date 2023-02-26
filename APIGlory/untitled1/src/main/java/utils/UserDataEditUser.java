package utils;
import java.util.Random;


public class UserDataEditUser {
    private String name;
    private String birthday;

    public UserDataEditUser(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return generateRandomName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return generateRandomBirthday();
    }

    public void setBirthday(String birthday) {
        this.birthday = generateRandomBirthday();
    }

    private static final String[] NAMES = {"Alice", "Bob", "Charlie", "Dave", "Eve", "Frank", "Grace", "Heidi", "Ivan", "Judy", "Karl", "Linda", "Mallory", "Nancy", "Oscar", "Peggy", "Quincy", "Ralph", "Samantha", "Tom", "Ursula", "Victor", "Wendy", "Xander", "Yvonne", "Zoe"};
    private static final Random random = new Random();
    public static String generateRandomName() {
        int index = random.nextInt(NAMES.length);
        return NAMES[index];
    }
    private static final String[] BIRTHDAY = {"2022-10-25", "2022-10-21", "2000-10-25", "20220-10-25", "2022-10-11", "1922-10-25", "2022-01-05", "2022-04-25", "2012-10-25"};
    private static final Random randomBirthday = new Random();
    public static String generateRandomBirthday() {
        int index = randomBirthday.nextInt(BIRTHDAY.length);
        return BIRTHDAY[index];
    }
}