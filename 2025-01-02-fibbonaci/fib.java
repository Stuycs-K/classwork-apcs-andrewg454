public class fib{
  public static void main(String[] args){
    System.out.println(fibo(46));
  }
  public static int fibo(int n){
    if(n>1){
      return fibo(n-1) + fibo(n-2);
    }
    else{
      return n;
    }
  }
  }
