package src.lesson_11_polymorphism;

public abstract class WebDriver {

    public abstract void innit();
    public abstract void close();

    public abstract void sendKeys( WebElement webElement, String chars);
}
