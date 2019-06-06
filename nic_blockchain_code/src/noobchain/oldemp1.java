package noobchain;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class oldemp1 extends JFrame {

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
					oldemp1 frame = new oldemp1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static connection con=null;

	/**
	 * Create the frame.
	 */
	public void login(){
		try {
			con=(connection) DriverManager.getConnection("jdbc:postgres://localhost:5432/service_book","postgres","1234");
			
		} catch (Exception e) {System.out.print(e);
		
			// TODO: handle exception
		}
		
		
	}
	public oldemp1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 801, 568);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("NIC SERVICE BOOK");
		label.setFont(new Font("Times New Roman", Font.BOLD, 26));
		label.setBounds(224, 13, 352, 42);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Please enter the details carefully !!");
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_1.setBounds(224, 56, 332, 42);
		contentPane.add(label_1);
		
		JLabel lblEmployeeName = new JLabel("Employee Name");
		lblEmployeeName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEmployeeName.setBounds(86, 143, 144, 32);
		contentPane.add(lblEmployeeName);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEmployeeId.setBounds(86, 220, 144, 32);
		contentPane.add(lblEmployeeId);
		
		textField = new JTextField();
		textField.setBounds(345, 143, 165, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(345, 227, 165, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnFetchData = new JButton("Fetch Data");
		btnFetchData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String empname=textField.getText();
				int id=Integer.parseInt(textField_1.getText());
				
				
				oldemp2 emp=new oldemp2();
				emp.setVisible(true);
				
				oldemp1 em=new oldemp1();
				em.dispose();
			}
		});
		btnFetchData.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnFetchData.setBounds(144, 385, 130, 25);
		contentPane.add(btnFetchData);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String username="postgres";
				String pass="1234";
				String conurl="jdbc:postgres://localhost:5432/service_book";
			
				try {
					String query="select * from admin_pers_mast;";
					
				} catch (Exception ex) {System.out.print(ex);
					// TODO: handle exception
				}
				
				enter2 en=new enter2();
				en.setVisible(true);
				
				oldemp1 ol=new oldemp1();
				ol.dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(490, 387, 97, 25);
		contentPane.add(btnBack);
	}
}
