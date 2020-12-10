import java.util.Random;

class Game
{
  private Random rnd;
  private int width;
  private int height;
  private int[][] board;
  private Keys keys;
  private int playerLife;
  private Dot player;
  private Dot player2;
  private int playerLife2;
  private Dot[] enemies;
  private Dot[] food;
  private int maxLife=10;
  
   
  Game(int width, int height, int numberOfEnemies, int numberOfFood)
  {
    if(width < 10 || height < 10)
    {
      throw new IllegalArgumentException("Width and height must be at least 10");
    }
    if(numberOfEnemies < 0)
    {
      throw new IllegalArgumentException("Number of enemies must be positive");
    } 
    this.rnd = new Random();
    this.board = new int[width][height];
    this.width = width;
    this.height = height;
    keys = new Keys();
    food = new Dot[numberOfFood];
    player = new Dot(0,0,width-1, height-1);
    player2 = new Dot(width-1,0,width-1,height-1);
    enemies = new Dot[numberOfEnemies];
    for(int i = 0; i < numberOfEnemies; ++i)
    {
      enemies[i] = new Dot(width/2, height/2, width-1, height-1);
    }
    for(int i = 0; i < numberOfFood; ++i)
    {
      food[i] = new Dot(0, 0, width-1, height-1);
    }
    this.playerLife = 10;
    this.playerLife2 = 10;
  }
  
  public int getWidth()
  {
    return width;
  }
  
  public int getHeight()
  {
    return height;
  }
  
  public int getPlayerLife()
  {
    return playerLife;
  }
  public int getPlayerLife2()
  {
    return playerLife2;
  }
  public void onKeyPressed(char ch)
  {
    keys.onKeyPressed(ch);
  }
  
  public void onKeyReleased(char ch)
  {
    keys.onKeyReleased(ch);
  }
  
  public void onArrowPressed(char ch){
    keys.onArrowPressed(ch);
  }
  
  public void onArrowReleased(char ch){
    keys.onArrowReleased(ch);
  }
  
  public void update()
  {
    updatePlayer();
    updatePlayer2();
    updateEnemies();
    updateFood();
    checkForCollisions();
    clearBoard();
    populateBoard();
  }
  
  
  
  public int[][] getBoard()
  {
    //ToDo: Defensive copy?
    return board;
  }
  
  private void clearBoard()
  {
    for(int y = 0; y < height; ++y)
    {
      for(int x = 0; x < width; ++x)
      {
        board[x][y]=0;
      }
    }
  }
  
  private void updatePlayer2(){
    //Update player2
    if(keys.upDown() && !keys.downDown())
    {
      player2.moveUp();
    }
    if(keys.leftDown() && !keys.rightDown())
    {
      player2.moveLeft();
    }
    if(keys.downDown() && !keys.upDown())
    {
      player2.moveDown();
    }
    if(keys.rightDown() && !keys.leftDown())
    {
      player2.moveRight();
    }  
  }
  private void updatePlayer()
  {
    //Update player
    if(keys.wDown() && !keys.sDown())
    {
      player.moveUp();
    }
    if(keys.aDown() && !keys.dDown())
    {
      player.moveLeft();
    }
    if(keys.sDown() && !keys.wDown())
    {
      player.moveDown();
    }
    if(keys.dDown() && !keys.aDown())
    {
      player.moveRight();
    }  
  }
  
  private void updateEnemies()
  {
    for(int i = 0; i < enemies.length; ++i)
    {
      //Should we follow or move randomly?
      //2 out of 3 we will follow..
      if(rnd.nextInt(3) < 2)
      {
        //We follow
         //We follow
  if((int)dist(player.getX(),player.getY(),enemies[i].getX(),enemies[i].getY()) <= (int)dist(player2.getX(),player2.getY(),enemies[i].getX(),enemies[i].getY())){
        int dx = player.getX() - enemies[i].getX();
        int dy = player.getY() - enemies[i].getY();
        if(abs(dx) > abs(dy))
        {
         
          if(dx > 0)
          {
            //Player is to the right
            enemies[i].moveRight();
          }
          else
          {
            //Player is to the left
            enemies[i].moveLeft();
          }
        }
        else if(dy > 0)
     
        {
          //Player is down;
          enemies[i].moveDown();
        }
        else
        {//Player is up;
          enemies[i].moveUp();
        }
  }
        //we follow player 2
        if((int)dist(player.getX(),player.getY(),enemies[i].getX(),enemies[i].getY()) > (int)dist(player2.getX(),player2.getY(),enemies[i].getX(),enemies[i].getY())){
        int dx = player2.getX() - enemies[i].getX();
        int dy = player2.getY() - enemies[i].getY();
        if(abs(dx) > abs(dy)) {
         
          if(dx > 0){
            //Player is to the right
            enemies[i].moveRight();
          }
          else
          {
            //Player is to the left
            enemies[i].moveLeft();
          }
        }
        else if(dy > 0)
     
        {
          //Player is down;
          enemies[i].moveDown();
        }
        else
        {//Player is up;
          enemies[i].moveUp();
        }
      }
      else
      {
        //We move randomly
        int move = rnd.nextInt(4);
        if(move == 0)
        {
          //Move right
          enemies[i].moveRight();
        }
        else if(move == 1)
        {
          //Move left
          enemies[i].moveLeft();
        }
        else if(move == 2)
        {
          //Move up
          enemies[i].moveUp();
        }
        else if(move == 3)
        {
          //Move down
          enemies[i].moveDown();
        }
      }
  }
      }
    }
  private void populateBoard(){
    //Insert player
    board[player.getX()][player.getY()] = 1;
    //Insert player2
   board[player2.getX()][player2.getY()] = 4;
    //Insert enemies
    for(int i = 0; i < enemies.length; ++i)
    {
      board[enemies[i].getX()][enemies[i].getY()] = 2;
    }
    for(int i = 0; i < food.length; ++i)
    board[food[i].getX()][food[i].getY()] = 3;
  }
  
