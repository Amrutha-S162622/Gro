import java.awt.BorderLayout;

import javax.swing.*;

public class LayoutsExample 
{
	public static void main(String[] args) {
		JFrame frame = new JFrame("BorderLayout Demo");
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());
        JButton north = new JButton("NORTH");
        JButton south = new JButton("SOUTH");
        JButton east = new JButton("EAST");
        JButton west = new JButton("WEST");
        JButton center = new JButton("CENTER");
        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(center, BorderLayout.CENTER);


        frame.setVisible(true);
	}
}
