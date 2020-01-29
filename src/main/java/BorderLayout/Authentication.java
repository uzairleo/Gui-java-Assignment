package BorderLayout;

import java.awt.*;
import java.awt.event.*;
import static java.lang.System.exit;
import javax.swing.*;

public class Authentication implements ActionListener {

    JButton login = new JButton("Login");
    JButton signup = new JButton("SignUp");
    JFrame frame = new JFrame("BORDER LAYOUT DEMO");

    JLabel nameLabel = new JLabel("Username ");
    JLabel passwordLabel = new JLabel("Password ");
    JButton register = new JButton("Register");
    JButton cancel = new JButton("Cancel");

    public Authentication() {

        TextField textfield = new TextField(28);
        JPasswordField password = new JPasswordField(20);
        frame.getContentPane().setBackground(new Color(157, 242, 144));

        frame.setLayout(new BorderLayout());

        Panel northpanel = new Panel();
        Panel southpanel = new Panel();
        Panel centerpanel = new Panel();
        Panel notePanel = new Panel();

        frame.add(notePanel, BorderLayout.NORTH);
        northpanel.add(nameLabel);
        northpanel.add(textfield);
        frame.add(northpanel, BorderLayout.NORTH);

        centerpanel.add(passwordLabel);
        centerpanel.add(password);
        frame.add(centerpanel, BorderLayout.CENTER);

        southpanel.add(signup);
        southpanel.add(login);
        frame.add(southpanel, BorderLayout.SOUTH);

        nameLabel.setFont(new Font("Courier New", Font.PLAIN, 15));
        passwordLabel.setFont(new Font("Courier New", Font.PLAIN, 15));
        login.setFont(new Font("Courier New", Font.PLAIN, 15));
        signup.setFont(new Font("Courier New", Font.PLAIN, 15));

        //event Registration
        signup.addActionListener(this);
        login.addActionListener(this);

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Authentication();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            JOptionPane.showMessageDialog(null, "Try to login with username: uzaielo pswd: leo1234");

        } else if (e.getSource() == signup) {
            navigateToNext();

        } else if (e.getSource() == register) {
            JOptionPane.showMessageDialog(null, "Thanks for sign up :)");
     
        } else if (e.getSource() == cancel) {
                exit(0);
                
        }
    }

    public void navigateToNext() {
        JFrame frame1 = new JFrame("GRIDLAYOUT DEMO)");
        
        frame.getContentPane().setBackground(new Color(157, 242, 144));
        JPanel P1 = new JPanel();
        P1.setLayout(new GridLayout(8, 2));
        frame1.setFont(new Font("Courier New", Font.BOLD, 16));

        JLabel title = new JLabel("Signup");
        JLabel title1 = new JLabel("");
        JLabel firstName = new JLabel("First name");
        JLabel lastName = new JLabel("Last name");
        JLabel email = new JLabel("Enter your email");
        JLabel password = new JLabel("Enter Password");
        JLabel phone = new JLabel("Contact no");
        JLabel DOB = new JLabel("Date of Birth");

        TextField nameTf = new TextField(20);
        TextField lastTf = new TextField(20);
        TextField emailTf = new TextField(20);
        TextField dofTf = new TextField(20);
        TextField contactTf = new TextField(20);
        JPasswordField passwordTf = new JPasswordField(20);

        P1.add(title);
        P1.add(title1);
        P1.add(firstName);
        P1.add(nameTf);
        P1.add(lastName);
        P1.add(lastTf);
        P1.add(email);
        P1.add(emailTf);
        P1.add(password);
        P1.add(passwordTf);
        P1.add(phone);
        P1.add(contactTf);
        P1.add(DOB);
        P1.add(dofTf);
        frame1.add(P1);
        P1.add(register);
        P1.add(cancel);
        frame1.setSize(600, 300);
        frame1.setVisible(true);

        register.addActionListener(this);
        cancel.addActionListener(this);

        firstName.setFont(new Font("Courier New", Font.BOLD, 15));
        lastName.setFont(new Font("Courier New", Font.BOLD, 15));
        email.setFont(new Font("Courier New", Font.BOLD, 15));
        password.setFont(new Font("Courier New", Font.BOLD, 15));
        phone.setFont(new Font("Courier New", Font.BOLD, 15));
        DOB.setFont(new Font("Courier New", Font.BOLD, 15));
        register.setFont(new Font("Courier New", Font.BOLD, 15));
        cancel.setFont(new Font("Courier New", Font.BOLD, 15));
        title.setFont(new Font("Courier New", Font.BOLD, 15));

    }

}
