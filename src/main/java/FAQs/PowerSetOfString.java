package FAQs;

// Print powerSet of given string using recursion.
public class PowerSetOfString {
    public static void main(String[] args) {

        powerSet("abc",0,"");
    }
    private static void powerSet(String s, int i, String curr){
        if (i == s.length()){
            System.out.println(curr);
            return;
        }
        powerSet(s, i+1,curr+s.charAt(i));
        powerSet(s,i+1,curr);
    }
}
