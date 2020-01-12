
public class Sum
{
    static  int sum=0;
  public static void main(String[] args)
  {
      S.pln(""+sumOf(153));
  }
  static int sumOf(int n)
  {
      if(n!=0)
      {
          sum+=(n%10)*(n%10);
          return sumOf(n/10);
      }
      else
      return sum;
  }
}
