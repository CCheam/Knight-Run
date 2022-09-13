import java.util.ArrayList;
import java.util.Arrays;  
import java.util.*;  
class Main {
  public static void main(String[] args) {
    //declare knight pos and board and other setup
    boolean Moving = true;
     Board b =new Board(8,8);
     Scanner sc = new Scanner(System.in);
    //starting input
    System.out.println("Please input starting y(1-8) and starting x (1-8)");
    System.out.print("y: ");
    int p1=sc.nextInt()-1;
    System.out.print("x: ");
    int p2=sc.nextInt()-1;
    //out of bounds check on both inputs for security
    while(p1+1<1||p1+1>8){
      System.out.println("Y value out of range. Please pick a new value in range (1-8)");
      System.out.print("y: ");
       p1=sc.nextInt()-1;
    }
    //p2 check
    while(p2+1<1||p2+1>8){
      System.out.println("X value out of range. Please pick a new value in range (1-8)");
      System.out.print("x: ");
       p2=sc.nextInt()-1;
    }
    //initial knight setup
    Knight knight=new Knight(p1,p2,b);
    knight.moveKnight(p1,p2);
//loop for running game 
    while(Moving){ 
      //user input for position update
      System.out.println(b.toString());
      System.out.println("Please input next move (first y(1-8), then x(1-8))");
      int i = sc.nextInt()-1;
      int j = sc.nextInt()-1;
      //soft barrier against returning to previous position
      while(!(b.getPos(i,j).equals("0 "))){
        System.out.println("Space occupied. Choose again!");
        System.out.print("New y:");
         i = sc.nextInt()-1;
        System.out.print("New x:");
         j = sc.nextInt()-1;
      }
      //position setup to check for move legality
      int g=knight.getX();
      int h=knight.getY();
      //checks if it is legal move on y axis
    while((i!=h+1)&&(i!=h+1)&&(i!=h-1)&&(i!=h-1)&&(i!=h+2)&&(i!=h+2)&&(i!=h-2)&&(i!=h-2)){
      System.out.println("Illegal move. Please choose a legal move");
      System.out.print("New y:");
      i = sc.nextInt()-1;
       System.out.print("New x:");
        j = sc.nextInt()-1;
    }
//check x axis move legality
      while((j!=g+2)&&(j!=g-2)&&(j!=g+2)&&(j!=g-2)&&(j!=g+1)&&(j!=g-1)&&(j!=g+1)&&(j!=g-1)){
      System.out.println("Illegal move. Please choose a legal move");
      System.out.print("New y:");
      i = sc.nextInt()-1;
       System.out.print("New x:");
        j = sc.nextInt()-1;
    }
      knight.moveKnight(i,j);
      Moving=knight.canMove();
    }
      System.out.println(b.getCount()+" spaces were covered.");
  }
}

