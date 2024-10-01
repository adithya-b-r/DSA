package Functional;

class checkStringPalindrome {
 static boolean checkPalin(String str, int i){
  if(i >= str.length()/2)
    return true;

  if(str.charAt(i) != str.charAt(str.length()-i-1))
    return false;

  return checkPalin(str, i+1);
 }

 public static void main(String[] args) {
  String str = "madam";

  System.out.println(checkPalin(str, 0));
 }
}