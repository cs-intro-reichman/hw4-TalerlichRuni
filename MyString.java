public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        int length =str.length();
        char[] copy = str.toCharArray();
        for(int i=0;i<length;i++)
        {
        if (str.charAt(i)>='A' && str.charAt(i)<='Z')
        {
            copy[i] = (char)(copy[i] + 32);
        }
        }
        return new String(copy);
        }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        char[] one = str1.toCharArray();
        char[] two = str2.toCharArray();
        int counter=0; 
        if (str1.length()<str2.length())return false;
        else
        {
        boolean result=true;
        for (int i=0;i<=one.length-two.length;i++)     
        { 
        for (int u=0; u<two.length;u++)
        {
        if(one[i+u]!=two[u])
        {
        result=false;  
        break;
        }  
        }   
        if (result==true)return true;
        }
        }
        return false;
}
}
