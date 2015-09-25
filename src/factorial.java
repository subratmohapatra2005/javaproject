/**
 * Created by sumohapa on 09/08/15.
 */
public class factorial {

  public static int getFactorial(int num)
  {
    int fact = 1;

    fact = fact*getFactorial(num-1);
    return fact;
  }

  public static void main(String [] args)
  {
    System.out.print(getFactorial(6));
  }
}
