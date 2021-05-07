public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        //build an array with one hundred random intergers
        int[] randomArray = new int[100]; 
        for (int j = 0; j < randomArray.length; j++) {
            randomArray[j] = (int) (Math.random() * 100);
        }
    }
}