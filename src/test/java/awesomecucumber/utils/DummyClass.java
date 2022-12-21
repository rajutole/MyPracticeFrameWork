package awesomecucumber.utils;

public class DummyClass {
    public static void main(String[] args) {
        String str= "Advik";
        System.out.println("original String is "+str);
        int len=str.length();
        String rev= " ";
        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        System.out.println("Reverse string is "+rev);
        System.out.println("Test scmPOll");
        System.out.println("Test scmPOll1");
    }
}
