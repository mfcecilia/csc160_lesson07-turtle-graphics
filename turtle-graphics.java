/*turtle-graphics.java
@author: Evelyn Garcia
@version: 2017.10.12
*/

import java.util.*;


/*turtle-graphics class*/
class TurtleGraphics {

  //pen status -- false = pen up
  private static boolean draw = false;

  ///turtle starting coordinates
  private static int startx, starty;

  //new turtle coordinates
  private static int newx, newy;

  //direction
  private static int direction = 0;

  //commands array
  public int commands[20];

  //floor 20x20 array
  private static int floor[20][20];

  /**
     * Creates a new Turtle object on the floor.
     * @param x     The x-coordinate of the turtle.
     * @param y     The y-coordinate of the turtle.
     */
    public Turtle(int xx, int yy)
    {
        x = xx;
        y = yy;
    }


  /*command 1 -- pen up*/
  public void penUp(){
  //don't draw
  draw = false;
  }

  /*command 2*/
  public void penDown(){
  //draw
  draw = true;
  }

  /*command 3*/
  public void turnRight(){
  //turnRight
  }

  /*command 4*/
  public void turnLeft(){
  //turnLeft
  }

  /*command 5 -- move forward specified number of spaces*/
  public void moveForward(int spaces){
    //moveForward
    //set floor to 1 if pen is down
    if (draw) {
      floor[newx][newy] = 1;
    } else {
      floor[newx][newy] = 0;
    }
  }

  /*command 6 -- display 20x20 floor array*/
  public void displayFloor( ){

  for(int i = 0; i < 20; i++) {
      for (int j = 0; j < 20; j++) {
          System.out.print(floor[i][j] + " ");
          System.out.println();
      }
    }
  }

  public void enterCommands(){
    //ask user for commands
    System.out.println("Please enter 7 commands. Choose from the following:\n");
    //display commands options
    System.out.println("1 -- Pen up\n");
    System.out.println("2 -- Pen down\n");
    System.out.println("3 -- Turn right\n");
    System.out.println("4 -- Turn left\n");
    System.out.println("5,x -- Move forard x spaces\n");
    System.out.println("6 -- Display the floor\n");
    System.out.println("9 -- End of data\n");
    //scanner to take maximum of 7 commands
    Scanner scan = new Scanner(System.in);
    //store in commands array
    for (int a = 0; a < 7; a++) {
      commands[a] = scan.nextInt();
    }
  }

  public void executeCommands(){
    //analyze commands array
    //run commands
  }

  /*command 9*/
  public void end(){
    //end
    return;
  }

  public static void main(String[] args) {
    //get commands
    enterCommands();
    //run given commands
    executeCommands();
    return;
  }
}
