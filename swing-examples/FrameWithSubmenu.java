import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// High DPI screen on Dell running Ubuntu
import com.sun.java.swing.plaf.gtk.GTKLookAndFeel;

/* Note that this is a small and minimalistic example
 * and it is not an example of good coding style!
 * 
 * It is not very object oriented in style, and it is
 * not in so many ways representative to what GUI
 * programs look like in the design (or actual look).
 *
 * It is self-contained (it has a main method and
 * a static method which does all the work of setting
 * up the components and the window, and displaying
 * the window).
 *
 * The point here was to show how menus are actually
 * menu items via inheritance, so that a menu can have
 * a menu as an item - a submenu.
 *
 * Please don't use this style or layout as a model
 * for your own Swing GUI applications ;-)
 */
public class FrameWithSubmenu {
  /**
   * Create the GUI and show it.
   */
  private static void createAndShowGUI() {

    try {
      // This is a fix for Dell XPS running Linux
      // with a high DPI screen, in order to prevent
      // the window to be very tiny
      // You can safely ignore it!
      // If the application looks tiny also on your
      // computer, try with a different look and feel
      // and import the corresponding class.
      UIManager.setLookAndFeel(new GTKLookAndFeel());
    } catch (Exception ignore) {
    }
      
    //Create and set up the window.
    JFrame frame = new JFrame("Frame with menu"); // window with title

    // Make the window close when the X is clicked
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Start size
    frame.setPreferredSize(new Dimension(480, 200));
      
    // A menu bar that we add to the window
    JMenuBar menuBar = new JMenuBar();
    frame.add(menuBar, BorderLayout.NORTH); // NORTH is at the top

    // First menu for the menu bar, with only one item
    JMenu menu = new JMenu("File");
    JMenuItem quit = new JMenuItem("Quit");
    // Add a menu item to the File menu
    menu.add(quit);
    // Second menu for the menu bar, with a submenu as the only item
    JMenu edit = new JMenu("Edit");
    JMenu lines = new JMenu("Lines...");// Submenu to edit
    // The only item of the submenu
    JMenuItem autoIndent = new JMenuItem("Auto indent");
    // Add the item to the submenu
    lines.add(autoIndent);
    // Add the submenu to the Edit menu
    edit.add(lines);

    // This is to make the quit item actually do something
    // like making the program quit ;-)
    quit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          System.exit(0);
        }
      });
    // Add the two menus to the menu bar
    menuBar.add(menu);
    menuBar.add(edit);
    //Display the window.
    frame.pack();
    frame.setVisible(true);
  }
  
  public static void main(String[] args) {
    // Threading is tricky. We'll leave that to Java for now!    
    //Schedule a job for the event-dispatching thread:
    //creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          createAndShowGUI();
        }
      });
  }
}
