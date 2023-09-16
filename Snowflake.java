import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

class SnowFlakePanel extends JPanel
{
	public SnowFlakePanel()
	{
		super.setPreferredSize(new Dimension(400, 400));
		super.setBackground(Color.WHITE);
	}

	public void paintComponent(Graphics g)
	{
		int width  = getWidth();
		int height = getHeight();
		super.paintComponent(g);
      g.setColor(Color.BLUE);
      drawStar(g, 200, 200, 100);

		/*
		 * DRAWING CODE BELOW
		 */
	}
   
   public void drawStar(Graphics g, int x, int y, int size)
      {
         if (size > 5)
            {
               int i = 0;
               while (i < 6)
                  {
                     double  distanceForX = (size * Math.cos(i * (2 * Math.PI)/6));
                     double  distanceForY = (size * Math.sin(i * (2 * Math.PI)/6));
                     g.drawLine(x, y, (int)(x + distanceForX), (int)(y + distanceForY));
                     drawStar(g, (int)(x + distanceForX), (int)(y + distanceForY), size/3);
                     i++;
                  }
            }
      }
}

public class Snowflake
{
	public static void main ( String[] args )
	{
		/*
		 * A frame is a container for a panel
		 * The panel is where the drawing will take place
		 */
		JFrame frame = new JFrame("Snowflake");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new SnowFlakePanel());
		frame.pack();
		frame.setVisible(true);
	}
}
