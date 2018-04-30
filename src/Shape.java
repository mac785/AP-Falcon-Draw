import java.awt.Graphics;

public abstract class Shape {
	
	protected double xcoord;
	protected double ycoord;
	protected int[] color;
	protected int[] fill;
	protected int id;
	protected String shape;
	
	public Shape(String[] parts){
		color = new int[3];
		fill = new int[3];
		shape = parts[0];
		id = Integer.parseInt(parts[1]);
		xcoord = Double.parseDouble(parts[2]);
		ycoord = Double.parseDouble(parts[3]);
		color[0] = Integer.parseInt(parts[4]);
		color[1] = Integer.parseInt(parts[5]);
		color[2] = Integer.parseInt(parts[6]);
		fill[0] = Integer.parseInt(parts[7]);
		fill[1] = Integer.parseInt(parts[8]);
		fill[2] = Integer.parseInt(parts[9]);
	}
	
	public int getID(){
		return id;
	}
	public void setID(int id){
		this.id = id;
	}
	public double getXcoord(){
		return xcoord;
	}
	public void setXcoord(int xcoord){
		this.xcoord = xcoord;
	}
	public double getYcoord(){
		return ycoord;
	}
	public void setYcoord(int ycoord){
		this.ycoord = ycoord;
	}
	public int[] getColor(){
		return color;
	}
	public void setColor(int[] color){
		this.color = color;
	}
	public int[] getFill(){
		return fill;
	}
	public void setFill(int[] fill){
		this.fill = fill;
	}
	abstract public void drawSelf(Graphics g);
}
