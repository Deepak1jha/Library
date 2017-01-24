package package1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.table.*;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

import net.proteanit.sql.DbUtils;
public class Searches extends JPanel
{
	JLabel l1, l2, l3, l4, l5, l7, l9,l11, l12;
	JTextField tf1, tf2,l6, l8,l8c,l10,l13;
	JButton btn1, btn2, btnc, clear, refresh;
	Connection con  = null;
	Statement st =  null;
	JTable table1;
	JComboBox jcb2;
	public Searches() 
	{
		setLayout(new BorderLayout());
		JDesktopPane jdp1 = new JDesktopPane();
		Dimension dim = getPreferredSize();
		dim.width = 500;
		jdp1.setPreferredSize(dim);
		add(jdp1,BorderLayout.LINE_START);
		jdp1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Search Box:"));
		
		l1 = new JLabel("Search Book's");
		l1.setBounds(200,30, 200, 30);
		l1.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l1);
		//----------------------------------------------------------------------------------------------------
		ImageIcon iconS = new ImageIcon("img/ar.png");
		l2 = new JLabel("Serial Number:");
		l2.setBounds(60,100,250,25);
		l2.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l2);
		tf1 = new JTextField();
		tf1.setBounds(200,100,150,25);
		tf1.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(tf1);
		btn1 = new JButton(iconS);
		btn1.setBounds(370,100,32,25);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(btn1);
		
		l3 = new JLabel("ISBN Number:");
		l3.setBounds(60,140,250,25);
		l3.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l3);
		tf2 = new JTextField();
		tf2.setBounds(200,140,150,25);
		tf2.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(tf2);
		btn2 = new JButton(iconS);
		btn2.setBounds(370,140,32,25);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(btn2);
		
		l4 = new JLabel("Select Subject:");
		l4.setBounds(60,180,250,25);
		l4.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l4);
		String [] cjcb2 = {"Android", "Data structure", "JAVA", "Web", "PHP", "Python", "hacking"};
		jcb2 = new JComboBox(cjcb2);
		jcb2.setBounds(200,180,150,25);
		jcb2.setEditable(false);
		jdp1.add(jcb2);
		btnc = new JButton(iconS);
		btnc.setBounds(370,180,32,25);
		btnc.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(btnc);
		//-------------------------------------------Search part end---------------------------------------------------
		
		l5 = new JLabel("Book Name : ");
		l5.setBounds(60,260,250,25);
		l5.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l5);
		l6 = new JTextField();
		l6.setBounds(220,260,150,25);
		l6.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l6);
		
		l7 = new JLabel("Author Name : ");
		l7.setBounds(60,300,250,25);
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l7);
		l8 = new JTextField();
		l8.setBounds(220,300,150,25);
		l8.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l8);
		
		l7 = new JLabel("ISBN of the book :");
		l7.setBounds(60,340,250,25);
		l7.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l7);
		l8c = new JTextField();
		l8c.setBounds(220,340,150,25);
		l8c.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l8c);
		
		l9 = new JLabel("Self Number : ");
		l9.setBounds(60,380,250,25);
		l9.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l9);
		l10 = new JTextField();
		l10.setBounds(220,380,150,25);
		l10.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l10);
		
		l12 = new JLabel("Publisher's : ");
		l12.setBounds(60,420,250,25);
		l12.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l12);
		l13 = new JTextField();
		l13.setBounds(220,420,150,25);
		l13.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp1.add(l13);
		
		ImageIcon iconM = new ImageIcon("img/clear.png");
		clear = new JButton(iconM);
		clear.setBounds(300,490,48,48);
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.setToolTipText("Clear");
		jdp1.add(clear);
		ImageIcon iconi = new ImageIcon("img/reload.png");
		refresh = new JButton(iconi);
		refresh.setBounds(390,490,48,48);
		refresh.setFont(new Font("Tahoma", Font.BOLD, 14));
		refresh.setToolTipText("Refresh");
		jdp1.add(refresh);
		
		//------------------------------------------------------------------------------------------------------------
		JDesktopPane jdp2 = new JDesktopPane();
		jdp2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Table:"));
		add(jdp2,BorderLayout.CENTER);
		jdp2.setLayout(new BorderLayout());
		
		try
		{
			con = (Connection) DriverManager.getConnection("jdbc:mysql://LocalHost:3306/lib","root","123");
		}
		catch(Exception ea)
		{
			JOptionPane.showMessageDialog(null, ea);
		}
		

			table1 = new JTable();
			JTableHeader header1 = table1.getTableHeader();
			jdp2.add(header1,BorderLayout.NORTH);
			table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			Dimension d1 = getPreferredSize();
			d1.width = 630;
			jdp2.setPreferredSize(d1);
            jdp2.add(new JScrollPane(table1),BorderLayout.CENTER);
            distable1();
            
            btn1.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent event)
    			{
    				try
    				{
    					String q = "select * From book_db where Serial_No ="+tf1.getText();;
    					PreparedStatement pst = (PreparedStatement) con.prepareStatement(q);
    					ResultSet rs = pst.executeQuery();
    					table1.setModel(DbUtils.resultSetToTableModel(rs));
    							
    				}
    				catch(Exception e)
    				{
    					javax.swing.JOptionPane.showMessageDialog(null, e);
    					
    				}
    			}
    		});
    		
    		btn2.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent event)
    			{
    				try
    				{
    					String q = "select * From book_db where ISBN_No ="+tf2.getText();;
    					PreparedStatement pst = (PreparedStatement) con.prepareStatement(q);
    					ResultSet rs = pst.executeQuery();
    					table1.setModel(DbUtils.resultSetToTableModel(rs));
    							
    				}
    				catch(Exception e)
    				{
    					javax.swing.JOptionPane.showMessageDialog(null, e);
    					
    				}
    			}
    		});
    		btnc.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent event)
    			{
    				try
    				{
    					String item = (String)jcb2.getSelectedItem();
    					String q = "select * From book_db where Book_Subject='"+item+"'";
    					PreparedStatement pst = (PreparedStatement) con.prepareStatement(q);
    					ResultSet rs = pst.executeQuery();
    					table1.setModel(DbUtils.resultSetToTableModel(rs));
    				}
    				catch(Exception e)
    				{
    					javax.swing.JOptionPane.showMessageDialog(null, e);
    				}
    				
    			}
    		});
		
    		refresh.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent event)
    			{
    				distable1();
    			}
    		});
    		clear.addActionListener(new ActionListener() 
    		{
    			public void actionPerformed(ActionEvent event)
    			{
    				tf1.setText("");
    				tf2.setText("");
    				l6.setText("");
    				l8.setText("");
    				l8c.setText("");
    				l10.setText("");
    				l13.setText("");
    				
    			}
    		});
    		
    		table1.addMouseListener(new java.awt.event.MouseAdapter() 
    		{
    			public void mouseClicked(java.awt.event.MouseEvent evt) 
    			{
    				table1MouseClicked(evt);
    			}
    		});
		
    }
	void distable1()
	{
		try
		{
			String q = "select * From book_db";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(q);
			ResultSet rs = pst.executeQuery();
			table1.setModel(DbUtils.resultSetToTableModel(rs));
					
		}
		catch(Exception e)
		{
			javax.swing.JOptionPane.showMessageDialog(null, e);
		}
		
	}
	
	
	private void table1MouseClicked(java.awt.event.MouseEvent evt) 
	{                                   
		
		int selectedRow = table1.getSelectedRow();
		l6.setText(table1.getValueAt(selectedRow, 2).toString());
		l8.setText(table1.getValueAt(selectedRow, 3).toString());
		l8c.setText(table1.getValueAt(selectedRow, 8).toString());
		l10.setText(table1.getValueAt(selectedRow, 10).toString());
		l13.setText(table1.getValueAt(selectedRow, 4).toString());
	} 
}