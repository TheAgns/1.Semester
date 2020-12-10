//2.a Look at the file TaskTwoA and fill out the missing line, using the happy boolean.
int et = 30;
int to = 50;
boolean happy = true;
String str = "hej";
String leo="haj";

void setup() {
   if (iAmHappy())
   {
     println("I clap my hands");
   }
   else
   {
     println("I don't clap my hands"); 
   }
   println(sumAfInt(et,to));
   println( minFunktion(str) );
   println(sidsteOpgave(leo));
}



boolean iAmHappy(){
return true;

  // fill out what is missing here: 
  
}

//2.b Write a function that receives to integers as parameters and returns the sum of them.
int sumAfInt(int et, int to){
  int sum = et + to;
  return sum;
}
//2.c Write a function that receives a string and returns it as uppercase. 
//(Hint: ".toUpperCase()". Further hint: https://www.w3schools.com/jsref/jsref_toUpperCase.asp )
 String minFunktion(String str){
  String res = str.toUpperCase();
  return res;
 }
  
//2.d Write a function that receives a string and returns true if the first letter of the string is uppercase. 
//(Hints: ".charAt(0)" and "Character.isUpperCase('a');" )

boolean sidsteOpgave(String leo){
return Character.isUpperCase(leo.charAt(0));
}
