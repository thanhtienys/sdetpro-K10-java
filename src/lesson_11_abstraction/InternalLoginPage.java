package src.lesson_11_abstraction;

public class InternalLoginPage extends LoginPage{

    @Override
    public String inputUserName(String username) {
        System.out.println("Input username with Internal Login Page");
        return null;
    }

    @Override
    public String inputPassword(String password) {
        System.out.println("Input password with Internal Login Page");
        return null;
    }

    @Override
    public String clickBtnLogin() {
        System.out.println("Click btn Login with Internal Login Page");
        return null;
    }
}
