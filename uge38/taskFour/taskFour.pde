int[] a = new int[3];
String[] b = new String[3];
boolean[] c = new boolean[3];


void setup(){
b[0]= "Sten";
b[1]= "Stor sten";
b[2]= "lille sten";
bogstavB(b);

a[0]= 10;
a[1]= 20;
a[2]= 30;
println(sumA(a));
println(averageA(a));

c[0] = true;
c[1] = true;
c[2] = false;

println(sidsteA(a));
}

void bogstavB(String[] b){
  for(int i = 0; i < b.length; i++){
    println(b[i]);
  }
  //4.c Write a function that receives an integer array as a parameter and returns the sum of all elements in the array.

}
  int sumA(int[] a){
    int sum = 0;
     for(int i = 0; i < a.length; i++){
       sum+= a[i];
     }
     return sum;
}
//4.d Write a function that receives an integer array as a parameter and returns the average value.  
int averageA(int[] a){
    int sum = 0;
     for(int i = 0; i < a.length; i++){
       sum+= a[i];
     }
     return sum/a.length;
}
//4.e Consider how you could write a function that takes in an integer array as a parameter and returns the array sorted from lowest to highest value.
 int[] sidsteA(int[]a){
   for(int i = 0; i < a.length; i++){
     for(int o=i; o < a.length; o++){
       if(a[i]>a[o]){
         int p;
         p = a[i];
         a[i]=a[o];
         a[o]=o;
     }
   }
   }
   return a;
 }
