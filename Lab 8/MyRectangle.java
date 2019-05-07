

import java.awt.*;
import java.awt.event.*;

public class MyRectangle {
	
	//You need some kind of tolerance, in pixels
		//...a +/- of the mouse position to determine if it's close enough to a given edge of the rectangle
	private int tolerance = 10;
	
	// Rectangle properties
	private int x;			//the x for position
	private int y;			//the y for position
	private int width;		//the rectangle width
	private int height;		//the rectangle height 
	private Color color = Color.RED;

	private int previousX;
	private int previousY;
	// Previous coordinates, dimensions, and mouse positions
	//You will need to store the previous X and Y positions of the rectangle, as well as the height and width
	//You will also need the previous mouse position
	//This way, you can compute changes in these values and apply the necessary changes to the rectangle

	private boolean resizing = false;
	private boolean rightSide;
	private boolean moving = false;
	
	public MyRectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void processMousePressed(MouseEvent e) {
		//fill this in... what shall we do when the mouse is initially pressed down?
		//you will also need to add this method call to your handler for mouse down events
		
		int Mouse_X = e.getX();
		int Mouse_Y = e.getY();
		
		previousX = e.getX();
		previousY = e.getY();
		
		if(Mouse_X > x - tolerance && Mouse_X < x + width + tolerance 
				&& Mouse_Y > y - tolerance && Mouse_Y < y + tolerance) {
			// top side
			color = Color.GREEN;
			moving = true;
			
		}else if(Mouse_X > x - tolerance && Mouse_X < x + tolerance
				&& Mouse_Y >= y + tolerance && Mouse_Y < y + height + tolerance) {
			//left side
			color = Color.GREEN;
			moving = true;
			
		}else if(Mouse_X >= x + tolerance && Mouse_X < x + width + tolerance
				&& Mouse_Y > y + height - tolerance && Mouse_Y < y + height + tolerance) {
			//lower side
			color = Color.BLUE;
			resizing = true;
			rightSide = false;
		}else if(Mouse_X > (x + width - tolerance) && Mouse_X < (x + width + tolerance)
				&& Mouse_Y >= y + tolerance && Mouse_Y <= y + height - tolerance) {
			//right side
			color = Color.BLUE;
			resizing = true;
			rightSide = true;
		}	
	}

	public void processMouseReleased(MouseEvent e) {
		//fill this in as well... what shall we do  when the mouse is released?
		//you will also need to add this method call to your handler for mouse released events
		color = Color.RED;
		resizing = false;
		moving = false;
		
	}

	public void processMouseDragged(MouseEvent e) {
		//fill this in too... what shall we do as the mouse is being dragged around?
		//you will also need to add this method call to your handler for mouse dragged events
		
		int Mouse_X = e.getX();
		int Mouse_Y = e.getY();
		
		if(moving == true) {
			
			x = x + (Mouse_X - previousX);
			y = y + (Mouse_Y - previousY);
			

		}else if(resizing == true) {
			
			if(rightSide) {
				
				width = width + (Mouse_X - previousX);
				
			}else {
				
				height = height + (Mouse_Y - previousY);
				
			}
					
			
		}
		
		previousX = Mouse_X;
		previousY = Mouse_Y;
	}

	public void draw(Graphics g) {
		//this method receives the Graphics object of the JFrame and draws on it
		//this method simply draws the rectangle by setting its color and calling drawRect
		g.setColor(color);
		g.drawRect(x, y, width, height);
		
		//you should NOT need to add anything here...
		//in your "process" calls above, you will be modifying color, x, y, width, and height depending on the mouse position
		//in your handlers, you will be calling Main's repaint and the above "process" calls
		
	}
	
	//you may need other methods to handle stuff
}
