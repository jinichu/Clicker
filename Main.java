package fedoraclicker;
public class Main{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
      System.out.println ("\n Testing SNum\n\n");

      int n1 = 123;
      SNum num1 = new SNum(1);
      System.out.println (n1+" made simple is " + num1 );
      
      int n2 = 123456;
      num1.SNumAdd(n2, 0); 
      System.out.println ("When you add " +n2+" and simplify, you get " + num1 );

      int n3 = 123456789;
      num1.SNumAdd(n3, 0); 
      System.out.println ("When you add " +n3+" and simplify, you get " + num1 );
   }
}
