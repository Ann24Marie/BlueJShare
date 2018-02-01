import javax.swing.*;
import javax.swing.border.*; 
import java.awt.*;
/**
 * Write a description of class PicturePanel here.
 *
 * @author (A Menzies)
 * @version (Jan18)
 */
public class PicturePanel
{
    private JLabel cheeseLabel ;
    private JLabel burgerPicture;

    /**
     * Constructor for objects of class PicturePanel
     */
    public PicturePanel()
    {
        burgerPicture = new JLabel(new ImageIcon("images/hamburger.jpg"));
        
    }

    public JPanel getDefaultPicLayout()
    {
       JPanel picPanel = new JPanel();
       picPanel.add(burgerPicture);
       return picPanel;
    }

}
