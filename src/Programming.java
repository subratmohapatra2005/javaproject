import java.util.*;
import java.io.*;

class Programming {
  String FirstReverse(String str) {

    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    char[] astr = str.toCharArray();
    char c;
    for (int i=0;i<=(astr.length-1)/2;i++)
    {
      c=astr[i];
      astr[i]=astr[astr.length-1-i];
      astr[astr.length-1-i] = c;
    }

    return  String.valueOf(astr);

  }

  public static void main (String[] args) {
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Programming c = new Programming();
    System.out.print(c.FirstReverse(s.nextLine()));
  }

}








  