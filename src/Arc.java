import java.awt.Color;
import java.awt.Graphics;

public class Arc extends Shape {
	
	private double width;
	private double height;
	private int startAngle;
	private int endAngle;

	public Arc(String[] parts) {
		super(parts);
		width = Double.parseDouble(parts[12]);
		height = Double.parseDouble(parts[13]);
		startAngle = Integer.parseInt(parts[10]);
		endAngle = Integer.parseInt(parts[11]);
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
	public int getStartAngle(){
		return startAngle;
	}
	public void setStartAngle(int angle){
		this.startAngle = angle;
	}
	public int getEndAngle(){
		return endAngle;
	}
	public void setEndAngle(int angle){
		this.endAngle = angle;
	}

	@Override
	public void drawSelf(Graphics g) {
		g.setColor(new Color(color[0],color[1],color[2]));
		g.drawArc((int)xcoord,(int)ycoord,(int)width,(int)height,startAngle,endAngle);
		g.setColor(new Color(fill[0],fill[1],fill[2]));
		g.fillArc((int)xcoord,(int)ycoord,(int)width,(int)height,startAngle,endAngle);

	}

}
