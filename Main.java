package 回文字段;

public class Main {
    public static void main(String[] args) {
        String s = "a";
        Solution solution = new Solution();
        String a = solution.longestPalindrome(s);
        System.out.println(a);
    }
}
class Solution {
    public String longestPalindrome(String s) {
        String huiwen = "";
        if (s.length() == 0) return "";
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++){
            if (i < s.length() -1) {
                s1 = huiWen(s, i, i + 1);
                huiwen = huiwen.length() > s1.length() ? huiwen : s1;
            }
            s2 = huiWen(s,i,i);
            huiwen = huiwen.length() > s2.length()? huiwen:s2;
        }
        return huiwen;
    }
    public String huiWen(String s, int pre,int last){
        String h = "" + s.charAt(0);
        if (pre == -1 || last == s.length() || s.charAt(pre) != s.charAt(last)){
            if (!((pre+1) > (last-1))) {
                h = s.substring(pre + 1, last);
            }
        }else{
            h = huiWen(s, pre-1,last+1);
        }
        return h;
    }
}
