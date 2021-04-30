public class SplitStrings {
    public static void main(String[] args) {
        String message = "b3!3h@kjh5 jh#h4@g1khj 3k k2  gy$g1 kj!4j hg 23@jhh hg1$j2hg h";
        ArrayList newString = new ArrayList.split(message, ! $ );
    }
}

class ArrayList {

    public static ArrayList<string> split(String s, String delimiters){
        String splittedMessage = "";
        for (i = 0; i <= ArrayList.length(); i++){
            if (list.get(i) == delimiters) {
                splittedMessage += " ,"; 
                splittedMessage += list.remove(i);
            }
            else {
                splittedMessage += list.get(i);
            }

            }
        return splittedMessage;
    }
}
