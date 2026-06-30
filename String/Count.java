package String;

// Count vowels, consonants, digits and spaces
public class Count {
    public static void count(String s) {
        int vowels = 0, consonants=0, digits=0, spaces=0;

        s = s.toLowerCase();
        for(int i=0;i<s.length();i++)  {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') vowels++;
            else if(ch>='a' && ch<='z') consonants++;
            else if(ch>='0' && ch<='9') digits++;
            else spaces++;
        }

        System.out.println("Vowels: "+ vowels);
        System.out.println("Consonants: "+ consonants);
        System.out.println("Digits: "+ digits);
        System.out.println("Spaces: "+ spaces);

    }

    public static void main(String[] args) {
        String s = "abhi123 hello";
        count(s);
    }
}
