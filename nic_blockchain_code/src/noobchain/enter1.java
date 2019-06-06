package noobchain;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class enter1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					enter1 frame = new enter1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public enter1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 829, 544);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("NIC SERVICE BOOK");
		label.setFont(new Font("Times New Roman", Font.BOLD, 26));
		label.setBounds(222, 13, 352, 42);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Username");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_1.setBounds(87, 155, 121, 29);
		contentPane.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(401, 160, 157, 29);
		contentPane.add(textField);
		
		JLabel label_2 = new JLabel("Password");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_2.setBounds(87, 245, 121, 29);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(401, 250, 157, 29);
		contentPane.add(textField_1);
		
		JButton button = new JButton("Submit");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
            {
		      /*  try {
		        	String url="jdbc;mysql://localhost:3306/servicebook";
		        	String uname="root";
		        	String pass="root";
		        	
					getClass().forName("com.mysql.jdbc.driver");
					Connection con= DriverManager.getConnection(url,uname,pass);
		        	Statement stmt= con.createStatement();
		        	String sql="select * from admin";
		        	Resultset rs= stmt.executeQuery(sql);
				} catch (Exception e)
		       { System.out.print(e);
					// TODO: handle exception
				}*/
				String password= textField_1.getText();
				String username= textField.getText();
				if (username.contains("kpsingh") && password.contains("1234")) 
				{
				JOptionPane.showMessageDialog(null, "Login sucessful !!!");
				enter2 n=new enter2();
				n.setVisible(true);
			    enter1 m=new enter1();
			    m.dispose();
			    }
				else 
					
					JOptionPane.showMessageDialog(null, " Login unsucessful !!!");
			
		        
	        }
		});
		button.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button.setBounds(297, 407, 97, 25);
		contentPane.add(button);
	}

}
