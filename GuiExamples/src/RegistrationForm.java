import javax.swing.*;
import java.awt.*;

public class RegistrationForm {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Registration Form");

        frame.setSize(450, 350);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        // Space around components
        gbc.insets = new Insets(8, 8, 8, 8);
        // Name
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel label = new JLabel("Name:");
        frame.add(label, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(new JTextField(20), gbc);
        // Email
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(new JTextField(20), gbc);


        // Phone
        gbc.gridx = 0;
        gbc.gridy = 2;
        frame.add(new JLabel("Phone:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(new JTextField(20), gbc);


        // Gender
        gbc.gridx = 0;
        gbc.gridy = 3;
        frame.add(new JLabel("Gender:"), gbc);

        JPanel genderPanel = new JPanel();
        JRadioButton male = new JRadioButton("Male");
        JRadioButton female = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);

        genderPanel.add(male);
        genderPanel.add(female);

        gbc.gridx = 1;
        gbc.gridy = 3;
        frame.add(genderPanel, gbc);


        // Course
        gbc.gridx = 0;
        gbc.gridy = 4;
        frame.add(new JLabel("Course:"), gbc);

        String[] courses = {"Java", "Python", "Angular", "React"};

        JComboBox<String> courseBox = new JComboBox<>(courses);

        gbc.gridx = 1;
        gbc.gridy = 4;
        frame.add(courseBox, gbc);


        // Register Button
        JButton registerButton = new JButton("Register");

        gbc.gridx = 1;
        gbc.gridy = 5;
        frame.add(registerButton, gbc);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}