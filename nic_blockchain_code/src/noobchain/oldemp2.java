package noobchain;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class oldemp2 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oldemp2 frame = new oldemp2();
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
			
		} 
		catch (Exception e) { 
			System.out.print(e);
		}
		
		}
	public oldemp2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("NIC SERVICE BOOK");
		label.setFont(new Font("Times New Roman", Font.BOLD, 26));
		label.setBounds(240, 13, 352, 42);
		contentPane.add(label);
		
		JButton btnAddData = new JButton("Add Data");
		btnAddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String username="postgres";
				String pass="1234";
				String conurl="jdbc:postgres://localhost:5432/service_book";
				String mystring=null;
			
				try {
					Class.forName("org.postgres.driver");
					Connection con=DriverManager.getConnection("jdbc:postgres://localhost:5432/service_book/postgres/1234");
					Statement stmt=con.createStatement();
					String qury="select * from admin_pers_mast;";
				   
					ResultSet rs=stmt.executeQuery(qury);
					while (rs.next()) {
						mystring=rs.getString("admin_pers_mast");
					}
					
					 
					//scrollPane.setText(rs);
				} catch (Exception ex) {System.out.print(ex);
					// TODO: handle exception
				}
			
			}
		});
		btnAddData.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddData.setBounds(663, 477, 145, 25);
		contentPane.add(btnAddData);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(45, 68, 748, 366);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
}
