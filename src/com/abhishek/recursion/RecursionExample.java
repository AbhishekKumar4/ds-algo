public class RecursionExample {

  public static int factorial(int number) {
    // base case
    if(number == 0 || number == 1){
      return 1;
    }
    return number * factorial(number-1);
  }
  
  public static void main(String args[]) {
    System.out.println(factorial(4));
  }

}