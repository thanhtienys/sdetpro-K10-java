package src.lesson_11_polymorphism;

public class ChromeDriver extends WebDriver{

    @Override
    public void innit() {
        System.out.println("Innit with chrome driver");
    }

    @Override
    public void close() {
        System.out.println("Close with chrome driver");
    }

    @Override
    public void sendKeys(WebElement webElement, String chars) {
        System.out.println("Send keys with chrome driver");

    }
}
