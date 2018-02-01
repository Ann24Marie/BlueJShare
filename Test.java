 /* Login Screen for Dennis's Diner
  * author A Menzies
  * Date Jan 18
 */

import javax.swing.*;
import javax.swing.border.*; 
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame
{   
   public Test()
   {
      
       
       }
    public void testPic()
    {   
     JFrame dinerFrame = new JFrame( "Dennis's Diner" );
     PicturePanel1 pic = new PicturePanel1("images/sushi.jpg");
     dinerFrame.add(pic.getDefaultPicLayout(), BorderLayout.CENTER);
     dinerFrame.setSize(400,550);
     dinerFrame.setVisible(true);
     
    }
    
    public void testButton()
    {
     JFrame dinerFrame = new JFrame( "Dennis's Diner" );
     ButtonPanels pushButton = new ButtonPanels();
     dinerFrame.add(pushButton.getPushButtonLayout());
     dinerFrame.setSize(400,550);
     dinerFrame.setVisible(true); 
        
    }

  }
    
    
    
    

    