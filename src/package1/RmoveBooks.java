package package1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import net.proteanit.sql.DbUtils;
public class RmoveBooks extends JPanel 
{
	JLabel l32, l33, l34, l35, l36, l37, l38, l39, l40, l41, l42, l43, l44, l45, l46, l47;
	JTextField  tf23, tf24, tf25, tf26, tf27, tf28, tf29, tf31, tf32, tf33, tf34, tf35;
	JButton btn10, btn11, btn12, btn13, btn14, clear;
	JTable table3;
	JComboBox jcb3,tf22;
	Connection con  = null;
	public RmoveBooks() 
	{
		setLayout(new BorderLayout());
		JDesktopPane jdp6 = new JDesktopPane();
		Dimension d5 = getPreferredSize();
		d5.width = 500;
		jdp6.setPreferredSize(d5);
		add(jdp6,BorderLayout.LINE_START);
		jdp6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Remove Book:"));
		l44 = new JLabel("REMOVE BOOKS");
		l44.setBounds(140,8,200,50);
		l44.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l44);
		//---------------------------------------------------
		l32 = new JLabel("The Book Subject:");
		l32.setBounds(50,80,250,25);
		l32.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l32);
		
		final String [] ctf3 = {"Android", "Data structure", "JAVA", "WEB", "PHP", "python", "Hacking", "Csharp"};
		tf22 = new JComboBox(ctf3);
		tf22.setEditable(false);
		tf22.setBounds(300,80,150,25);
		tf22.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(tf22);
		
		
		l33 = new JLabel("The Book Title:");
		l33.setBounds(50,110,250,25);
		l33.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l33);
		tf23 = new JTextField();
		tf23.setBounds(300,110,150,25);
		tf23.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(tf23);
	
		l34 = new JLabel("The Name of the Author(s):");
		l34.setBounds(50,140,250,25);
		l34.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l34);
		tf24 = new JTextField();
		tf24.setBounds(300,140,150,25);
		tf24.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(tf24);
		
		l35 = new JLabel("The Name of the Publisher(s):");
		l35.setBounds(50,170,250,25);
		l35.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l35);
		tf25 = new JTextField();
		tf25.setBounds(300,170,150,25);
		tf25.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(tf25);
		
		l36 = new JLabel("Copyright for the book:");
		l36 .setBounds(50,200,250,25);
		l36 .setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l36);
		tf26 = new JTextField();
		tf26.setBounds(300,200,150,25);
		tf26.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(tf26);
		
		l37 = new JLabel("The edition number:");
		l37.setBounds(50,230,250,25);
		l37.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l37);
		tf27 = new JTextField();
		tf27.setBounds(300,230,150,25);
		tf27.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(tf27);
		
		l38 = new JLabel("The number of Pages:");
		l38.setBounds(50,260,250,25);
		l38.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l38);
		tf28 = new JTextField();
		tf28.setBounds(300,260,150,25);
		tf28.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(tf28);
		
		l39 = new JLabel("ISBN of the book:");
		l39.setBounds(50,290,250,25);
		l39.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l39);
		tf29 = new JTextField();
		tf29.setBounds(300,290,150,25);
		tf29.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(tf29);
		//---------------------------------------------------
		l41 = new JLabel("The Name of the Library:");
		l41.setBounds(50,320,250,25);
		l41.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l41);
		tf31 = new JTextField();
		tf31.setBounds(300,320,150,25);
		tf31.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(tf31);

		l42 = new JLabel("Self No:");
		l42.setBounds(50,350,250,25);
		l42.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l42);
		tf32 = new JTextField();
		tf32.setBounds(300,350,150,25);
		tf32.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(tf32);
		
		//setBounds(50,380,250,25);
		//setBounds(300,380,150,25);
		
		l43 = new JLabel("Serial No:");
		l43.setBounds(50,380,250,25);
		l43.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(l43);
		tf33 = new JTextField();
		tf33.setBounds(300,380,150,25);
		tf33.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(tf33);
		
		ImageIcon iconremove = new ImageIcon("img/remove.png");
		btn10 = new JButton(iconremove);
		btn10.setBounds(390,490,48,48);
		btn10.setToolTipText("Remove book's");
		btn10.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp6.add(btn10);
		ImageIcon iconM = new ImageIcon("img/clear.png");
		clear = new JButton(iconM);
		clear.setBounds(300,490,48,48);
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.setToolTipText("Clear");
		jdp6.add(clear);
		//--------------------------------------------------------------------------------------------------------------------------
		
		JDesktopPane jdp7 = new JDesktopPane();
		jdp7.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Books List"));
		add(jdp7,BorderLayout.CENTER);
		jdp7.setLayout(new BorderLayout());
		//---------------------------------------------------------------------------------------------------------------------------
		
		JDesktopPane jdp8 = new JDesktopPane();
		jdp7.add(jdp8,BorderLayout.PAGE_END);
		Dimension d6 = getPreferredSize();
		d6.height = 200;
		jdp8.setPreferredSize(d6);
		jdp8.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Filter Box"));
		ImageIcon iconAR = new ImageIcon("img/ar.png");
		l45 = new JLabel("Serial Number:");
		l45.setBounds(60,40,250,25);
		l45.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp8.add(l45);
		tf34 = new JTextField();
		tf34.setBounds(210,40,150,25);
		tf34.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp8.add(tf34);
		btn11 = new JButton(iconAR);
		btn11.setBounds(390,40,32,25);
		btn11.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp8.add(btn11);
		
		l46 = new JLabel("ISBN Number:");
		l46.setBounds(60,80,250,25);
		l46.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp8.add(l46);
		tf35 = new JTextField();
		tf35.setBounds(210,80,150,25);
		tf35.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp8.add(tf35);
		btn12 = new JButton(iconAR);
		btn12.setBounds(390,80,32,25);
		btn12.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp8.add(btn12);
		
		l47 = new JLabel("Select Subject:");
		l47.setBounds(60,120,250,25);
		l47.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp8.add(l47);
		String [] cjcb3 = {"Android", "Data structure", "JAVA", "WEB", "PHP", "python", "Hacking", "Csharp"};
		jcb3 = new JComboBox(cjcb3);
	
		jcb3.setBounds(210,120,150,25);
		jcb3.setEditable(false);
		jdp8.add(jcb3);
		btn13 = new JButton(iconAR);
		btn13.setBounds(390,120,32,25);
		btn13.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp8.add(btn13);
		
		ImageIcon iconRef = new ImageIcon("img/reFresh.png");
		btn14 = new JButton(iconRef);
		btn14.setBounds(500,60,64,64);
		btn14.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp8.add(btn14);
		distable3();
		
		
		//-------------------------------------------------------------------------------------------------------------------------------------------
		try
		{
			con = (Connection) DriverManager.getConnection("jdbc:mysql://LocalHost:3306/lib","root","123");
		}
		catch(Exception ea)
		{
			JOptionPane.showMessageDialog(null, ea);
		}
			table3 = new JTable();
			JTableHeader header3 = table3.getTableHeader();
			jdp7.add(header3,BorderLayout.NORTH);
			table3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			Dimension d7 = getPreferredSize();
			d7.width = 630;
			jdp7.setPreferredSize(d7);
            jdp7.add(new JScrollPane(table3),BorderLayout.CENTER);
            distable3();
            
            table3.addMouseListener(new java.awt.event.MouseAdapter() 
    		{
    			public void mouseClicked(java.awt.event.MouseEvent evt) 
    			{
    				table3MouseClicked(evt);
    			}
    		});     
            
            btn10.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent event)
    			{
    				int n = JOptionPane.showConfirmDialog(null, 
    						"Would you like to delete the record?", "Confirm", 
    						JOptionPane.YES_NO_OPTION); 

    				if (n == JOptionPane.YES_OPTION) {
    				try
    				{
    					String item = tf33.getText();
    					PreparedStatement pst = (PreparedStatement) con.prepareStatement("DELETE FROM `book_db` WHERE Serial_No ="+item);
    					pst.executeUpdate();
    					javax.swing.JOptionPane.showMessageDialog(null, "Book is deleted");
    					distable3();
    				}
    				catch(Exception e)
    				{
    					javax.swing.JOptionPane.showMessageDialog(null, e);
    				}
    				}
    				else{}
    				
    			}
    		});
            clear.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent event)
    			{
    				tf33.setText("");
    				tf23.setText("");
    				tf24.setText("");
    				tf25.setText("");
    				tf26.setText("");
    				tf27.setText("");
    				tf28.setText("");
    				tf29.setText("");  
    				tf31.setText("");
    				tf32.setText("");
    			}
    		});
            
            //-----------------------------filter box--------------------------------
            
            btn11.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent event)
    			{
    				try
    				{
    					String q = "select * From book_db where Serial_No ="+tf34.getText();;
    					PreparedStatement pst = (PreparedStatement) con.prepareStatement(q);
    					ResultSet rs = pst.executeQuery();
    					table3.setModel(DbUtils.resultSetToTableModel(rs));
    							
    				}
    				catch(Exception e)
    				{
    					javax.swing.JOptionPane.showMessageDialog(null, e);
    					
    				}
    			}
    		});
    		
    		btn12.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent event)
    			{
    				try
    				{
    					String q = "select * From book_db where ISBN_No ="+tf35.getText();;
    					PreparedStatement pst = (PreparedStatement) con.prepareStatement(q);
    					ResultSet rs = pst.executeQuery();
    					table3.setModel(DbUtils.resultSetToTableModel(rs));
    							
    				}
    				catch(Exception e)
    				{
    					javax.swing.JOptionPane.showMessageDialog(null, e);
    					
    				}
    			}
    		});
    		
    		btn13.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent event)
    			{
    				try
    				{
    					String item = (String)jcb3.getSelectedItem();
    					String q = "select * From book_db where Book_Subject='"+item+"'";
    					PreparedStatement pst = (PreparedStatement) con.prepareStatement(q);
    					ResultSet rs = pst.executeQuery();
    					table3.setModel(DbUtils.resultSetToTableModel(rs));
    				}
    				catch(Exception e)
    				{
    					javax.swing.JOptionPane.showMessageDialog(null, e);
    				}
    				
    			}
    		});
    		btn14.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent event)
    			{
    				distable3();
    				tf34.setText("");
    				tf35.setText("");
    			}
    		});
		
	}
	void distable3()
	{
		try
		{
			String q = "select * From book_db";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(q);
			ResultSet rs = pst.executeQuery();
			table3.setModel(DbUtils.resultSetToTableModel(rs));
					
		}
		catch(Exception e)
		{
			
		}
		
	}
	
	private void table3MouseClicked(java.awt.event.MouseEvent evt) 
	{                                   
		
		int selectedRow = table3.getSelectedRow();
		
		
		tf33.setText(table3.getValueAt(selectedRow, 0).toString());
		
		tf22.setSelectedItem(table3.getValueAt(selectedRow, 1).toString());
		tf23.setText(table3.getValueAt(selectedRow, 2).toString());
		tf24.setText(table3.getValueAt(selectedRow, 3).toString());
		tf25.setText(table3.getValueAt(selectedRow, 4).toString());
		tf26.setText(table3.getValueAt(selectedRow, 5).toString());
		tf27.setText(table3.getValueAt(selectedRow, 6).toString());
		tf28.setText(table3.getValueAt(selectedRow, 7).toString());
		tf29.setText(table3.getValueAt(selectedRow, 8).toString());
		tf31.setText(table3.getValueAt(selectedRow, 9).toString());
		tf32.setText(table3.getValueAt(selectedRow, 10).toString());
	} 
}
