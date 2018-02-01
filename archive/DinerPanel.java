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
public class DinerPanel extends JPanel
{
    private JLabel idLabel, passwordLabel, message;
    private JTextField id;
    private JPasswordField password;
    private JTextArea instruction;
    private String instructionString;
    private JPanel loginPanel;
    private boolean success;
    //private TextFieldHandler tfh;
    private PicturePanel1 picPizzaPanel, picSushiPanel;
    private JPanel dinerPicPanel;

    /**
     * 
     */
    public DinerPanel() 
    {
        menuPicPanel();
        dinerPicPanel.setVisible(true);
        
        

    }
    
    public JPanel menuPicPanel()
    {
        dinerPicPanel = new JPanel();
        picPizzaPanel = new PicturePanel1("images/pizza.jpg");
        dinerPicPanel.add(picPizzaPanel.getDefaultPicLayout(), BorderLayout.NORTH);
        picSushiPanel = new PicturePanel1("images/sushi.jpg");
        dinerPicPanel.add(picSushiPanel.getDefaultPicLayout(), BorderLayout.CENTER);
        return dinerPicPanel;
        
    }
}



