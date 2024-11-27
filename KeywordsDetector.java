public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

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

        public static boolean contains(String str1, String str2) {
            char[] one = str1.toCharArray();
            char[] two = str2.toCharArray();
            int counter=0; 
            if (str1.length()<str2.length())return false;
            else
            {
            for (int i=0;i<=one.length-two.length;i++)     
            { 
            boolean result=true;    
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

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
        public static void detectAndPrint(String[] sentences, String[] keywords) {
        for(String s : sentences)
        {
        for(String k :keywords)
        {
        String SF =lowerCase(s);
        String KF = lowerCase(k);
        if (contains(SF, KF)) 
        {
            System.out.println(s);
            break;
        }
        }
        }
    }
}
