/*turtle-graphics.java
@author: Evelyn Garcia
@version: 2017.10.12
*/

import java.util.*;


/*turtle-graphics class*/
class TurtleGraphics {

  //pen status
  private static boolean draw = false;

  ///turtle coordinates
  private static int x, y;

  //commands array
  var commands[];

  //floor 20x20 array
  private static int floor[][] = new int [20][20];

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

  /*command 5*/
  public void moveForward(){
  //moveForward
  }

  /*command 6 -- display 20x20 floor array*/
  public void displayFloor(){
  //displayFloor
  for(int i = 0; i < 20; i++) {
        for (int j = 0; j < 20; j++) {
            System.out.print(floor[i][j] + " ");
            System.out.println();
        }
    }
  }

  /*command 9*/
  public void end(){
  //end
  }

  public void myProgram() {
    Turtle evelyn = new Turtle(0,0);
    this.add(evelyn);
    evelyn.moveForward();
  }

  public static void main(String[] args) {

    //scan commands
    Scanner scan = new Scanner(System.in);

  }

}
