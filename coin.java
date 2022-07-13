import java.util.Random;
import java.util.Scanner;
class coin {
  public static void main(String args[]) {
      int h=0;
      int t=0;
      int f=0;
      System.out.println("Who are you?");
      Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        System.out.println("Hello,"+str+"!");
    System.out.println("Tossing a coin...");
      for(int i=1;i<=3;i++){
    Random rand = new Random();
    f = rand.nextInt(2);
    if(f==1){      
    System.out.println("Round "+i+"Heads");
    h++;
    }
    else {
        System.out.println("Round "+i+"Tails");
        t++;
    }
        
  }
  System.out.println("Heads:"+h+",Tails:"+t);
  if(h>t){
    System.out.println(str+" won!");
  }
  else{
    System.out.println(str+" lost!");
  }


}
}