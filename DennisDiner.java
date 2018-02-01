 /* Login Screen for Dennis's Diner
  * author A Menzies
  * Date Jan 18
 */

import javax.swing.*;
import javax.swing.border.*; 
import java.awt.*;
import java.awt.event.*;

public class DennisDiner
{
    private JFrame dinerFrame;
    private LoginPanel loginPanel;
    private PicturePanel1 picPanel, picPanel1 ;
    private ButtonPanels pushButton;
    
    private boolean success;
    //private Login login;
    
    public DennisDiner( )
    {
           setScreen();
           //if(loginPanel.successLogin())
           
           //setScreen2();
        
    }
    public void setScreen()
    {
        dinerFrame = new JFrame( "Dennis's Diner" );
        loginPanel = new LoginPanel();
        //pushButton = new ButtonPanel();
        picPanel = new PicturePanel1("images/hamburger.jpg");
        picPanel1 = new PicturePanel1("images/sushi.jpg");
        
        pushButton = new ButtonPanels();
 
        dinerFrame.add(picPanel1.getButtonPicLayout(), BorderLayout.EAST);
        //dinerFrame.add(picPanel1, BorderLayout.EAST);
        dinerFrame.add(picPanel.getDefaultPicLayout(), BorderLayout.NORTH);
        dinerFrame.add(loginPanel.getDefaultLayout(), BorderLayout.CENTER);
        dinerFrame.add(pushButton.getPushButtonLayout(), BorderLayout.EAST);

        dinerFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent event)
            {
                System.exit(0);
            }
        });
        dinerFrame.setSize(400,550);
        //dinerFrame.pack();
        dinerFrame.setVisible(true);
        picPanel1.setVisible(false);
        //if(loginPanel.successLogin())
        //{
            //loginPanel.successLogin();
        //    dinerFrame.remove(loginPanel);
       // }


}
    
    public void setScreen2()
    {
        
        //dinerFrame = new JFrame( "Ann's Diner" );
        //loginPanel = new LoginPanel();
        picPanel1 = new PicturePanel1("images/sushi.jpg");
        dinerFrame.add(picPanel1.getButtonPicLayout(), BorderLayout.SOUTH);
        //dinerFrame.add(loginPanel.getDefaultLayout(), BorderLayout.CENTER);

        dinerFrame.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent event)
            {
                System.exit(0);
            }
        });
        dinerFrame.setSize(400,550);
        //dinerFrame.pack();
        dinerFrame.setVisible(true);
        
    }
    /*public void success()
    {
        loginPanel.returnSuccess();
        success = loginPanel.returnSuccess();
        if(success)
        {
            loginFrame.dispose();           
        }
    }*/
    public JFrame getDiner()
    { 
       return dinerFrame;
    }
    
    public static void main(String [] args)
    {
          DennisDiner dinerFrame = new DennisDiner( );
          
    }
}
