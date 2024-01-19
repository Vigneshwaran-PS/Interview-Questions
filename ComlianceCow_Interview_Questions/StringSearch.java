package ComlianceCow_Interview_Questions;

public class StringSearch {
    public static void main(String[] args) {
        System.out.println(function("This is not")); // "is" occurance 2 and "not" occurance 1 --> occurance are not same so return false
        System.out.println(function("This is notnot")); // "is" occurance 2 and "not" occurance 2 --> occurance are not same so return true
        System.out.println(function("nisisnotnotisnot"));  // "is" occurance 3 and "not" occurance 3 --> occurance are not same so return true
    }

    public static boolean function(String str) {
        StringBuilder sb = new StringBuilder(str);
        int isCount = 0;
        int notCount = 0;
        String pair;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 2; j <= str.length(); j++) {
                pair = sb.substring(i,j);
                if(pair.equals("is")){
                    isCount++;
                }
                if(pair.equals("not")){
                    notCount++;
                }
            }
        }
        return isCount == notCount;
    }
}
