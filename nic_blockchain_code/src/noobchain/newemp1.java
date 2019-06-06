package noobchain;

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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class newemp1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newemp1 frame = new newemp1();
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
	public newemp1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("NIC SERVICE BOOK");
		label.setFont(new Font("Times New Roman", Font.BOLD, 26));
		label.setBounds(231, 0, 352, 42);
		contentPane.add(label);
		
		JLabel lblPleaseEnterThe = new JLabel("Please enter the details carefully !!");
		lblPleaseEnterThe.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblPleaseEnterThe.setBounds(223, 40, 332, 42);
		contentPane.add(lblPleaseEnterThe);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblName.setBounds(148, 143, 88, 27);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
			}
		});
		textField.setBounds(375, 147, 168, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblFathersName = new JLabel("Father's Name");
		lblFathersName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblFathersName.setBounds(148, 183, 125, 27);
		contentPane.add(lblFathersName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(375, 182, 168, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblOdb = new JLabel("ODB");
		lblOdb.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblOdb.setBounds(148, 228, 56, 16);
		contentPane.add(lblOdb);
		
		textField_2 = new JTextField();
		textField_2.setBounds(375, 222, 168, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(375, 257, 168, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEmployeeId.setBounds(148, 252, 125, 33);
		contentPane.add(lblEmployeeId);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent arg0) {
				
				String name=textField.getText();
				String fathername=textField_1.getText();
				String dob=textField_2.getText();
				int id=Integer.parseInt(textField_3.getText());
			    String serialised= name+id+fathername+dob;
				String hash2;
			    //System.out.println("Trying to Mine block 1... ");
				NoobChain nb= new NoobChain();
				
				
				nb.addBlock(new Block(serialised,"0")); //call for the function to create hash
				//JOptionPane.showMessageDialog(null, "Hash generated and the data entered sucessfully");
				  
				//System.out.print("the created block is");
				//Block b=new Block(serialised,"7");
				//b.mineBlock(0);
				
			}
		});
		
	
		btnSubmit.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnSubmit.setBounds(231, 372, 125, 33);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enter2 en=new enter2();
				en.setVisible(true);
				
				newemp1 nem=new newemp1();
				nem.dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnBack.setBounds(481, 372, 125, 31);
		contentPane.add(btnBack);
	}

}
