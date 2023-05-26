import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Color;

public class PalsGUI extends Frame implements ActionListener
{
//  Objects
	
	String command = "";
	
	int ww = 0;
	int wh = 0;
	
	
	public static void main(String[] args)
	{
		Frame frame = new PalsGUI();	
		frame.setResizable(true);
		frame.setSize(1000,840);
		frame.setVisible(true);
		
	}
	
	public PalsGUI()
	{
		setTitle("Graphics");
		
		// Create Menu
		   			
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		
		Menu fileMenu = new Menu("Shapes");
		mb.add(fileMenu);
		
		MenuItem miP1 = new MenuItem("Problem 1");
		miP1.addActionListener(this);
		fileMenu.add(miP1);
		
		MenuItem miP2 = new MenuItem("Problem 2");
		miP2.addActionListener(this);
		fileMenu.add(miP2);
		
		MenuItem miP3 = new MenuItem("Problem 3");
		miP3.addActionListener(this);
		fileMenu.add(miP3);
		
		MenuItem miP4 = new MenuItem("Problem 4");
		miP4.addActionListener(this);
		fileMenu.add(miP4);
		
		MenuItem miP5 = new MenuItem("Problem 5");
		miP5.addActionListener(this);
		fileMenu.add(miP5);
		
		
		// End program when window is closed
		
		WindowListener l = new WindowAdapter()
		{
						
			public void windowClosing(WindowEvent ev)
			{
				System.exit(0);
			}
			
			public void windowActivated(WindowEvent ev)
			{
				repaint();
			}
			
			public void windowStateChanged(WindowEvent ev)
			{
				repaint();
			}
		
		};
		
		ComponentListener k = new ComponentAdapter()
		{
			public void componentResized(ComponentEvent e) 
			{
        		repaint();           
    		}
		};
		
		// register listeners
			
		this.addWindowListener(l);
		this.addComponentListener(k);

	}
	
//******************************************************************************
//  called by windows manager whenever the application window performs an action
//  (select a menu item, close, resize, ....
//******************************************************************************

public void actionPerformed (ActionEvent ev)
	{
	// figure out which command was issued
	
	command = ev.getActionCommand();
	
	// take action accordingly
	switch (command)
	{
	case "Problem 1":
	{
		repaint();
		break;
	}
	case "Problem 2":
	{
		repaint();
		break;
	}
	case "Problem 3":
	{
		repaint();
		break;
	}
	case "Problem 4":
	{
		repaint();
		break;
	}
	case "Problem 5":
	{
		repaint();
		break;
	}
	
	}
}
//********************************************************
// called by repaint() to redraw the screen
//********************************************************
		
public void paint(Graphics g)
{
	
	// Check Command issued, take action accordingly
		ww = (int)this.getWidth();
		wh = (int)this.getHeight();
		int bar = 50;
		int border = 5;
		switch (command)
		{
		case "Problem 1":
		{
			int w = ww;
			int h = wh - bar;
			int x1 = ww/2;
			int y1 = bar;
			int x2 = 0;
			int y2 = h/2+50;
			g.drawLine(x1, y1, x2, y2);
			x1 = ww/2;
			y1 = bar;
			x2 = w-1;
			y2 = h/2+50;
			g.drawLine(x1, y1, x2, y2);
			g.drawLine(0,h/2+bar,w-1,h/2+50);
			g.drawLine(w/2,h/2+bar,0,bar+h-1);
			g.drawLine(w/2, h/2+bar, w-1, bar+h-1);
			break;
		}
		case "Problem 2":
		{
			int x = 20;
			int y = 20+bar;
			int w = ww-40;
			int h = wh - bar-40;
			g.drawRect(x, y, w, h);
			g.drawLine(x, y, x+w, y+h);
			g.drawLine(x, y+h, x+w, y);
			
			
			
			//int gap = w/4;
			//g.drawLine(x+gap, y, x+gap, wh - 20);
			//g.drawLine(x+2*gap,y,x+2*gap,wh-20);
			//g.drawLine(x+3*gap, y, x+3*gap, wh-20);
			//g.drawLine(x,y+h/2,x+w,y+h/2);
			break;
		}
		case "Problem 3":
		{
			int x = 20;
			int y = 20+bar;
			int w = ww-30;
			int h = wh - bar-30;
			
			//int w = ww-40;
			//int h = wh - bar-40;
			g.drawRect(x, y, w, h);
			g.drawOval(x, y, w, h);
			g.drawLine(x+w/2, y, x+w/2, y+h);
			g.drawLine(x, y+h/2, x+w, y+h/2);
			break;
		}
		case "Problem 4":
		{
			int x = 20;
			int y = 20+bar;
			int w = ww-40;
			int h = wh - bar-40;
			g.drawRect(x, y, w, h);
			g.drawLine(x+w/2,y,x,y+h/2);
			g.drawLine(x, y+h/2, x+w, y+h/2);
			g.drawLine(x+w/2, y, x+w/2, y+h);
			g.drawLine(x+w/2, y+h, x+w, y+h/2);
			break;
		}
		case "Problem 5":
		{
			int x = 20;
			int y = 20+bar;
			int w = ww-40;
			int h = wh - bar-40;
			while (h>40 && w > 40)
			{
				g.drawRect(x, y, w, h);
				x = x +20;
				y = y +20;
				w = w - 40;
				h = h - 40;
			}
			break;
		}
		
		}
	}
}
