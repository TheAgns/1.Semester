float radius=135;
color black=color(0);
color red=color(255,0,0);
color yellow=color(255,255,0);
color green=color(0,255,0);

void setup(){
  size(320,600);
  background(0);
}

void draw(){
  //her laver jeg cirklerne og deres "slukkede" farver grå.
  fill(140);
  circle(width/2,height*0.20,radius);
  circle(width/2,height*0.50,radius);
  circle(width/2,height*0.80,radius);
  //her laver jeg det røde lys, med en keypress nemlig r
     if(keyPressed)
     if(key=='r'||key=='R'){
       fill(red);
       circle(width/2,height*0.20,radius);
}
//og her gule lys
else if(keyPressed){
   if(key=='y'||key=='Y'){
     fill(yellow);
     circle(width/2,height*0.50,radius);
   }
   //grønne lys
   else if(keyPressed){
   if(key=='g'||key=='G'){
     fill(green);
      circle(width/2,height*0.80,radius);
}
}
}
}
