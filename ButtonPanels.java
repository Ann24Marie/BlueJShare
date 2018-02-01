
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonPanels extends JPanel
{
 private JButton burgerButton, pizzaButton;
 private JPanel buttonPanel;
 
 public ButtonPanels( )
 {
  buttonPanel = new JPanel(); // default layout manager FlowLayout
  burgerButton = new JButton( "Burger" );
  pizzaButton = new JButton("Pizza");
}
  public JPanel getPushButtonLayout()
  {
   buttonPanel.add(burgerButton);
   buttonPanel.add(pizzaButton);
  // instantiate our event handler
    ButtonHandler bh = new ButtonHandler( );

  // add event handler as listener for both buttons
    burgerButton.addActionListener( bh );
    pizzaButton.addActionListener( bh );

    setSize( 50,50 );
    buttonPanel.setVisible( true );
    return buttonPanel;
 }

 // private inner class event handler
 private class ButtonHandler implements ActionListener
 {
  // implement actionPerformed method
  public void actionPerformed( ActionEvent ae )
  {

    if ( ae.getSource( ) == burgerButton )
      {

          System.out.print("burger");

        }
    else if ( ae.getSource( ) == pizzaButton )
    {

        System.out.print("pizza");
    }
   }
  }
 }


