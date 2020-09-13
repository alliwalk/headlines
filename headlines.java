import processing.core.*; 
import processing.xml.*; 

import java.applet.*; 
import java.awt.*; 
import java.awt.image.*; 
import java.awt.event.*; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class headlines extends PApplet {

// a headline
String[] headlines = {
  "New study confirms: Allison is a genius...",
  "In other news, a completely fake study on intelligence was released today.",
};


PFont f; // Global font variable
float x; // horizontal location of headline
int index = 0;


public void setup (){
  size(400, 200);
  f = createFont("Arial", 16, true); // Loading font
  x = width; // initializing headline off-screen to the right
  
}


public void draw(){
  background(x, frameRate*3, frameRate/7, random(255));
  
  // diplay headline
  textFont(f, 16);
  textAlign(LEFT);
  fill(255);
  text(headlines[index], x, 180);
  
  // Decrement x
  
  x = x-3;
  
  float w = textWidth(headlines[index]);
  if (x < -w) {
   x = width; 
   index = (index +1) % headlines.length;
  }
}


  static public void main(String args[]) {
    PApplet.main(new String[] { "--present", "--bgcolor=#666666", "--stop-color=#cccccc", "headlines" });
  }
}
