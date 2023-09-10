package graficos;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruebaDibujo {

	public static void main(String[] args) {
		MarcoConDibujos frame = new MarcoConDibujos();

	}

}

class MarcoConDibujos extends JFrame{
	public MarcoConDibujos(){
		
		setTitle("Prueba con dibujos");
		
		setSize(400, 400);
		
		setVisible(true);
		
		setLocationRelativeTo(null);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		LaminaConFiguras miLamina = new LaminaConFiguras();
		
		add(miLamina);
		
	}
}


class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		/**
		
		g.drawString("HolaMund", 100, 100);
		
		g.drawRect(200, 200, 100, 100);
		
		*/
		
		Graphics2D g2 = (Graphics2D) g ; 
		
		Rectangle2D rectangle2d = new Rectangle2D.Double(100,100,200.25,150);
		
		g2.draw(rectangle2d) ;
		
		Ellipse2D ellipse2d = new Ellipse2D.Double();
		
		ellipse2d.setFrame(rectangle2d);

		g2.draw(ellipse2d);
		
	}
	
}