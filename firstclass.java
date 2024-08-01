 import java.util.*;


 class firstclasss {
    public static void main(String args[]) {
            
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int operation=sc.nextInt();
       
       
        switch(operation) {
        case 1: int add=a+b;
        System.out.println(add);
        break;

        case 2: int sub=a-b;
        System.out.println(sub);
        break;
            
        case 3: int multi=a*b;
        System.out.println(multi);
        break;

        case 4: int div=a/b;
        System.out.println(div);
        break;
       
        case 5: int modulo=a%b;
        System.out.println(modulo);
        break;
                          
      default : 
      System.out.println("invalid");

        }

        
sc.close();
 }
}