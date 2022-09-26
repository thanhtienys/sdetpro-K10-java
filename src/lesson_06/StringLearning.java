package src.lesson_06;

import java.util.Arrays;

public class StringLearning {

    public static void main(String[] args) {

        String myPassword = "123myPassword";
        char[] myCharacters = myPassword.toCharArray();
        System.out.println(Arrays.toString(myCharacters));

        /* Logic check password
        * loop over the myCharacters
        * if char is digit
        *   then digitCount ++
        * else if char is lowerCase
        *   then lowerCaseCount ++
        * else if char is upperCase
        *   then upperCaseCount ++
        * */
        int digitCnt, lowerCaseCnt, upperCaseCnt;
        digitCnt = lowerCaseCnt = upperCaseCnt = 0;
        for (char charIndex : myCharacters) {
            if (Character.isDigit(charIndex))
                digitCnt++;
            else if (Character.isLowerCase(charIndex))
                lowerCaseCnt++;
            else if (Character.isUpperCase(charIndex))
                upperCaseCnt++;
        }
        if (digitCnt > 0 && lowerCaseCnt > 0 && upperCaseCnt > 0)
            System.out.println(" You are all set");
        else
            System.out.println("Password format is invalid....");

        // Immutable
        // Biến đc gán lần đầu cho chuỗi, nếu change data thì phải gán lại giá trị cho biến, hoặc gán biến mới.

        String badWordContainer = "     bad1 bad2 bad3, very bad1 bad2, something else, bad!!!     ";
        //1st đặt vào lênh print
        System.out.println(badWordContainer.replace("bad1", "b**"));

        //2nd gán lại cho chính nó
        badWordContainer = badWordContainer.replace("bad2", "b**");
        System.out.println(badWordContainer);

        // 3nd tạo biến mới đựng giá trị

        String filterWordBad = badWordContainer.trim();
        System.out.println(filterWordBad);

        //subString, indexOf, split
        //1. subString
        String url = "https://google.com";
        //Không bao gồm kí tự End Index
        System.out.println(url.substring(0, 5));
        System.out.println(url.substring(8));

        //2. indexOf : check value có tồn tại trong chuỗi hay k? có trả về index đầu tiên, -1 không có

        System.out.println(url.indexOf("co"));
        System.out.println(url.lastIndexOf("e"));

        // 3. Slit : cut chuoi theo dieu kien

        String [] splitStr = url.split("o");
        System.out.println(Arrays.toString(splitStr));

        // 4. REGULAR EXPRESSION ( REGEX)

        String cookTimesStr = "100mins";
        /*
        replaceAll("[a-z]",""):
            + [a-z] : replace nhung ki tu a den z
            + [^a-z] : replace nhung ki tu KHONG a den z
        */
        String cookTimeNumber = cookTimesStr.replaceAll("[a-z]","");
        System.out.println(cookTimeNumber);

        //Convert character -> integer
        System.out.println( Integer.parseInt(cookTimeNumber) + 1);

        // 5. CONCAT
        String s1 = "Hello";
        String s2  = " World";
        String s3 = s1.concat(s2);
        System.out.println(s3);

        System.out.println(s1 + " New "+ s2.concat(s3));
    }
}
