package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
    public static boolean isPalindrome(int a){
        String str = String.valueOf(Math.abs(a));
        String reverseStr = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverseStr += str.charAt(i);;
        }
        return reverseStr.equals(str);
    }
    public static boolean isPerfectNumber(int a){
        int bolenler = 0;
        for(int i = 1; i < a; i++){
            if(a%i==0){
                bolenler += i;
            }
        }
        return bolenler == a;
    }
    public static String numberToWords(int a){
        if(a < 0) return "Invalid Value";
        String[] numberWords = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String str = String.valueOf(a);
        String words = "";
        for(int i = 0; i < str.length(); i++){
            words += numberWords[Integer.parseInt(String.valueOf(str.charAt(i)))] + " ";
        }
        return words.trim();
    }
}
