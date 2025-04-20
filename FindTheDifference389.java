import java.util.HashMap;

public class FindTheDifference389 {
    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i),i);
        }
       int i=0;
       while (map.remove(t.charAt(i))!=null){
        i++; 
       }
       return t.charAt(i); 
       }

       public static void main(String[] args) {
        System.out.println("DAFNAAA     "+findTheDifference("aaa","aa"));
       }
}
