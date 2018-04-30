import java.awt.Graphics;
import java.awt.Color;

public class Rectangle extends Shape{
	
	private double width;
	private double height;

	public Rectangle(String[] parts){
		super(parts);
		width = Double.parseDouble(parts[12]);
		height = Double.parseDouble(parts[13]);
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height = height;
	}
	@Override
	public void drawSelf(Graphics g) {
		//TODO: Make sure this is right
		g.setColor(new Color(color[0],color[1],color[2]));
		g.drawRect((int)xcoord,(int)ycoord,(int)width,(int)height);
		g.setColor(new Color(fill[0],fill[1],fill[2]));
		g.fillRect((int)xcoord,(int)ycoord,(int)width,(int)height);
	}
}
