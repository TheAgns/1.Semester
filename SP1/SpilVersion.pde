import java.lang.String;
/**
 * Array 2D. 
 * 
 * Demonstrates the syntax for creating a two-dimensional (2D) array.
 * Values in a 2D array are accessed through two index values.  
 * 2D arrays are useful for storing images. In this example, each dot 
 * is colored in relation to its distance from the center of the image. 
 */
 
import java.util.Random;

Game game = new Game(25, 25, 5, 5);
PFont font;

public void settings() {
size(750,750);
}

void setup(){
  frameRate(10);
  font = createFont("Arial", 16, true);
  textFont(font, 16);
}

void keyReleased()
{
  game.onKeyReleased(key);
    game.onArrowReleased(key);
}

void keyPressed()
{
  game.onKeyPressed(key);
  game.onArrowPressed(key);
}

void draw()
{
  game.update();
  background(0); //Black
  // This embedded loop skips over values in the arrays based on
  // the spacer variable, so there are more values in the array
  // than are drawn here. Change the value of the spacer variable
  // to change the density of the points
  int[][] board = game.getBoard();
  for (int y = 0; y < game.getHeight(); y++)
  {
    for (int x = 0; x < game.getWidth(); x++)
    {
      if(board[x][y] == 0)
      {
        fill(0,0,0);
      }
      else if(board[x][y] == 1)
      {
        fill(0,0,255);
      }
      else if(board[x][y] == 2)
      {
        fill(255,0,0);
      }
      else if(board[x][y] == 3)
      {
        fill(0,255,0);
      }
      else if(board[x][y] == 4)
      {
        fill(123,123,255);
      }
      stroke(100,100,100);
      rect(x*30, y*30, 30, 30);
    }
  }
  if(game.getPlayerLife() > 0 && game.getPlayerLife2()>0){
  fill(255);
  text("Player1 Lifes: "+game.getPlayerLife(), 25,25);
  text("Player2 Lifes: "+game.getPlayerLife2(),width-150,25);
  }else if (game.getPlayerLife() <= 0){
    fill(255);
    textSize(80);
    text("Player 2 wins", width/3, height/3);
    noLoop();
  }else if (game.getPlayerLife2() <= 0){
     fill(255);
    textSize(80);
    text("Player 1 wins", width/3, height/3);
    noLoop();
  }
}
