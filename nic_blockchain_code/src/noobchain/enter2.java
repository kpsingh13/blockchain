package noobchain;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class enter2 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					enter2 frame = new enter2();
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
	public enter2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("NIC SERVICE BOOK");
		label.setFont(new Font("Times New Roman", Font.BOLD, 26));
		label.setBounds(213, 13, 352, 42);
		contentPane.add(label);
		
		JButton btnNewEmployee = new JButton("New Employee");
		btnNewEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newemp1 nem=new newemp1();
				nem.setVisible(true);
				
				enter2 en=new enter2();
				en.dispose();
			}
		});
		btnNewEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewEmployee.setBounds(96, 182, 173, 34);
		contentPane.add(btnNewEmployee);
		
		JButton btnExistingEmployee = new JButton("Existing Employee");
		btnExistingEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oldemp1 oem=new oldemp1();
				oem.setVisible(true);
				
				enter2 en1= new enter2();
				en1.dispose();
				
				
			}
		});
		btnExistingEmployee.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnExistingEmployee.setBounds(417, 182, 181, 30);
		contentPane.add(btnExistingEmployee);
	}

}
