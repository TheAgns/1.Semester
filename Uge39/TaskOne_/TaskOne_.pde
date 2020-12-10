void setup(){

}

//1.a
int[]arrayValues = {8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2};

//1.b
for (int i = 0; i < arrayValues.length-1; i++) {
    if (arrayValues [i] > arrayValues[i+1]) { 
      println(arrayValues[i]);
  }
  if (arrayValues[i] < arrayValues[i+1]) {
println(arrayValues[i+1]);
  }
}
//1.c
