import java.util.*;
public class validAnagram{
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int[] count= new int[26];
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int v:count){
            if(v!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        validAnagram solution = new validAnagram();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s = scanner.nextLine();
        System.out.println("Enter second string:");
        String t = scanner.nextLine();   
        boolean result = solution.isAnagram(s, t);
        System.out.println("Are the two strings anagrams? " + result);
        scanner.close();
    }
}
