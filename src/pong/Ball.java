package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
	
	public double x,y;
	public int width, height;

	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
		this.width = 3;
		this.height = 3;
	}
	
	public void tick() {
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect((int)x, (int)y, width, height);
	}
	
}