  private void updateFood(){
    for(int i = 0; i < food.length; ++i)
    {
      //Should we follow or move randomly?
      //2 out of 3 we will follow..
      if(rnd.nextInt(3) < 2){
        if((int)dist(player.getX(),player.getY(),food[i].getX(),food[i].getY()) < (int)dist(player2.getX(),player2.getY(),food[i].getX(),food[i].getY())){
        //We follow
        int dx = player.getX() - food[i].getX();
        int dy = player.getY() - food[i].getY();
        if(abs(dx) > abs(dy))
        {
          if(dx > 0)
          {
            //Player is to the right
            food[i].moveLeft();
          }
          else
          {
            //Player is to the left
            food[i].moveRight();
          }
        }
        else if(dy > 0)
        {
          //Player is down;
          food[i].moveUp();
        }
        else
        {//Player is up;
          food[i].moveDown();
        }
        }if((int)dist(player.getX(),player.getY(),food[i].getX(),food[i].getY()) > (int)dist(player2.getX(),player2.getY(),food[i].getX(),food[i].getY())){
        //We follow
        int dx = player2.getX() - food[i].getX();
        int dy = player2.getY() - food[i].getY();
        if(abs(dx) > abs(dy))
        {
          if(dx > 0)
          {
            //Player is to the right
            food[i].moveLeft();
          }
          else
          {
            //Player is to the left
            food[i].moveRight();
          }
        }
        else if(dy > 0)
        {
          //Player is down;
          food[i].moveUp();
        }
        else
        {//Player is up;
          food[i].moveDown();
        }
      }
      }
      else
      {
        //We move randomly
        int move = rnd.nextInt(4);
        if(move == 0)
        {
          //Move right
          food[i].moveLeft();
        }
        else if(move == 1)
        {
          //Move left
          food[i].moveRight();
        }
        else if(move == 2)
        {
          //Move up
          food[i].moveDown();
        }
        else if(move == 3)
        {
          //Move down
          food[i].moveUp();
        }
      } 
     /* if(food[i].getX() == player.getX() && food[i].getY() == player.getY()){
        food[i] = new Dot ((int)random(width-1), (int)random(height-1), width-1, height-1);
    }
     if(food[i].getX() == player2.getX() && food[i].getY() == player2.getY()){
        food[i] = new Dot ((int)random(width-1), (int)random(height-1), width-1, height-1);
    }*/
    }
  }
   
  private void checkForCollisions()
  {
    //Check enemy collisions
    for(int i = 0; i < enemies.length; ++i)
    {
      if(enemies[i].getX() == player.getX() && enemies[i].getY() == player.getY())
      {
        //We have a collision
        --playerLife;
      }
    }
    //Check enemy collisions player2
    for(int i = 0; i < enemies.length; ++i)
    {
      if(enemies[i].getX() == player2.getX() && enemies[i].getY() == player2.getY())
      {
        //We have a collision
        --playerLife2;
      }
    }   //player1 food
       for(int i = 0; i < food.length; ++i)
    {
      if(food[i].getX() == player.getX() && food[i].getY() == player.getY())
      {
        //We have a collision
     ++playerLife;
      }
    }
      for(int i = 0; i < food.length; ++i){
      //player2 food
      if(food[i].getX() == player2.getX() && food[i].getY() == player2.getY())
      {
        //We have a collision
     ++playerLife2;
      }
      //Food spawner et randomsted når den når player 1 kolliderer
       if(food[i].getX() == player.getX() && food[i].getY() == player.getY()){
        food[i] = new Dot ((int)random(width-1), (int)random(height-1), width-1, height-1);
    }
     if(food[i].getX() == player2.getX() && food[i].getY() == player2.getY()){
        food[i] = new Dot ((int)random(width-1), (int)random(height-1), width-1, height-1);
    }
      if(playerLife>maxLife){
  playerLife--;
  }
  if(playerLife2>maxLife){
  playerLife2--;
  }
}
}
}
