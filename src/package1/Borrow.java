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
public class Borrow extends JPanel
{
	JLabel l48, l49, l50, l51, l53,  l55, l57, l59, l61, l62, l63, l64, l65;
	JTextField tf36, tf37, tf38, tf39, l52,tf40, tf41,l54,l56, l58,l60;
	JButton btn15, clear, refresh;
	Connection con  = null;
	Statement st =  null;
	JTable table4,table;
	String id;
	JDesktopPane jdp9,jdpissue;
	public Borrow() 
	{
		setLayout(new BorderLayout());
		//--------------------------------------------------------------------
		jdp9 = new JDesktopPane();
		Dimension dim = getPreferredSize();
		dim.width = 500;
		jdp9.setPreferredSize(dim);
		add(jdp9,BorderLayout.LINE_START);
		jdp9.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Borrow Book's:"));
	
		//----------------------------------------------------------------------------------------------------
		l48 = new JLabel("BORROW BOOK'S");
		l48.setBounds(140,8,200,50);
		l48.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l48);
		
		l49 = new JLabel("Student ID :");
		l49.setBounds(50,80,250,25);
		l49.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l49);
		tf36 = new JTextField();
		tf36.setBounds(300,80,150,25);
		tf36.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(tf36);
		
		l50 = new JLabel("Book Serial No. :");
		l50.setBounds(50,110,250,25);
		l50.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l50);
		tf37 = new JTextField();
		tf37.setBounds(300,110,150,25);
		tf37.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(tf37);
 
		ImageIcon iconBorrow = new ImageIcon("img/Borrow.png");
		btn15 = new JButton(iconBorrow);
		btn15.setBounds(390,150,48,48);
		btn15.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn15.setToolTipText("Borrow Book's");
		jdp9.add(btn15);
		
		//------------------------------------
		l51 = new JLabel("Student Id : ");
		l51.setBounds(60,260,250,25);
		l51.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l51);
		l52 = new JTextField();
		l52.setBounds(220,260,150,25);
		l52.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l52);
		
		l53 = new JLabel("Book's issued : ");
		l53.setBounds(60,300,250,25);
		l53.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l53);
		l54 = new JTextField();
		l54.setBounds(220,300,150,25);
		l54.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l54);
		
		l55 = new JLabel("Book Name : ");
		l55.setBounds(60,340,250,25);
		l55.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l55);
		l56 = new JTextField();
		l56.setBounds(220,340,150,25);
		l56.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l56);
		
		l57 = new JLabel("ISBN No. : ");
		l57.setBounds(60,380,250,25);
		l57.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l57);
		l58 = new JTextField();
		l58.setBounds(220,380,150,25);
		l58.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l58);
		
		l59 = new JLabel("Publisher's : ");
		l59.setBounds(60,420,250,25);
		l59.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l59);
		l60 = new JTextField();
		l60.setBounds(220,420,150,25);
		l60.setFont(new Font("Tahoma", Font.BOLD, 14));
		jdp9.add(l60);
		
		ImageIcon iconM = new ImageIcon("img/clear.png");
		clear = new JButton(iconM);
		clear.setBounds(300,490,48,48);
		clear.setFont(new Font("Tahoma", Font.BOLD, 14));
		clear.setToolTipText("Clear");
		jdp9.add(clear);
		ImageIcon iconi = new ImageIcon("img/reload.png");
		refresh = new JButton(iconi);
		refresh.setBounds(390,490,48,48);
		refresh.setFont(new Font("Tahoma", Font.BOLD, 14));
		refresh.setToolTipText("Refresh");
		jdp9.add(refresh);
		
		try
		{
			con = (Connection) DriverManager.getConnection("jdbc:mysql://LocalHost:3306/lib","root","123");
		}
		catch(Exception ea)
		{
			JOptionPane.showMessageDialog(null, ea);
		}
		//------------------------------------------------------------------------------------------------------------
		JDesktopPane jdp90 = new JDesktopPane();
		jdp90.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Table:"));
		add(jdp90,BorderLayout.CENTER);
		jdp90.setLayout(new BorderLayout());
		
		
			table4 = new JTable();
			JTableHeader header41 = table4.getTableHeader();
			jdp90.add(header41,BorderLayout.NORTH);
			table4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			Dimension d8 = getPreferredSize();
			d8.width = 630;
			jdp90.setPreferredSize(d8);
            jdp90.add(new JScrollPane(table4),BorderLayout.PAGE_START);
            distable4();
 //-------------------------------------------------------------------

            jdpissue = new JDesktopPane();
    		jdp90.add(jdpissue,BorderLayout.PAGE_END);
    		Dimension d3 = getPreferredSize();
    		d3.height = 20;
    		jdpissue.setPreferredSize(d3);
    		jdpissue.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Issue Book Details"));
    		
    		table = new JTable();
    		JTableHeader header4 = table.getTableHeader();
    		jdpissue.add(header4,BorderLayout.NORTH);
    		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    		//Dimension d31 = getPreferredSize();
    		//d31.height = 630;
    		//jdpissue.setPreferredSize(d31);
    		jdpissue.add(new JScrollPane(table),BorderLayout.CENTER);
            distable();
            
 //-------------------------------------------------------           
            
            
            btn15.addActionListener(new ActionListener() 
    		{
    		public void actionPerformed(ActionEvent event) 
    		{
    			try
    			{
    				st = (Statement) con.createStatement();
    				st.executeUpdate("insert into sacc(Student_ID,Serial_No) values('"+tf36.getText()+"','"+tf37.getText()+"')");
    				tf36.setText("");
        			tf37.setText("");
        		
    				javax.swing.JOptionPane.showMessageDialog(null, "Book issued");
    				issuedbooktable();
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
    			distable4();
    		}
    		});
            
            clear.addActionListener(new ActionListener() 
    		{
    		public void actionPerformed(ActionEvent event) 
    		{
    			tf36.setText("");
    			tf37.setText("");
    			l52.setText("");
    			l54.setText("");
    			l56.setText("");
    			l58.setText("");
    			l60.setText("");
    		}
    		});
		
		
	}
	void distable4()
	{
		try
		{
			String q = "select * From book_db";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(q);
			ResultSet rs = pst.executeQuery();
			table4.setModel(DbUtils.resultSetToTableModel(rs));
					
		}
		catch(Exception e)
		{
			javax.swing.JOptionPane.showMessageDialog(null, e);
		}
		
	}
	void distable()
	{
		try
		{
			String q = "select * From issued_books_details";
			PreparedStatement pst = (PreparedStatement)con.prepareStatement(q);
			ResultSet rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
					
		}
		catch(Exception e)
		{
			javax.swing.JOptionPane.showMessageDialog(null, e);
		}
		
	}
	//----------------------------------====-----------------
	void issuedbooktable()
	{
		try
		{
			String q = "select * From sacc";
			PreparedStatement pst = (PreparedStatement) con.prepareStatement(q);
			ResultSet rs = pst.executeQuery();
			table4.setModel(DbUtils.resultSetToTableModel(rs));
					
		}
		catch(Exception e)
		{
			javax.swing.JOptionPane.showMessageDialog(null, e);
		}
	}
}