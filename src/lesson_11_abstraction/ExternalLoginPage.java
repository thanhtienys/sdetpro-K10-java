package src.lesson_11_abstraction;

public class ExternalLoginPage extends LoginPage{

    @Override
    public String inputUserName(String username) {
        System.out.println("Input username with External Login Page");
        return null;
    }

    @Override
    public String inputPassword(String password) {
        System.out.println("Input password with External Login Page");
        return null;
    }

    @Override
    public String clickBtnLogin() {
        System.out.println("Click btn Login with External Login Page");
        return null;
    }
}
