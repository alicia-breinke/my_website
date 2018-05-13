import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Project8_CodeArt extends PApplet {

public void draw (){
 text("Sorry, you've reached an error. Drag anywhere for help.", pmouseX, pmouseY);
 if (keyPressed == true);
    int x = key - 32;
    line(x, 0, x, height);
    

  size(640, 360);  
  stroke(255);     
  frameRate(30);
}





 
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Project8_CodeArt" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
