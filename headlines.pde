// a headline
String[] headlines = {
  "New study confirms: Allison is a genius...",
  "In other news, a completely fake study on intelligence was released today.",
};


PFont f; // Global font variable
float x; // horizontal location of headline
int index = 0;


void setup (){
  size(400, 200);
  f = createFont("Arial", 16, true); // Loading font
  x = width; // initializing headline off-screen to the right
  
}


void draw(){
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

