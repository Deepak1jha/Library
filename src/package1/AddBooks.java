package package1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.*;
import net.proteanit.sql.DbUtils;
import java.sql.*;

public class AddBooks extends JPanel 
{
	JLabel l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31;
	JTextField tf4, tf5, tf6, tf7, tf8, tf9, tf10, tf11, tf12, tf13, tf14, tf15, tf16, tf18, tf19, tf20, tf21;
	JButton btn3, btn4, btn5, btn6, btn7, btn8, btn9,clear;
	Connection con  = null;
	Statement st =  null;
	JComboBox jcb2, tf3;
	JTable table2;
	JTableHeader header2;
	Dimension d4;
	JDesktopPane jdp3, jdp4, jdp5;
	public AddBooks() 
	{
		setLayout(new BorderLayout());
		
		jdp3 = new JDesktopPane();
		Dimension d2 = getPreferredSize();
		d2.width = 500;
		jdp3.setPreferredSize(d2);
		add(jdp3,BorderLayout.LINE_START);
		jdp3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Add new book:"));
		l14 = new JLabel("BOOK INFORMATION");
		l14.setBounds(140,8,200,50);
		l14.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l14);
		//---------------------------------------------------
		l15 = new JLabel("The Book Subject:");
		l15.setBounds(50,80,250,25);
		l15.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l15);
		
		String [] ctf3 = {"Android", "Data structure", "JAVA", "WEB", "PHP", "python", "Hacking", "Csharp"};
		tf3 = new JComboBox(ctf3);
		tf3.setEditable(false);
		tf3.setBounds(300,80,150,25);
		tf3.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(tf3);
		
		l16 = new JLabel("The Book Title:");
		l16.setBounds(50,110,250,25);
		l16.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l16);
		tf4 = new JTextField();
		tf4.setBounds(300,110,150,25);
		tf4.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(tf4);
	
		l17 = new JLabel("The Name of the Author(s):");
		l17.setBounds(50,140,250,25);
		l17.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l17);
		tf5 = new JTextField();
		tf5.setBounds(300,140,150,25);
		tf5.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(tf5);
		
		l18 = new JLabel("The Name of the Publisher(s):");
		l18.setBounds(50,170,250,25);
		l18.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l18);
		tf6 = new JTextField();
		tf6.setBounds(300,170,150,25);
		tf6.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(tf6);
		
		l19 = new JLabel("Copyright for the book:");
		l19.setBounds(50,200,250,25);
		l19.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l19);
		tf7 = new JTextField();
		tf7.setBounds(300,200,150,25);
		tf7.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(tf7);
		
		l20 = new JLabel("The edition number:");
		l20.setBounds(50,230,250,25);
		l20.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l20);
		tf8 = new JTextField();
		tf8.setBounds(300,230,150,25);
		tf8.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(tf8);
		
		l21 = new JLabel("The number of Pages:");
		l21.setBounds(50,260,250,25);
		l21.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l21);
		tf9 = new JTextField();
		tf9.setBounds(300,260,150,25);
		tf9.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(tf9);
		
		l22 = new JLabel("ISBN of the book:");
		l22.setBounds(50,290,250,25);
		l22.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l22);
		tf10 = new JTextField();
		tf10.setBounds(300,290,150,25);
		tf10.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(tf10);
		//---------------------------------------------------
		
		l24 = new JLabel("The Name of the Library:");
		l24.setBounds(50,320,250,25);
		l24.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l24);
		tf12 = new JTextField();
		tf12.setBounds(300,320,150,25);
		tf12.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(tf12);
		
		l25 = new JLabel("Self No:");
		l25.setBounds(50,350,250,25);
		l25.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l25);
		tf13 = new JTextField();
		tf13.setBounds(300,350,150,25);
		tf13.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(tf13);

		l26 = new JLabel("Serial No:");
		l26.setBounds(50,380,250,25);
		l26.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(l26);
		tf14 = new JTextField();
		tf14.setBounds(300,380,150,25);
		//tf14.setEnabled(false);
		tf14.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp3.add(tf14);
		
		
		ImageIcon iconclear = new ImageIcon("img/clear.png");
		clear = new JButton(iconclear);
		clear.setBounds(210,490,48,48);
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.setToolTipText("Clear");
		jdp3.add(clear);
		
		
		ImageIcon iconM = new ImageIcon("img/modify.png");
		btn3 = new JButton(iconM);
		btn3.setBounds(300,490,48,48);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setToolTipText("Modify values");
		jdp3.add(btn3);
		ImageIcon iconi = new ImageIcon("img/insert.png");
		btn4 = new JButton(iconi);
		btn4.setBounds(390,490,48,48);
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setToolTipText("Insert values");
		jdp3.add(btn4);
		//--------------------------------------------------------------------------------------------------------------------------
		
		jdp4 = new JDesktopPane();
		jdp4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Books List"));
		add(jdp4,BorderLayout.CENTER);
		jdp4.setLayout(new BorderLayout());
		//---------------------------------------------------------------------------------------------------------------------------
		
		jdp5 = new JDesktopPane();
		jdp4.add(jdp5,BorderLayout.PAGE_END);
		Dimension d3 = getPreferredSize();
		d3.height = 200;
		jdp5.setPreferredSize(d3);
		jdp5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Filter Box"));
		
		
		ImageIcon iconA = new ImageIcon("img/ar.png");
		l27 = new JLabel("Serial Number:");
		l27.setBounds(60,40,250,25);
		l27.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp5.add(l27);
		
		tf15 = new JTextField();
		//tf15.setEnabled(false);
		tf15.setBounds(210,40,150,25);
		tf15.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp5.add(tf15);
		btn5 = new JButton(iconA);
		btn5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btn5.setBounds(390,40,32,25);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp5.add(btn5);
		
		l28 = new JLabel("ISBN Number:");
		l28.setBounds(60,80,250,25);
		l28.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp5.add(l28);
		tf16 = new JTextField();
		tf16.setBounds(210,80,150,25);
		tf16.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp5.add(tf16);
		btn6 = new JButton(iconA);
		btn6.setBounds(390,80,32,25);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp5.add(btn6);
		
		l29 = new JLabel("Select Subject:");
		l29.setBounds(60,120,250,25);
		l29.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp5.add(l29);
		
		String [] c = {"Android", "Data structure", "JAVA", "WEB", "PHP", "python", "Hacking", "Csharp"};
		jcb2 = new JComboBox(c);
		jcb2.setEditable(false);
		jcb2.setBounds(210,120,150,25);
		
		jdp5.add(jcb2);
		btn7 = new JButton(iconA);
		btn7.setBounds(390,120,32,25);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp5.add(btn7);
		
		ImageIcon iconRef = new ImageIcon("img/reFresh.png");
		btn8 = new JButton(iconRef);
		btn8.setBounds(500,60,64,64);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp5.add(btn8);
		
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://LocalHost:3306/lib","root","123");
		}
		catch(Exception ea)
		{
			JOptionPane.showMessageDialog(null, ea);
		}
		//----------------------------------
		table2 = new JTable();
		header2 = table2.getTableHeader();
		jdp4.add(header2,BorderLayout.NORTH);
		table2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		d4 = getPreferredSize();
		d4.width = 630;
		jdp4.setPreferredSize(d4);
		jdp4.add(new JScrollPane(table2),BorderLayout.CENTER);
		
	
		
		
		
		distable();
		clear.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
			{
				tf14.setText("");
				tf4.setText("");
				tf5.setText("");
				tf6.setText("");
				tf7.setText("");
				tf8.setText("");
				tf9.setText("");
				tf10.setText("");
				//tf11.setText("");
				tf12.setText("");
				tf13.setText("");
			}
		});
		btn4.addActionListener(new ActionListener() 
		{
			//private Object Book_Subject;

			public void actionPerformed(ActionEvent event)
			{
				try
				{
					PreparedStatement inval = con.prepareStatement("Insert into book_db values(?,?,?,?,?,?,?,?,?,?,?)");
					String Serial_No = tf14.getText();
					String item = (String)tf3.getSelectedItem();
					String Book_Title = tf4.getText();
					String Author_Name = tf5.getText();
					String Publisher = tf6.getText();
					String Copyright = tf7.getText();
					String Edition = tf8.getText();
					String No_Of_Pages = tf9.getText();
					String ISBN_No = tf10.getText();
					String Library_Name = tf12.getText();
					String Self_No = tf13.getText();
					
					inval.setString(1, Serial_No);
					inval.setString(2, item);
					inval.setString(3, Book_Title);
					inval.setString(4, Author_Name);
					inval.setString(5, Publisher);
					inval.setString(6, Copyright);
					inval.setString(7, Edition);
					inval.setString(8, No_Of_Pages);
					inval.setString(9, ISBN_No);
					inval.setString(10, Library_Name);
					inval.setString(11, Self_No);
					
					inval.executeUpdate();
					distable();
					tf14.setText("");
					tf4.setText("");
					tf5.setText("");
					tf6.setText("");
					tf7.setText("");
					tf8.setText("");
					tf9.setText("");
					tf10.setText("");
					tf12.setText("");
					tf13.setText("");
					javax.swing.JOptionPane.showMessageDialog(null, "Data inserted successfully");
				}
				catch(Exception e)
				{
					javax.swing.JOptionPane.showMessageDialog(null, e);
				}
			
			}
		});
		
		
		table2.addMouseListener(new java.awt.event.MouseAdapter() 
		{
			public void mouseClicked(java.awt.event.MouseEvent evt) 
			{
				table2MouseClicked(evt);
			}
		});
		btn3.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
			{
				try
				{
					st = con.createStatement();
					String i1 = (String)tf3.getSelectedItem();
					String str1="UPDATE book_db SET Serial_No='"+tf14.getText()+"',Book_Subject='"+i1+"',Book_Title='"+tf4.getText()+"',Author_Name='"+tf5.getText()+"',Publisher='"+tf6.getText()+"',Copyright='"+tf7.getText()+"',Edition='"+tf8.getText()+"',No_Of_Pages='"+tf9.getText()+"',ISBN_No='"+tf10.getText()+"',Library_Name='"+tf12.getText()+"',Self_No='"+tf13.getText()+"' where Serial_No='"+tf14.getText()+"'";
			    	st.executeUpdate(str1);
					javax.swing.JOptionPane.showMessageDialog(null, "Data is modified");
					distable();
				}
				catch(Exception e)
				{
					javax.swing.JOptionPane.showMessageDialog(null, e);
				}
			
			}
		});
		
	//--------------------------filter box-----------------------------------
		
		btn5.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
			{
				try
				{
					String q = "select * From book_db where Serial_No ="+tf15.getText();;
					PreparedStatement pst = con.prepareStatement(q);
					ResultSet rs = pst.executeQuery();
					table2.setModel(DbUtils.resultSetToTableModel(rs));
							
				}
				catch(Exception e)
				{
					javax.swing.JOptionPane.showMessageDialog(null, e);
					
				}
			}
		});
		
		btn6.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
			{
				try
				{
					String q = "select * From book_db where ISBN_No ="+tf16.getText();;
					PreparedStatement pst = con.prepareStatement(q);
					ResultSet rs = pst.executeQuery();
					table2.setModel(DbUtils.resultSetToTableModel(rs));
							
				}
				catch(Exception e)
				{
					javax.swing.JOptionPane.showMessageDialog(null, e);
					
				}
			}
		});
		
		btn7.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
			{
				try
				{
					String item = (String)jcb2.getSelectedItem();
					String q = "select * From book_db where Book_Subject='"+item+"'";
					PreparedStatement pst = con.prepareStatement(q);
					ResultSet rs = pst.executeQuery();
					table2.setModel(DbUtils.resultSetToTableModel(rs));
				}
				catch(Exception e)
				{
					javax.swing.JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
		btn8.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
			{
				distable();
				tf15.setText("");
				tf16.setText("");
			}
		});
		
		
	}
	void distable()
	{
		try
		{
			String q = "select * From book_db";
			PreparedStatement pst = con.prepareStatement(q);
			ResultSet rs = pst.executeQuery();
			table2.setModel(DbUtils.resultSetToTableModel(rs));
					
		}
		catch(Exception e)
		{
			
		}
		
	}
	private void table2MouseClicked(java.awt.event.MouseEvent evt) 
	{                                   
		
		int selectedRow = table2.getSelectedRow();
		tf14.setText(table2.getValueAt(selectedRow, 0).toString());
		tf3.setSelectedItem(table2.getValueAt(selectedRow, 1).toString());
		tf4.setText(table2.getValueAt(selectedRow, 2).toString());
		tf5.setText(table2.getValueAt(selectedRow, 3).toString());
		tf6.setText(table2.getValueAt(selectedRow, 4).toString());
		tf7.setText(table2.getValueAt(selectedRow, 5).toString());
		tf8.setText(table2.getValueAt(selectedRow, 6).toString());
		tf9.setText(table2.getValueAt(selectedRow, 7).toString());
		tf10.setText(table2.getValueAt(selectedRow, 8).toString());
		tf12.setText(table2.getValueAt(selectedRow, 9).toString());
		tf13.setText(table2.getValueAt(selectedRow, 10).toString());
	} 
}