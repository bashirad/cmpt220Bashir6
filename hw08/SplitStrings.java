public class SplitStrings {
    public static void main(String[] args) {
        //String message = "b3!3h@kjh5 jh#h4@g1khj 3k k2  gy$g1 kj!4j hg 23@jhh hg1$j2hg h";
        //ArrayList newString = new ArrayList.split(message, ! $ );
    }




    public static ArrayList<String> split(String s, String delimiters){
        String splittedMessage = "";
        for (int i = 0; i <= s.length(); i++){
            char character = s.charAt(i);
            if (character == ) {
                splittedMessage += ArrayList.add(i, " ,"); 
                splittedMessage += ArrayList.remove(i);
            }
            else {
                splittedMessage += ArrayList.get(i);
            }

            }
        return splittedMessage;
    }

}