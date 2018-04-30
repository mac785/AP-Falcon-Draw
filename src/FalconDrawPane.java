import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;

public class FalconDrawPane extends JPanel
{
	//---------------------------------------
	// TODO: instantiate the variable that will hold all the things to draw...
	private ArrayList<Shape>myShapes;
	private ArrayList<Line>myLines;
	private ArrayList<Polygon>myPolygons;
	//---------------------------------------
	public FalconDrawPane()
	{
		super();
		//---------------------------------------
		// TODO: initialize the variable that will hold all the things to draw...
		myShapes = new ArrayList<Shape>();
		myLines = new ArrayList<Line>();
		myPolygons = new ArrayList<Polygon>();
		setBackground(Color.lightGray);
		//---------------------------------------
	}
	
	public void loadFile(String filename)
	{
		/* Note: This is a little different than the last time, 
		 * because the files may prove to be very long, 
		 * and the Scanner can get overwhelmed by long files.
		 */
		
		// TODO: I suggest you tell your ArrayList to clear() to remove old shapes.
		
		int lineNum = 0;
		try
		{
			BufferedReader fileIn = new BufferedReader(new FileReader(filename));
			String line = fileIn.readLine();
			while(line != null)
			{
				// --------------------------------------------
				// You now have a variable "line" that holds one 
				//    row of information as a long String.
				// 1) split the line up by tabs (\t), 
				// 2) decide what kind of info is in this row,
				// 3) make an instance based on the data here (hint:
				//    use the constructor I made you write), and 
				// 4) add this new thing to the list of things to draw.
				// TODO: insert your code here.
				
				String[] list = line.split("\t");
				
				if (list[0].equals("Rectangle")){
					myShapes.add(new Rectangle(list));
				}
				if (list[0].equals("Oval")){
					myShapes.add(new Oval(list));
				}
				if (list[0].equals("Line")){
					myLines.add(new Line(list));
				}
				if (list[0].equals("Arc")){
					myShapes.add(new Arc(list));
				}
				if (list[0].equals("Polygon")){
					myPolygons.add(new Polygon(list));
				}
				// --------------------------------------------
				line = fileIn.readLine();
				lineNum ++;
			}
			System.out.println("Loaded "+lineNum+" shapes.");
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("Could not open file.");
			fnfe.printStackTrace();
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("Could not convert number on line "+lineNum);
			if (nfe.getMessage()!=null)
				System.out.println(nfe.getMessage());
			nfe.printStackTrace();
		}
		catch (IOException ioe)
		{
			System.out.println("problem reading file.");
			ioe.printStackTrace();
		}
		repaint(); // this is what makes this panel reflect these changes.
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		// -----------------------------------
		// TODO: draw all the things in your list to the screen.
		// Note: you could do this in as few as two lines.
		for(int i=0;i<myShapes.size();i++){
			myShapes.get(i).drawSelf(g);
		}
		//I think this works. I can't tell though because they are too small
		for(int i=0;i<myLines.size();i++){
			myLines.get(i).drawSelf(g);
		}
		for(int i=0;i<myPolygons.size();i++){
			myPolygons.get(i).drawSelf(g);
		}
		// -----------------------------------
	}
}
