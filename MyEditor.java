//swing library for GUI
import javax.swing.*;
//to use text in gui
import javax.swing.text.*;
//
import java.awt.*;
//events
import java.awt.event.*;
//input output
import java.io.*;
//hashtable
import java.util.HashTable;
//***************************************
//
import javax.swing.border.AbstractBorder;
//
import javax.swing.border.TitledBorder;
//
import javax.swing.border.EtchedBorder;

// This makes MyEditor a subclass of JFrame
class MyEditor extends JFrame
{
	// I guess this action opens stuff
	private Action openAction = new OpenAction();
	// I guess this action saves stuff
	private Action saveAction = new SaveAction();

	// creates a text component
	private JTextComponent textComponent;
	//Need this to be able to scroll
	private JScrollPane scrollPane;
	// A hash table of actions
	private Hashtable actionHash = new Hashtable();


	// Constructor
	public MyEditor() {
		// This uses the JFrame class to initialize the title of editor
		super("Nick's Text Editor");
		
//the following line of CODE: the method will be
//used to set up text area
//in this text component
		textComponent = createTextComponent(); 
		scrollPane = new JScrollPane(textComp);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

		makeActionsPretty();

        JPanel middlePanel = new JPanel();
        middlePanel.setBorder(new TitledBorder( new EtchedBorder(), "Text Area" ) );
        // The text area will be put in the middle panel
	    // Create new layout and set scroll area containing the text area in this panel
        middlePanel.setLayout(new BorderLayout());
        middlePanel.add(scrollPane, BorderLayout.CENTER);
        // getContentPane() is a method from the Frame class
	    // Container class is similar to JPanel class
		
		Container content = getContentPane();
        //Now add are middlePanel to the main panel or frame panel
        content.add(middlePanel, BorderLayout.CENTER);
        //add a toolbar and a menubar to main panel
        content.add(createToolBar(), BorderLayout.NORTH);
        setJMenuBar(createMenuBar());
        
        setSize(640, 480);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
		
	} // end MyEditor constructor
    
    // Create the JTextComponent subclass.
    protected JTextcomponent createTextcomponent() {
        JTextArea textArea = new JTextArea(24, 55);
        textArea.setLineWrap(true);
        textArea.setBackground(new Color(139, 153, 255));
        
        return textArea;
    } // end createTextComponent()

    // Add icons and friendly names to actions we care about.
    protected void makeActionsPretty() {
        Action a;
        a = textcomponent.getActionMap().get(DefaultEditorKit.cutAction);
        a.putValue(Action.SMALL_ICON, new ImageIcon("icons/cut.gif"));
        a.putValue(Action.NAME, "Cut");
        
        a.textcomponent.
        
    }

} // end class MyEditor
