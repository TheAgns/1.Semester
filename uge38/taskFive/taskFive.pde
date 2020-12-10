//5.a Create an array of Students (the class created in Task 3) with 10 elements in it. Each student must have a unique name.
Student[] arrayOfStudent = new Student[10];
int index = 2;
String name = "Markus";
void setup(){
arrayOfStudent[0] = new Student("Markus" , 22 , true , "A");
arrayOfStudent[1] = new Student ("Abdi" , 20 , true , "A");
arrayOfStudent[2] = new Student ("Firat" , 19 , true , "A");
arrayOfStudent[3] = new Student ("Jenbo" , 24 , true , "A");
arrayOfStudent[4] = new Student ("Mustafa" , 20 , true , "A");
arrayOfStudent[5] = new Student ("Mikkel" , 25 , true , "A");
arrayOfStudent[6] = new Student ("Benjamin" , 15 , true , "A");
arrayOfStudent[7] = new Student ("Rasmus" , 22 , true , "A");
arrayOfStudent[8] = new Student ("Julius" , 20 , true , "A");
arrayOfStudent[9] = new Student ("Claus" , 29 , true , "A");
println(studentNavn(arrayOfStudent, index));


println(findName(arrayOfStudent,name));
}
String studentNavn(Student[] arr, int n){
  return arr[n].name;
}

  int findName(Student[] student, String  findingName){
    for(int i = 0; i < student.length; i++){
      if(student[i].name == findingName){
        return i;
      }
    }
        return -1;
      }
