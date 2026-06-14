import processing.core.PApplet;

public class Sketch extends PApplet {
  // ============================================
  // CUSTOMIZE ME #1: Tree settings
  // Change these numbers and see what happens!
  // ============================================

  // How tall is the trunk?
  int startingLength = 120;  
  // When do branches stop splitting? 
  int minLength = 4;       
  // How much smaller is each new branch? (try 0.5 to 0.8)   
  float shrinkFactor = (float)0.67;  
  // How wide do branches spread? (in degrees)
  int branchAngle = 25;     

  public void settings() {
    size(600, 600);
  }

  public void setup() {
    background(0);
  }

  public void draw() {
    for (int i = 0; i <  height; i++) {
      stroke(300, 200, 150 +(i/4)); //fades from peach to ligth blue
      line (0, i , width, i); //sunset
    }

    // fill(222, 164, 245, 180);
    // noStroke();
    // ellipse(random(width), random(height), 5, 5);
    
    
    // Start drawing from the bottom-center of the screen

     // Draw the tree 1!
    pushMatrix();
    translate(width/2, height);
    startingLength = 180;
    drawBranch(startingLength);
    popMatrix();
    
    // Draw the tree 2!
    pushMatrix();
    translate(width/4, height);
    startingLength = 100;
    drawBranch(startingLength);
    popMatrix();

    // Draw the tree 3!
    pushMatrix();
    translate(width/6, height);
    startingLength = 0;
    drawBranch(startingLength);
    popMatrix();
  }

  //mini cute house :)
    //house
    public void house() {
    fill(250);
    noStroke();
    rect(0,0, 300, 600);

    }
    

  /**
  * The recursive method that draws a tree.
  * A branch draws itself, then asks two smaller branches to draw themselves.
  */
  public void drawBranch(float length) {
    
    // ============================================
    // CUSTOMIZE ME #2: How does each branch look?
    // Try changing the color or thickness!
    // ============================================
    stroke(80, 50, 20);              // brown
    strokeWeight(map(length, minLength, startingLength, 1, 8));       // thicker branches at the base
    
    // Draw this branch going "up" (negative y in Processing)
    line(0, 0, 0, -length);
    
    // Move the pen to the tip of the branch we just drew
    translate(0, -length);
    
    // BASE CASE: stop when the branches get too small
    if (length < minLength) {
      
      // ============================================
      // CUSTOMIZE ME #3: What's at the tip of a branch?
      // This is where you can draw leaves, flowers, fruit...
      // ============================================
      fill(113, 133, 98);
      noStroke();
      float leafSize =  random(5, 12);
      ellipse(0, 0, leafSize, leafSize);
  
      return;  // stop recursing
    }
    
    // RECURSIVE CASE: draw a smaller tree on the right...
    float variety = random(-15, 15);

    pushMatrix();
    rotate(radians(branchAngle + variety));
    drawBranch(length * shrinkFactor);
    popMatrix();
    
    // ...and a smaller tree on the left.
    pushMatrix();
    rotate(radians(-branchAngle + variety));
    drawBranch(length * shrinkFactor);
    popMatrix();
    
    leaves();

  } 
    //fruits
    public void leaves() {
        fill(112, 25, 34);
        //fruit code goes here!
        noStroke();
        ellipse(0, 0, 4, 4);

    }

  
}