package ProjectNumber2;

public class ProjectNumber2Homework14 {
}
class Registration {
    private String email, userName, password;


    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("invalid email address ");
        }

    }

    public void setUserName(String userName) {
        if (userName.length() > 6 && !userName.isEmpty() && !userName.contains(password)) {
            this.userName = userName;
        } else if (userName.isEmpty()) {
            System.out.println("Username cant be empty");
        } else if (userName.length() < 6) {
            System.out.println("User Name cant be less than 6 digits ");
        } else if (userName.contains(password)) {
            System.out.println("User name cant be your password ");
        }
    }


    public void setPassword(String password) {
        if (!password.contains(userName)) {
            this.password = password;
        } else {
            System.out.println("your password cant be your user name ");
        }

    }

    public Registration(String email, String userName, String password) {
        setEmail(email);
        setUserName(userName);
        setPassword(password);

    }


    public void printInfo() {
        System.out.println("user name is: "+ userName+" Password is :"+ password+ " Email address is: "+ email );

    }
}
class RegistrationTester {
    public static void main(String[] args) {
        Registration reg = new Registration("eoz@yahoo.com", "engin9977", "abc123");
        reg.setEmail("Eoz@yahoo.com");
        reg.setPassword("Kabasakal");
        reg.setUserName("TemelReis");
        reg.printInfo();


    }
}