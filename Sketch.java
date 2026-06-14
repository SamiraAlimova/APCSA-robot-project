import processing.core.PApplet;

public class Sketch extends PApplet {

    int targetX = 105;
    int targetY = 240;

    public void settings() {
        size(600, 600);
       // angleMode(DEGREES);
    }

    public void setup() {
        
      frameRate(10);
        
    } //end of settign process

    public void draw() {
    background(109, 131, 181);
    //draw my Robot 
    
    //ears
    fill(random(255), random(255), random(255));
    circle(targetX + 135, targetY - 97, 20);
    circle(targetX + 255, targetY - 97, 20);

    //head
    fill(215, 216, 217);
    ellipse(targetX + 195, targetY - 90, 120, 90);

    //eyes rect
    fill(255, 255, 255);
    rect(targetX + 157, targetY - 110, 20, 24);
    rect(targetX + 217, targetY - 110, 20, 28);

    //eyes cirlce
    fill(150, 89, 14);
    ellipse(targetX + 166, targetY - 93, 10, 10);
    ellipse(targetX + 223, targetY -  92, 10, 10);

    
    //mouse
    fill(255, 255, 255);
    rect(targetX + 184, targetY - 71, 20, 10 );

    //teeth
    fill(5, 5, 5);
    line(targetX + 191, targetY - 71, targetX + 191, targetY - 62);
    line(targetX + 198, targetY - 71, targetX + 198, targetY - 62);

    //signal head
    fill(255, 255, 255);
    rect(targetX + 191, targetY - 133 , 6, - 50);

    fill(139, 179, 158);
    circle(targetX + 194, targetY - 187, 15);
  
     // moon like arc
    fill(random(255), random(255),random(255));
    arc(targetX + 370, targetY - 3, 120, 120, radians(270), radians(450));

    fill(242, 217, 107);
    arc(targetX + 365, targetY - 3, 100, 100, radians(270), radians(450), CHORD);

    //neck
    fill(237, 229, 81);
    circle(targetX + 194, targetY - 36, 17 );

    fill(149, 195, 230);
    circle(targetX + 194, targetY - 19, 17 );

    fill(185, 250, 222);
    circle(targetX + 194, targetY - 1, 17 );
    
    //shoulders
    fill(174, 122, 214);
    circle(targetX + 142, targetY - 2, 26);
    circle(targetX + 242, targetY - 2, 26);

    //dress quad
    fill(201, 165, 179);
    quad(targetX + 154, targetY - 3, targetX + 230, targetY - 3, targetX + 283, targetY + 150 , targetX + 115, targetY + 150);

    //rect
    fill(252, 212, 226);
    rect(targetX + 172, targetY + 40, 40, 35);

    //midlle rect
    fill(random(255), random(255), random(255));
    rect(targetX + 183, targetY + 50, 20, 17);

    //elements for dress
    fill(158, 200, 219);
    circle(targetX + 121, targetY + 158, 30);

    fill(242, 218, 160);
    circle(targetX + 151, targetY + 158, 30);

    fill(211, 247, 181);
    circle(targetX + 181, targetY + 158, 30);

    fill(143, 114, 186);
    circle(targetX + 211, targetY + 158, 30);

    fill(194, 125, 91);
    circle(targetX + 241, targetY + 158, 30);

    fill(242, 169, 85);
    circle(targetX + 271, targetY + 158, 30);

    // leg
    fill(215, 216, 217);
    ellipse(targetX + 196, targetY + 171, 15, 8);
    ellipse(targetX + 196, targetY + 180, 15, 8);
    ellipse(targetX + 196, targetY + 190, 15, 8);
    ellipse(targetX + 196, targetY + 200, 15, 8);
    ellipse(targetX + 196, targetY + 210, 15, 8);
    ellipse(targetX + 196, targetY + 220, 15, 8);
    ellipse(targetX + 196, targetY + 230, 15, 8);
    ellipse(targetX + 196, targetY + 240, 15, 8);
    ellipse(targetX + 196, targetY + 250, 15, 8);

    // leg foot
     fill(237, 212, 161);
    rect(targetX + 134, targetY + 250, 115, 30, 28);

    //leg mini foots
    fill(random(255), random(255), random(255));
    ellipse(targetX + 176, targetY + 285, 13, 27);
    ellipse(targetX + 205, targetY + 285, 13, 27);

    //rect arms
    fill(213, 229, 235);
    rect(targetX + 253, targetY - 5, 120, 15);
    rect(targetX + 9, targetY - 5, 120, 15);

    //arms feet
    fill(227, 255, 249);
    ellipse(targetX + 375, targetY, 15, 25);
    ellipse(targetX, targetY, 15, 25);
    
    //text
    fill(random(255), random(255), random(255));
    textSize(80);
    text("Hello" , 110, 80);
    text("World !" , 310, 80);

    System.out.println(mouseX + " " + mouseY);

        
    }//end of tthe drawing process

    public void mousePressed() {
        targetX += 10;
        targetY -= 10;
    }

}
