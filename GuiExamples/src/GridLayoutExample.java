import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Food Menu");

        frame.setSize(400, 300);

        // 3 rows and 2 columns
        frame.setLayout(new GridLayout(3, 2, 10, 10));

        frame.add(new JButton("Burger"));
        frame.add(new JButton("Pizza"));

        frame.add(new JButton("Biryani"));
        frame.add(new JButton("Dosa"));

        frame.add(new JButton("Noodles"));
        frame.add(new JButton("Sandwich"));

        
        frame.setVisible(true);
    }
}
