import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Polygon {

	protected int[] xcoord;
	protected int[] ycoord;
	protected int[] color;
	protected int[] fill;
	protected int id;
	protected String shape;
	protected int size;
	
	public Polygon(String[]	parts) {
		
		color = new int[3];
		fill = new int[3];
		shape = parts[0];
		id = Integer.parseInt(parts[1]);
		size = Integer.parseInt(parts[2]);
		xcoord = new int[size];
		ycoord = new int[size];
		color[0] = Integer.parseInt(parts[3]);
		color[1] = Integer.parseInt(parts[4]);
		color[2] = Integer.parseInt(parts[5]);
		fill[0] = Integer.parseInt(parts[6]);
		fill[1] = Integer.parseInt(parts[7]);
		fill[2] = Integer.parseInt(parts[8]);
		
		for(int i=0;i<size;i++){
			xcoord[i] = Integer.parseInt(parts[9+i]);
		}
		for(int i=0;i<size;i++){
			ycoord[i] = Integer.parseInt(parts[9+size+i]);
		}
	}
	public int getID(){
		return id;
	}
	public void setID(int id){
		this.id = id;
	}
	public double getXcoord(int num){
		return xcoord[num];
	}
	public void setXcoord(int num, int xcoord){
		this.xcoord[num] = xcoord;
	}
	public double getYcoord(int num){
		return ycoord[num];
	}
	public void setYcoord(int num, int xcoord){
		this.ycoord[num] = xcoord;
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

	public void drawSelf(Graphics g){
		g.setColor(new Color(color[0],color[1],color[2]));
		g.drawPolygon(xcoord,ycoord,size);
		g.setColor(new Color(fill[0],fill[1],fill[2]));
		g.fillPolygon(xcoord,ycoord,size);
	}
}
