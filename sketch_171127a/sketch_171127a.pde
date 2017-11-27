void setup()/*setting*/{
size(400,600); //windows size
background(0, 255, 0);
//line(100,200, 300,400);//r:0-255
}
void draw(){
  strokeWeight(40);//size
  stroke(#549D19);//color
if(mousePressed)
  line(mouseX,mouseY, pmouseX,pmouseY);

}