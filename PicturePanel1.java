import javax.swing.*;
import javax.swing.border.*; 
import java.awt.*;
/**
 * Write a description of class PicturePanel1 here.
 *
 * @author (A Menzies)
 * @version (Jan 18)
 */
  public class PicturePanel1 extends JPanel 
  {
    private JLabel picLabel ;
    private JLabel picture;
    private ButtonPanels button;

    /**
     * Constructor for objects of class LoginPanel1
    */
    public PicturePanel1(String imageFile)
    {
        picture = new JLabel(new ImageIcon(imageFile)); 
        button = new ButtonPanels();  
        //getButtonPicLayout();
    }

    public JPanel getDefaultPicLayout()
    {
       JPanel picPanel = new JPanel();
       picPanel.add(picture);  
       return picPanel;
    }
    public JPanel getButtonPicLayout()
    {
       JPanel picPanel = new JPanel(new FlowLayout());
       picPanel.add(button.getPushButtonLayout(), BorderLayout.EAST);
       picPanel.add(picture, BorderLayout.WEST);        
       return picPanel;
    }
    
    
}
