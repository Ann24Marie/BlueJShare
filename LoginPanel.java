import javax.swing.*;
import javax.swing.border.*; 
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Write a description of class LoginPanel here.
 *
 * @author (A Menzies)
 * @version (Jan18)
 */
public class LoginPanel extends JPanel
{
    private JLabel idLabel, passwordLabel, message;
    private JTextField id;
    private JPasswordField password;
    private JTextArea instruction;
    private String instructionString;
    private JPanel loginPanel;
    private boolean success;
    private TextFieldHandler tfh;
    private PicturePanel1 menuPanel;
    private ButtonPanels buttons;

    /**
     * 
     */
    public LoginPanel()
    {
        success = false;
        idLabel = new JLabel( "Enter username" ); 
        id = new JTextField( "", 12 );      

        passwordLabel = new JLabel( "Enter password" ); 
        password = new JPasswordField( 12 ); 
        password.setEchoChar( '*' );        

        message = new JLabel( "Log in to your account" );  
    
        instructionString = "Log in to your account to order your meal";
           instruction = new JTextArea( instructionString);
           instruction.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
           instruction.setEditable( false );  

           tfh = new TextFieldHandler( );
           id.addActionListener( tfh );
           password.addActionListener( tfh );
    }
    
    public JPanel getDefaultLayout()
    {
       
       {
       loginPanel = new JPanel();
       loginPanel.add(idLabel);
       loginPanel.add(id);
       loginPanel.add(passwordLabel);
       loginPanel.add(password);
       loginPanel.add(message);
       loginPanel.add(instruction);
       return loginPanel; 
      }
    }  
    
    public PicturePanel1 getSuccessLayout()
    {    
       menuPanel = new PicturePanel1("images/sushi.jpg");
       menuPanel.getButtonPicLayout();
       //loginPanel.add(menuPanel);
       //loginPanel.setVisible(true);
       return menuPanel;
    }
    public boolean successLogin()
    {
        if (success == true)
        System.out.println("success");
        return success;
    }

   //private inner class event handler
    private class TextFieldHandler implements ActionListener
    {
        public void actionPerformed( ActionEvent e )
        {
            if ( id.getText( ).equals( "open" )
            && ( new String( password.getPassword( ) ) ).equals( "sesame"))
            {
                success = true;
                loginPanel.setVisible(false);
                //getSuccessLayout();
                //menuPanel.setVisible(true);
                //loginPanel.removeAll();
                
                buttons = new ButtonPanels();
                loginPanel.add(buttons.getPushButtonLayout());
                buttons.setVisible(true);
                //DinerPanel diner = new DinerPanel();
                //diner.setVisible(true);               
            }
            else
            {
                success = false;
                message.setForeground( Color.RED );
                message.setBackground( Color.BLUE );
                message.setText( "Sorry: wrong login" );  
                message.setVisible(true);
            }
   
        }

    } 

}



