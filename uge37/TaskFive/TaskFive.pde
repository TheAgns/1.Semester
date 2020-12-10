void setup() {
  MethodOne(); 
  MethodTwo(); 
}

/*
  The following method has an error in it. Fix the error and run it. 
*/

void MethodOne()
{
  int i = 1000; // You are not allowed to change this line. 
  
  int max = 10;
  
  if (i > max)
  {
    String output = "i is greater than "+max+".";   
     println(output);
  }
  
   
}

/* 
  Finish the following method so that we can change the number assigned 
  to the weekday and it prints the correct output.  
*/
void MethodTwo() 
{
  int weekDay = 6; // 0 = Monday, 6 = Sunday. //float weekDay=(int)random(0,6);
  boolean weekend = false;
  
  if (weekDay==0){
  println("Monday");
}
else if(weekDay==1){
println("Tuesday");
}
else if(weekDay==2){
println("Wedensday");
}
else if(weekDay==3){
println("Thursday");
}
else if(weekDay==4){
println("Friday");
}
else{weekend=true;}
if(weekend){
  println("Weekend");
}
}
