package src.lesson_06;

public class LabURL {

    public static void main(String[] args) {
        String url =  "https://google.com";

        String hypertext  = url.substring(0, url.indexOf(":"));
        System.out.println("Hypertext is: " +hypertext);

        String domainName = url.substring(url.lastIndexOf("/") + 1, url.indexOf("."));
        System.out.println("Domain name is: " +domainName);

        String TLD = url.substring(url.indexOf("."));
        System.out.println("Top-level domain is:" +TLD);
    }
}
