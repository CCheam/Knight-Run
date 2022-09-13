//stores positions of numbers and position update methods
public class Board{
 private String br[][];
 private int count=0;
  public Board(int s1,int s2){
   br= new String[s1][s2];
    //sets all array values to 0 for start
     for (int row = 0; row < br.length; row++)
        {
           for (int col = 0; col < br[0].length; col++)
           {
             br[row][col]="0 ";
           }
        }
    }
  //checks contents of a current position
  public String getPos(int c,int d){
 String p=br[c][d];
    return p;
  };
//methods to return 
  //gets total # of moves and returns it
  public int getCount(){
  return count;
}
  //gets the board array for calculations
  public String[][] getBoard(){
    return br;
  }
//updates knight's past and current position based on boolean
  public void updatePos(int g, int h,boolean l){
    //checks if it is the current or past position of the knight
    if(!l){
   br[g][h]=Integer.toString(count); 
      //check if digit at pos is 1 digit and adds space if so
      if(br[g][h].length()==1){
        br[g][h]+=" ";
      }
    }
   else{
     br[g][h]="K ";
     count++;
   }
  }
public String toString(){
String r="";
//for loop to return board values for printing out
  for (int row = 0; row < br.length; row++)
      {
         for (int col = 0; col < br[0].length; col++)
         {
           r+=br[row][col]+" ";
         }
        r+="\n";
      }
return r;
  }
}