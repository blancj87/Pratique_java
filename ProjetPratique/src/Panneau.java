import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel{
	
	
	 private int posX = -50;
	  private int posY = -50;

	  public void paintComponent(Graphics g){
//	    On choisit une couleur de fond pour le rectangle
	    g.setColor(Color.white);
	    //On le dessine de sorte qu'il occupe toute la surface
	    g.fillRect(0, 0, this.getWidth(), this.getHeight());
	    //On redéfinit une couleur pour le rond
	    g.setColor(Color.red);
	    //On le dessine aux coordonnées souhaitées
	    g.fillOval(posX, posY, 50, 50);
	 
//
//		int x1 = this.getWidth()/4;
//	    int y1 = this.getHeight()/4;                      
//	    g.drawOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
	
		
//		 try {
//		      Image img = ImageIO.read(new File("images.jpg"));
//	      g.drawImage(img, 0, 0, this);
//		      //Pour une image de fond
//		      //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
//		    } catch (IOException e) {
//		      e.printStackTrace();
//		    }    
		
//	        Graphics2D g2d = (Graphics2D)g;         
//		    GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 30, Color.cyan,true);                
//		    g2d.setPaint(gp);
//		    g2d.fillRect(0, 0, this.getWidth(), this.getHeight()); 
//		
	  }

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

}
