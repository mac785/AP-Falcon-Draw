import java.awt.Color;
import java.awt.Graphics;

public class Line{
	
	protected double xcoord1;
	protected double ycoord1;
	protected double xcoord2;
	protected double ycoord2;
	protected int[] color;
	protected int id;
	protected String shape;
	public Line(String[] parts) {
		color = new int[3];
		shape = parts[0];
		id = Integer.parseInt(parts[1]);
		xcoord1 = Double.parseDouble(parts[2]);
		ycoord1 = Double.parseDouble(parts[3]);
		xcoord2 = Double.parseDouble(parts[4]);
		ycoord2 = Double.parseDouble(parts[5]);
		color[0] = Integer.parseInt(parts[6]);
		color[1] = Integer.parseInt(parts[7]);
		color[2] = Integer.parseInt(parts[8]);

	}
	public int getID(){
		return id;
	}
	public void setID(int id){
		this.id = id;
	}
	public double getXcoord1(){
		return xcoord1;
	}
	public void setXcoord(double xcoord){
		this.xcoord1 = xcoord;
	}
	public double getYcoord1(){
		return ycoord1;
	}
	public void setYcoord(double ycoord){
		this.ycoord1 = ycoord;
	}
	public int[] getColor(){
		return color;
	}
	public void setColor(int[] color){
		this.color = color;
	}
	
	public void drawSelf(Graphics g) {
		//TODO: Make sure this is right
		g.setColor(new Color(color[0],color[1],color[2]));
		g.drawLine((int)xcoord1,(int)ycoord1,(int)xcoord2,(int)ycoord2);
	}
}
