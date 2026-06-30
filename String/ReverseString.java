package String;


// Brute force approach
// public class ReverseString {
//     public static String reveString(String s) {
        
//         StringBuilder ans = new StringBuilder();

//         for(int i=s.length()-1;i>=0;i--) {
//             ans.append(s.charAt(i));
//         }

//         return ans.toString();
//     }

//     public static void main(String[] args) {
//         String s = "hello";
//         System.out.println("Reverse String: "+ reveString(s));
//     }
// }


// Optimal approach

public class ReverseString {
    public static String reveString(String s) {
        
        char arr[] = s.toCharArray();
        int left=0, right= s.length()-1;

        while (left<right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            
            left++;
            right--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println("Reverse String: "+ reveString(s));
    }
}

