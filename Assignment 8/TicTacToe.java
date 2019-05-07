import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class TicTacToe extends JFrame {
	//Things you need:
		//Some way to keep track of the turn
		//Some way to keep track of the board state
		//Possibly other things depending on your implementation
	private boolean xTurn = true;
	private final int MaximumClick = 9;
	private int countClick;
	private int rowNo;
	private int columnNo;
	private int isEmpty[][] = new int[3][3];
	private boolean pressed = false;
	//Use these to determine which board position the mouse is in
	private int xTable[] = {46, 79, 113};   // xTable[i] gives the displacement for row number i
	private int yTable[] = {113, 146, 180};	// yTable[j] gives the displacement for column number j


	public TicTacToe(){
		super("Tictactoe Board");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Add handlers here
			//Use the anonymous class strategy we discussed or you're getting a max of 8/10
		
		for(int i = 0; i < 3; i++) {		
			for(int n = 0; n < 3; n++) {			
				isEmpty[i][n] = 0;				
			}	
		}	//populate all the value in the array to 0
		
		this.addMouseListener(new MouseListener() {
			
			public void mouseReleased(MouseEvent arg0) {
				
				if(isEmpty[rowNo][columnNo] == 0) {					
					if(xTurn) {						
						isEmpty[rowNo][columnNo] = 1;						
					}else {						
						isEmpty[rowNo][columnNo] = 2;						
					}					
					xTurn = !xTurn;		
				}else {					
					countClick--;					
				}			
					repaint();												
				pressed = false;				
			}
			
			public void mousePressed(MouseEvent arg0) {
				
				int MouseX = arg0.getX();
				int MouseY = arg0.getY();
				
				if(MouseX > 40 && MouseX < 73 && MouseY > 107 && MouseY < 140) {
					
					rowNo = 0;
					columnNo = 0;
					
				}else if(MouseX > 73 && MouseX < 107 && MouseY > 107 && MouseY < 140) {
					
					rowNo = 0;
					columnNo = 1;
					
				}else if(MouseX > 107 && MouseX < 140 && MouseY > 107 && MouseY < 140) {
					
					rowNo = 0;
					columnNo = 2;
					
				}else if(MouseX > 40 && MouseX < 73 && MouseY > 140 && MouseY < 173) {
					
					rowNo = 1;
					columnNo = 0;
					
				}else if(MouseX > 73 && MouseX < 107 && MouseY > 140 && MouseY < 173) {
					
					rowNo = 1;
					columnNo = 1;
					
				}else if(MouseX > 107 && MouseX < 140 && MouseY > 140 && MouseY < 173) {
					
					rowNo = 1;
					columnNo = 2;
					
				}else if(MouseX > 40 && MouseX < 73 && MouseY > 173 && MouseY < 207) {
					
					rowNo = 2;
					columnNo = 0;
					
				}else if(MouseX > 73 && MouseX < 107 && MouseY > 173 && MouseY < 207) {
					
					rowNo = 2;
					columnNo = 1;
					
				}else if(MouseX > 107 && MouseX < 140 && MouseY > 173 && MouseY < 207) {
					
					rowNo = 2;
					columnNo = 2;
					
				}
				
				if(countClick < MaximumClick) {
					
					pressed = true;
					repaint();
					
				}					
				countClick++;
			}
			public void mouseExited(MouseEvent arg0) {
			}
			public void mouseEntered(MouseEvent arg0) {
			}	
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		this.addMouseMotionListener(new MouseMotionListener() {
			
			public void mouseMoved(MouseEvent arg0) {
			}
			
			public void mouseDragged(MouseEvent arg0) {
				
				int MouseX = arg0.getX();
				int MouseY = arg0.getY();
				
				if(MouseX > 40 && MouseX < 73 && MouseY > 107 && MouseY < 140) {
					
					rowNo = 0;
					columnNo = 0;
					
				}else if(MouseX > 73 && MouseX < 107 && MouseY > 107 && MouseY < 140) {
					
					rowNo = 0;
					columnNo = 1;
					
				}else if(MouseX > 107 && MouseX < 140 && MouseY > 107 && MouseY < 140) {
					
					rowNo = 0;
					columnNo = 2;
					
				}else if(MouseX > 40 && MouseX < 73 && MouseY > 140 && MouseY < 173) {
					
					rowNo = 1;
					columnNo = 0;
					
				}else if(MouseX > 73 && MouseX < 107 && MouseY > 140 && MouseY < 173) {
					
					rowNo = 1;
					columnNo = 1;
					
				}else if(MouseX > 107 && MouseX < 140 && MouseY > 140 && MouseY < 173) {
					
					rowNo = 1;
					columnNo = 2;
					
				}else if(MouseX > 40 && MouseX < 73 && MouseY > 173 && MouseY < 207) {
					
					rowNo = 2;
					columnNo = 0;
					
				}else if(MouseX > 73 && MouseX < 107 && MouseY > 173 && MouseY < 207) {
					
					rowNo = 2;
					columnNo = 1;
					
				}else if(MouseX > 107 && MouseX < 140 && MouseY > 173 && MouseY < 207) {
					
					rowNo = 2;
					columnNo = 2;
					
				}								
					repaint();																	
			}
		});
		
		setVisible(true);
	}

	public void paint(Graphics g){
		int red = 255, green = 0, blue = 0;
		Font my_font;
		my_font = new Font( "Serif", Font.BOLD, 18 );
		super.paint(g); // Note use of super!!
		g.setColor(new Color(red, green, blue));
		g.drawLine(40, 140, 140, 140);
		g.drawLine(40, 173, 140, 173);
		g.drawLine(73, 107, 73, 207);
		g.drawLine(107, 107, 107, 207);
		g.setColor(new Color(0, 0, 0));
		g.fillRect(20, 87, 140, 5);
		g.fillRect(20, 87, 5, 140);
		g.fillRect(20, 222, 140, 5);
		g.fillRect(155, 87, 5, 140);
		g.setColor(Color.blue);
		g.setFont(my_font);
		g.drawString("My Tic Tac Toe Board", 20, 280);
		displayMoves(g); //currently does nothing.. you need to fill this in	
	}

	private void displayMoves(Graphics g){			
		for(int i = 0; i < 3; i++) {		
			for(int n = 0; n < 3; n++ ) {			
				if(isEmpty[i][n] == 1) {				
					this.drawX(g, i, n);				
				}else if(isEmpty[i][n] == 2) {				
					this.drawCircle(g, i, n);
				}			
			}		
		}
		if(pressed) {	
			if(isEmpty[rowNo][columnNo] == 0) {				
				if(xTurn) {				
					this.drawX(g, rowNo, columnNo);				
				}else {				
					this.drawCircle(g, rowNo, columnNo);				
				}				
			}						
		}
	}
	//Call this from displayMoves to draw an X	
		//You will need the row and column position of the mouse (zero-indexed)
	private void drawX(Graphics g, int rowNo, int columnNo){

		g.drawLine(xTable[columnNo], yTable[rowNo],
				xTable[columnNo] + 10, yTable[rowNo] + 20);
		g.drawLine(xTable[columnNo], yTable[rowNo] + 20,
				xTable[columnNo] + 10, yTable[rowNo]);
	}

	//Call this from displayMoves to draw an O
		//You will need the row and column position of the mouse (zero-indexed)
	private void drawCircle(Graphics g, int rowNo, int columnNo){
		g.drawOval(xTable[columnNo], yTable[rowNo], 20, 20);
	}

	public static void main(String args[]){
		new TicTacToe();
	}
}