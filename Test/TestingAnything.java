package Test;

import java.util.ArrayList;

public class TestingAnything {
    public static void main(String[] args) {
        /*int x = 1;
        System.out.println(x + " " + m(x));
        String messenger = "";
        for (Integer e: m({10.0, 11.0, 12.0, 13.0})) {
          messenger += m(10.0).get(e) + " ";
        }*/
        int array = 3;
        System.out.println(m(array).toString());
    }
    
    public static ArrayList<Integer> m(int x) {
        ArrayList<Integer> testing = new ArrayList<>();
        //Base case
        if (x == 0) {
          testing.add(0);
          return testing;
        } 
        //Base case
        else if (x == 1) {
          testing.add(1);
          return testing;
        }
        //Reduction and Recursive calls
        else  
          return m(x - 1);
      }

      public static String mine(ArrayList<Integer> ans) {
        String messenger = "";
        for (Integer e: ans) {
          messenger += ans.get(e) + " ";
        }
        return messenger;
      }
    }
  
    
  