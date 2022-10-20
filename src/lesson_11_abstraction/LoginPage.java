package src.lesson_11_abstraction;

public abstract class LoginPage {

    public abstract String inputUserName( String username);
    public abstract String inputPassword( String password);
    public abstract String clickBtnLogin();

    public void login(String username , String password){
        inputUserName(username);
        inputPassword(password);
        clickBtnLogin();

    }

}
