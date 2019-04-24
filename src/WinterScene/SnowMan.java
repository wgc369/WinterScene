package WinterScene;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape
{
   public SnowMan(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.WHITE, 0, 0);
   }

   public void draw(Graphics window)
   {
      //add code here to make a snowman 	      	
       window.setColor(getColor());
       window.fillOval(getXPos(), getYPos(), getWidth(), getHeight());
       window.fillOval(getXPos()-25, getYPos()+40, getWidth()*2, getHeight()*2);
       window.fillOval(getXPos()-50, getYPos()+100, getWidth()*3, getHeight()*2);
   }

   public void moveAndDraw(Graphics window)
   {
      draw(window);   
   }
}