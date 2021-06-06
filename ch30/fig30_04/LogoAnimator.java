// Fig. 30.4: LogoAnimator.java
// Animating a series of images
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LogoAnimator extends JPanel
                          implements ActionListener {
   protected ImageIcon images[];
   protected int totalImages = 30,
                 currentImage = 0,
                 animationDelay = 50; // 50 millisecond delay
   protected String imageName = "deitel";
   protected Timer animationTimer;

   public LogoAnimator()
   {
      initializeAnim();
   } // end LogoAnimator constructor

   // new constructor to support customization 
   public LogoAnimator( int num, int delay, String name )
   {
      totalImages = num;
      animationDelay = delay;
      imageName = name;

      initializeAnim();
   } // end LogoAnimator constructor

   private void initializeAnim()
   {
      images = new ImageIcon[ totalImages ];

      for ( int i = 0; i < images.length; ++i ) 
         images[ i ] = new ImageIcon( "images/" +
                              imageName + i + ".gif" );

      // moved here so getPreferredSize can check the size of
      // the first loaded image.
      setSize( getPreferredSize() ); 

      startAnimation();
   } // end method initializeAnim

   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );

      if ( images[ currentImage ].getImageLoadStatus() ==
           MediaTracker.COMPLETE ) {
         images[ currentImage ].paintIcon( this, g, 0, 0 );
         currentImage = ( currentImage + 1 ) % totalImages;
      } // end if
   } // end method paintComponent

   public void actionPerformed( ActionEvent e )
   {
      repaint();
   } // end method actionPerformed

   public void startAnimation()
   {
      if ( animationTimer == null ) {
         currentImage = 0;  
         animationTimer = new Timer( animationDelay, this );
         animationTimer.start();
      }
      else  // continue from last image displayed
         if ( ! animationTimer.isRunning() )
            animationTimer.restart();
   } // end method startAnimation

   public void stopAnimation()
   {
      animationTimer.stop();
   } // end method stopAnimation

   public Dimension getMinimumSize()
   { 
      return getPreferredSize(); 
   } // end method getMinimumSize

   public Dimension getPreferredSize()
   {
      return new Dimension( images[ 0 ].getIconWidth(),
                            images[ 0 ].getIconHeight() );
   } // end method getPreferredSize

   public static void main( String args[] )
   {
      LogoAnimator anim = new LogoAnimator();

      JFrame app = new JFrame( "Animator test" );
      app.getContentPane().add( anim, BorderLayout.CENTER );

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            } // end method windowClosing
         } // end anonymous inner class
      ); // end addWindowListener

      app.setSize( anim.getPreferredSize().width + 10,
                   anim.getPreferredSize().height + 30 );
      app.show();
   } // end main
} // end class LogoAnimator


/**************************************************************************
 * (C) Copyright 1992-2004 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

