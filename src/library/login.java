package library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import javax.swing.JPasswordField;
import java.awt.Font;
//import java.awt.Button;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblJamiaHamdardUniversity;
	private JLabel lblCentralLibrary;
	Connection con  = null;
	Statement st =  null;
	boolean status = false;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(687, 533);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		JLabel lblNewLabel = new JLabel("User Name :");
		lblNewLabel.setForeground(new Color(255, 153, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(116, 349, 130, 33);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password :");
		lblNewLabel_1.setForeground(new Color(255, 153, 102));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(116, 393, 130, 33);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(286, 344, 275, 36);
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 18));
		passwordField.setEchoChar('*');
		passwordField.setBounds(286, 391, 275, 36);
		panel.add(passwordField);
		
		lblJamiaHamdardUniversity = new JLabel("JAMIA HAMDARD UNIVERSITY");
		lblJamiaHamdardUniversity.setForeground(new Color(255, 153, 102));
		lblJamiaHamdardUniversity.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblJamiaHamdardUniversity.setBounds(174, 265, 378, 47);
		panel.add(lblJamiaHamdardUniversity);
		
		lblCentralLibrary = new JLabel("CENTRAL LIBRARY");
		lblCentralLibrary.setForeground(new Color(255, 153, 102));
		lblCentralLibrary.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblCentralLibrary.setBounds(251, 305, 200, 33);
		panel.add(lblCentralLibrary);
		
		try
		{
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123");
		}
		catch(Exception ea)
		{
			JOptionPane.showMessageDialog(null, ea);
		}
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				try{
				String name=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				
				PreparedStatement ps=(PreparedStatement) con.prepareStatement("select * from lib_login where user=? and pwd=?");
				ps.setString(1,name);
				ps.setString(2,password);
				ResultSet rs=ps.executeQuery();
				status=rs.next();
				
				
				if(status == true)
				{
					Library.main(new String[]{});
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "check user name and password ");
				}
				}
				catch(Exception m)
				{
					JOptionPane.showMessageDialog(null, m);
				}
				
				
			}
		});
		btnNewButton.setBounds(332, 438, 89, 33);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(446, 438, 89, 33);
		panel.add(btnNewButton_1);
		ImageIcon ic = new ImageIcon("img/jamia.png");
		JLabel lblNewLabel_2 = new JLabel(ic);
		lblNewLabel_2.setBounds(240, 11, 251, 248);
		panel.add(lblNewLabel_2);
	}
}
