//1.a Write a function that prints an empty line and call it from setup();
void emptyLine(){
  println(" ");
}

void setup(){
  emptyLine();
  stringParameter("hey");
  nameAge("Markus", 22);
  
}
//1.b Write a function that receives a string as a parameter and prints it. call this function from setup()
void stringParameter(String parameter){
  println(parameter);
}

//1.c Write a function that receives a string called
//"name" and an integer called "age" and call it from setup 
//with your own name and age. Have the function print the text "My name is \<name\>, I am <age> years old".
void nameAge(String name,int age){
  println("My name is " + name + " i'm " + age + " years old");
}
