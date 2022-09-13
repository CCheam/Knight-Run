//logic to check if knight can move and stored position
public class Knight{
  //initial setup
private boolean canMove;
private int space1;
private int space2;
private Board b1;
private String bArr[][];
private boolean k=false;
  
public Knight(int a, int b,Board c){
  //sets up initial position and board
  space1=a;
  space2=b;
  b1=c;
  bArr=c.getBoard();
}
  //moves knight to new pos, updates old pos and updates current postion variable
public void moveKnight(int n1, int n2){
  b1.updatePos(space1,space2,k);
  space1=n1;
  space2=n2;
  k=true;
  b1.updatePos(space1,space2,k);
  k=false;
  bArr=b1.getBoard();
}
  //get methods for x and y positions
  public int getX(){return space2;}
  public int getY(){return space1;}
//determines if the knight can move, used for game loop
public boolean canMove(){
  //individual checks, but I couldn't figure out how to work it so that it won't throw up errors 
  boolean downCheck=true;
  boolean upCheck=true;
  boolean rightCheck=true;
   boolean leftCheck=false;
  //attempts at calculating if there is no potential spaces to move
 
  if (leftCheck&&rightCheck&&upCheck&&downCheck){
return false;
  }
  return true;
};

  }

