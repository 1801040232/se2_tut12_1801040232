package enhanceLogic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords
{
    public static void main(String[] args){

        String pattern = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
        Pattern pa = Pattern.compile(pattern, Pattern.MULTILINE+Pattern.CASE_INSENSITIVE);

        Scanner sc = new Scanner(System.in);
        int testCases = Integer.parseInt(sc.nextLine());
        while(testCases>0){
            String input = sc.nextLine();
            Matcher mat = pa.matcher(input);
            boolean findMatch = true;
            while(mat.find( )){
                input = input.replaceAll(mat.group(),mat.group(1));
                findMatch = false;
            }
            System.out.println(input);
            testCases--;
        }
    }
}
