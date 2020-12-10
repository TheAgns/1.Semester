/*4.a Write a method that takes in an integer as a 
parameter and prints all values between 0 and 
100 that are divisible by the parameter received.*/

void setup(){
  divisible(20);
  raandomNumber();
  factorial(10);
  fibonacciSequence(1,1);
}
void divisible(int divisible2){
  for(int i = 0; i<=100; i++){
  if(i%divisible2==0){
    println(i);
  }
  }
}
void raandomNumber(){
  int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 };
int index = int(random(arr.length));
println(arr[index]);
}

/*int f=20;
 for (int i = 0; i<20; i++) {
f = (f - 1);
println(f);
}*/


   void factorial(int n) {
     if(n<0) return;
     println(n);
factorial(n-1);
   }
   
   void fibonacciSequence(int a, int b){
     if(a>10000) return;
     println(a + "\t" + b);
     fibonacciSequence(b, a+b);
   }
   
   
