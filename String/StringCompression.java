package String;

// public class StringCompression {
//     public static String compression(String s) {
//         int n = s.length();

//         StringBuilder temp  = new StringBuilder();
//         int i=0;
//         while (i<n) {
//             char current = s.charAt(i);
//             int count=0;

//             while(i<n && s.charAt(i)==current) {
//                 count++;
//                 i++;
//             }
//             temp.append(current);
//             if(count>1) {
//                 temp.append(count);
//             }
//         }
//         return temp.toString();
//     }

//     public static void main(String[] args) {
//         String s = "aaabbccddabc";
//         System.out.println(compression(s));
//     }
// }
