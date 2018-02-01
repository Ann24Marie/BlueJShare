//Imports are listed in full to show what's being used
//could just import javax.swing.* and java.awt.* etc..
import java.awt.EventQueue;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CardLayout1{
 JFrame guiFrame;
 CardLayout cardLayout;
 JPanel cardPanel;
 JButton switchCards;


      public static void main(String[] args) {
 
      //Use the event dispatch thread for Swing components
       EventQueue.invokeLater(new Runnable()
     {
 
      @Override
      public void run()
      {
 
      new CardLayout1(); 
     }
    });
 
 }
 
    public CardLayout1()
    { 
       guiFrame = new JFrame();
 
       //make sure the program exits when the frame closes
       guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       guiFrame.setTitle("CardLayout Example");
       guiFrame.setSize(400,300);
 
       //This will center the JFrame in the middle of the screen
      guiFrame.setLocationRelativeTo(null);
      guiFrame.setLayout(new BorderLayout());
 
       //creating a border to highlight the JPanel areas
      Border outline = BorderFactory.createLineBorder(Color.black);
      
      switchCards = new JButton("Switch Card");
      //switchCards.addActionListener(new ActionListener());
      
      PicturePanel1 picSushi = new PicturePanel1("images/sushi.jpg");
      picSushi.setBorder(outline);
      picSushi.add(switchCards);
      
      PicturePanel1 picBurger = new PicturePanel1("images/hamburger.jpg");
      picBurger.setBorder(outline);
      picSushi.add(switchCards);
      
      //switchCards.setActionCommand("Switch Card");
      //guiFrame.add(picSushi,BorderLayout.NORTH);
      cardPanel = new JPanel(new CardLayout());
      cardPanel.setLayout(cardLayout);
      cardPanel.add(picSushi);
      cardPanel.add(picBurger);
      cardLayout = (CardLayout) cardPanel.getLayout();
      //cardPanel.show(cardPanel, "Burgers");

      guiFrame.add(cardPanel,BorderLayout.CENTER);
      guiFrame.setVisible(true);
      cardPanel.setVisible(true);
      
      
      
    }
  
       public void actionPerformed(ActionEvent event)
       {
          if(event.getSource() == switchCards)
          
           cardLayout.next(cardPanel);
       }
    }
   
      
 
      
 
 

 
     /* JPanel firstCard = new JPanel();
      firstCard.setBackground(Color.GREEN);
      addButton(firstCard, "APPLES");
      addButton(firstCard, "ORANGES");
      addButton(firstCard, "BANANAS");
 
      JPanel secondCard = new JPanel();
      secondCard.setBackground(Color.BLUE);
      addButton(secondCard, "LEEKS");
      addButton(secondCard, "TOMATOES");
      addButton(secondCard, "PEAS");
 
      cardPanel.add(firstCard, "Fruits");
      cardPanel.add(secondCard, "Veggies");
 
      guiFrame.add(picPanelSushi,BorderLayout.NORTH);

  }
 
 //All the buttons are following the same pattern
 //so create them all in one place.
   private void addButton(Container parent, String name)
   {
      JButton but = new JButton(name);
      but.setActionCommand(name);
      parent.add(but);
   }
}*/
