import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	
	private Panneau pan = new Panneau();
	  private JButton bouton = new JButton("mon bouton");
	  private JPanel container = new JPanel();
	  
	  public Fenetre(){
	    this.setTitle("Animation");
	    this.setSize(300, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    container.add(pan, BorderLayout.CENTER);
	    container.add(bouton, BorderLayout.SOUTH);
	    this.setContentPane(container);
	    this.setVisible(true);    
	    go();
	  }
	  
	  private void go(){  
	    //Les coordonnées de départ de notre rond
	    int x = pan.getPosX(), y = pan.getPosY();
	    //Le booléen pour savoir si l'on recule ou non sur l'axe x
	    boolean backX = false;
	    //Le booléen pour savoir si l'on recule ou non sur l'axe y
	    boolean backY = false;
	    
	    //Dans cet exemple, j'utilise une boucle while
	    //Vous verrez qu'elle fonctionne très bien
	    while(true){
	      //Si la coordonnée x est inférieure à 1, on avance
	      if(x < 1)backX = false;
	      //Si la coordonnée x est supérieure à la taille du Panneau moins la taille du rond, on recule
	      if(x > pan.getWidth()-50)backX = true;
	      //Idem pour l'axe y
	      if(y < 1)backY = false;
	      if(y > pan.getHeight()-50)backY = true;
	      
	      //Si on avance, on incrémente la coordonnée
	      if(!backX)
	        pan.setPosX(++x);
	      //Sinon, on décrémente
	      else
	        pan.setPosX(--x);
	      //Idem pour l'axe Y
	      if(!backY)
	        pan.setPosY(++y);
	      else
	        pan.setPosY(--y);
	        
	      //On redessine notre Panneau
	      pan.repaint();
	      //Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde
	      try {
	        Thread.sleep(3);
	      } catch (InterruptedException e) {
	        e.printStackTrace();
	      }
	    }    
	  }  
	
	
	
	
	
//	public Fenetre(){
//		this.setTitle("Ma première fenêtre Java");
//	    this.setSize(100, 150);
//	    this.setLocationRelativeTo(null);               
//	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	    this.setContentPane(new Panneau());
//
//	    this.setVisible(true);
		
//	}
	
//	CardLayout cl = new CardLayout();
//	  JPanel content = new JPanel();
//	  //Liste des noms de nos conteneurs pour la pile de cartes
//	  String[] listContent = {"CARD_1", "CARD_2", "CARD_3"};
//	  int indice = 0;
//
//	  public Fenetre(){
//	    this.setTitle("CardLayout");
//	    this.setSize(300, 120);
//	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	    this.setLocationRelativeTo(null);
//			
//	    //On crée trois conteneurs de couleur différente
//	    JPanel card1 = new JPanel();
//	    card1.setBackground(Color.blue);		
//	    JPanel card2 = new JPanel();
//	    card2.setBackground(Color.red);		
//	    JPanel card3 = new JPanel();
//	    card3.setBackground(Color.green);
//
//	    JPanel boutonPane = new JPanel();
//	    JButton bouton = new JButton("Contenu suivant");
//	    //Définition de l'action du bouton
//	    bouton.addActionListener(new ActionListener(){
//	      public void actionPerformed(ActionEvent event){
//	        //Via cette instruction, on passe au prochain conteneur de la pile
//	        cl.next(content);
//	      }
//	    });
//			
//	    JButton bouton2 = new JButton("Contenu par indice");
//	    //Définition de l'action du bouton2
//	    bouton2.addActionListener(new ActionListener(){
//	      public void actionPerformed(ActionEvent event){				
//	        if(++indice > 2)
//	          indice = 0;
//	        //Via cette instruction, on passe au conteneur correspondant au nom fourni en paramètre
//	        cl.show(content, listContent[indice]);
//	      }
//	    });
//			
//	    boutonPane.add(bouton);
//	    boutonPane.add(bouton2);
//	    //On définit le layout
//	    content.setLayout(cl);
//	    //On ajoute les cartes à la pile avec un nom pour les retrouver
//	    content.add(card1, listContent[0]);
//	    content.add(card2, listContent[1]);
//	    content.add(card3, listContent[2]);
//
//	    this.getContentPane().add(boutonPane, BorderLayout.NORTH);
//	    this.getContentPane().add(content, BorderLayout.CENTER);
//	    this.setVisible(true);
//	  }	
//	
	
	
//	public Fenetre(){
//		
//	    this.setTitle("Box Layout");
//	    this.setSize(300, 120);
//	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	    this.setLocationRelativeTo(null);
//
//	 JPanel b1 = new JPanel();
//	    //On définit le layout en lui indiquant qu'il travaillera en ligne
//	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
//	    b1.add(new JButton("Bouton 1"));
//
//	    JPanel b2 = new JPanel();
//	    //Idem pour cette ligne
//	    b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
//	    b2.add(new JButton("Bouton 2"));
//	    b2.add(new JButton("Bouton 3"));
//
//	    JPanel b3 = new JPanel();
//	    //Idem pour cette ligne
//	    b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
//	    b3.add(new JButton("Bouton 4"));
//	    b3.add(new JButton("Bouton 5"));
//	    b3.add(new JButton("Bouton 6"));
//
//	    JPanel b4 = new JPanel();
//	    //On positionne maintenant ces trois lignes en colonne
//	    b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS));
//	    b4.add(b1);
//	    b4.add(b2);
//	    b4.add(b3);
//			
//	    this.getContentPane().add(b4);
//	    this.setVisible(true);
//	  }
//	

//	private Panneau pan = new Panneau();
//	JPanel jpa = new JPanel();
//	JButton bouton = new JButton("Mon bouton");
//
//	 public Fenetre(){
//		    this.setTitle("Bouton");
//		    this.setSize(300, 300);
//		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		    this.setLocationRelativeTo(null);
//		    //On définit le layout à utiliser sur le content pane
//		    this.setLayout(new BorderLayout());
//		    //On ajoute le bouton au content pane de la JFrame
//		    //Au centre
//		    this.getContentPane().add(new JButton("CENTER"), BorderLayout.CENTER);
//		    //Au nord
//		    this.getContentPane().add(new JButton("NORTH"), BorderLayout.NORTH);
//		    //Au sud
//		    this.getContentPane().add(new JButton("SOUTH"), BorderLayout.SOUTH);
//		    //À l'ouest
//		    this.getContentPane().add(new JButton("WEST"), BorderLayout.WEST);
//		    //À l'est
//		    this.getContentPane().add(new JButton("EAST"), BorderLayout.EAST);
//		    this.setVisible(true);
//		  }      
//
//	  private void go(){
//		  //Les coordonnées de départ de notre rond
//		  int x = pan.getPosX(), y = pan.getPosY();
//		  //Le booléen pour savoir si l'on recule ou non sur l'axe x
//		  boolean backX = false;
//		  //Le booléen pour savoir si l'on recule ou non sur l'axe y
//		  boolean backY = false;
//
//		  //Dans cet exemple, j'utilise une boucle while
//		  //Vous verrez qu'elle fonctionne très bien
//		  while(true){
//		    //Si la coordonnée x est inférieure à 1, on avance
//		    if(x < 1)
//		      backX = false;
//
//		    //Si la coordonnée x est supérieure à la taille du Panneau moins la taille du rond, on recule
//		    if(x > pan.getWidth()-50)
//		      backX = true;
//
//		    //Idem pour l'axe y
//		    if(y < 1)
//		      backY = false;
//		    if(y > pan.getHeight()-50)
//		      backY = true;
//
//		    //Si on avance, on incrémente la coordonnée
//		    //backX est un booléen, donc !backX revient à écrire
//		    //if (backX == false)
//		    if(!backX)
//		      pan.setPosX(++x);
//
//		    //Sinon, on décrémente
//		    else
//		      pan.setPosX(--x);
//
//		    //Idem pour l'axe Y
//		    if(!backY)
//		      pan.setPosY(++y);
//		    else
//		      pan.setPosY(--y);
//
//		    //On redessine notre Panneau
//		    pan.repaint();
//
//		    //Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde
//		    try {
//		      Thread.sleep(3);
//		    } catch (InterruptedException e) {
//		      e.printStackTrace();
//		    }
//		  }
//		}
	
	
	
//	private Panneau pan = new Panneau();
//	  private JButton bouton = new JButton("mon bouton");
//	  private JPanel container = new JPanel();
//	  
//	  
//	  public Fenetre(){
//	    this.setTitle("Animation");
//	    this.setSize(300, 300);
//	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	    this.setLocationRelativeTo(null);
//	    container.setBackground(Color.white);
//	    container.setLayout(new BorderLayout());
//	    container.add(pan, BorderLayout.CENTER);
//	    container.add(bouton, BorderLayout.SOUTH);
//	    this.setContentPane(container);
//	    this.setVisible(true);    
//	    go();
//	  }
//	  
//	  private void go(){  
//	    //Les coordonnées de départ de notre rond
//	    int x = pan.getPosX(), y = pan.getPosY();
//	    //Le booléen pour savoir si l'on recule ou non sur l'axe x
//	    boolean backX = false;
//	    //Le booléen pour savoir si l'on recule ou non sur l'axe y
//	    boolean backY = false;
//	    
//	    //Dans cet exemple, j'utilise une boucle while
//	    //Vous verrez qu'elle fonctionne très bien
//	    while(true){
//	      //Si la coordonnée x est inférieure à 1, on avance
//	      if(x < 1)backX = false;
//	      //Si la coordonnée x est supérieure à la taille du Panneau moins la taille du rond, on recule
//	      if(x > pan.getWidth()-50)backX = true;
//	      //Idem pour l'axe y
//	      if(y < 1)backY = false;
//	      if(y > pan.getHeight()-50)backY = true;
//	      
//	      //Si on avance, on incrémente la coordonnée
//	      if(!backX)
//	        pan.setPosX(++x);
//	      //Sinon, on décrémente
//	      else
//	        pan.setPosX(--x);
//	      //Idem pour l'axe Y
//	      if(!backY)
//	        pan.setPosY(++y);
//	      else
//	        pan.setPosY(--y);
//	        
//	      //On redessine notre Panneau
//	      pan.repaint();
//	      //Comme on dit : la pause s'impose ! Ici, trois millièmes de seconde
//	      try {
//	        Thread.sleep(3);
//	      } catch (InterruptedException e) {
//	        e.printStackTrace();
//	      }
//	    }    
//	  }  

}
