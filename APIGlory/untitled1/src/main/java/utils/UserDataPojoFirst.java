package utils;


public class UserDataPojoFirst extends CreateRandomData {


        private String login;
        private String password;
        private String currencyCode;
        private String depositUrl;
        private String welcomeBonusUrl;
        private Integer languageId;
        private Integer id;
        private Integer statusCode ;
        private String authToken;



    DataGenerate dataGenerate = new DataGenerate();



    public Integer getId() {
                return id;
        }

    public String getEmail() {
        return generateRandomEmail(9);
    }

    public void setId(Integer id) {
                this.id = id;
        }

        public Integer getStatusCode() {
                return statusCode;
        }

        public void setStatusCode(Integer statusCode) {
                this.statusCode = statusCode;
        }

        public String getAuthToken() {
                return authToken;
        }

        public void setAuthToken(String authToken) {
                this.authToken = authToken;
        }

        public UserDataPojoFirst(String login, String password, String currencyCode, String depositUrl, String welcomeBonusUrl, Integer languageId) {
                this.login = login;
                this.password = password;
                this.currencyCode = currencyCode;
                this.depositUrl = depositUrl;
                this.welcomeBonusUrl = welcomeBonusUrl;
                this.languageId = languageId;
        }


        public UserDataPojoFirst(String login, String password) {
                this.login = login;
                this.password = password;
        }

        public UserDataPojoFirst(String login, String password, String currencyCode, String depositUrl, String welcomeBonusUrl, Integer languageId, Integer id, Integer statusCode, String authToken) {
                this.login = login;
                this.password = password;
                this.currencyCode = currencyCode;
                this.depositUrl = depositUrl;
                this.welcomeBonusUrl = welcomeBonusUrl;
                this.languageId = languageId;
                this.id = id;
                this.statusCode = statusCode;
                this.authToken = authToken;
        }

        public UserDataPojoFirst() {
        }

        public String getLogin() {
                return login;
        }

        public void setLogin(String login) {
                this.login = login;
        }

    public String getNewEmail() {
            return generateRandomEmail(9);
        }

        public void setNewEmail(String newEmail) {
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getCurrencyCode() {
                return currencyCode;
        }

        public void setCurrencyCode(String currencyCode) {
                this.currencyCode = currencyCode;
        }

        public String getDepositUrl() {
                return depositUrl;
        }

        public void setDepositUrl(String depositUrl) {
                this.depositUrl = depositUrl;
        }

        public String getWelcomeBonusUrl() {
                return welcomeBonusUrl;
        }

        public void setWelcomeBonusUrl(String welcomeBonusUrl) {
                this.welcomeBonusUrl = welcomeBonusUrl;
        }

        public Integer getLanguageId() {
                return languageId;
        }

        public void setLanguageId(Integer languageId) {
                this.languageId = languageId;
        }
}



