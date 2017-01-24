package library;
import package1.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.awt.FlowLayout;
class Lib extends JFrame
{
  Container cont;
  JFrame jfrm;
  JMenuBar menubar;
  JMenu file, book, acc;
  JMenuItem cre_acc, add_books, rev_book,close, search, re_acc, about;
  JTextField jtf;
  ImageIcon icon;
  JButton btn1, btn2, btn3, btn4, btn5,btn6,btn7;
  JToolBar jtb;
  JTabbedPane jtp;
  double x;
  double y;
  double result;
  int ch,sitem=1, aitem=2, ritem=3, aaitem=4,raitem=5;
	Lib()
	{
		jfrm = new JFrame();
		
		cont = getContentPane();
		BorderLayout blo =new BorderLayout();
        cont.setLayout(blo);
		
		icon = new ImageIcon("img/titleicon.png");
		this.setIconImage(icon.getImage());
		menubar = new JMenuBar();
		setJMenuBar(menubar);
		//-------------------------------------------
		file = new JMenu("   File");
		menubar.add(file);
		ImageIcon icona_us = new ImageIcon("img/a_us.png");
		about = new JMenuItem("   About Us",icona_us);
		file.add(about);
		about.setMnemonic(KeyEvent.VK_Q);
		about.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		about.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
					About_Us dialog = new About_Us();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
					dialog.setBounds(430,300,320,240);
					//dialog.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
					dialog.setTitle("About Us");
					dialog.setVisible(true);
					dialog.setResizable(false);
					dialog.setLayout(new FlowLayout());
					
				}
			});
		ImageIcon iconClose = new ImageIcon("img/close.png");
		close = new JMenuItem("   Close",iconClose);
		file.add(close);
		close.setMnemonic(KeyEvent.VK_F4);
		close.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		close.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
					System.exit(0);   
				}
			});
		//----------------------------------------------
		book = new JMenu("   Books");
		menubar.add(book);
		ImageIcon iconsearch = new ImageIcon("img/search.png");
		search = new JMenuItem("   Search",iconsearch);
		book.add(search);
		search.setMnemonic(KeyEvent.VK_F);
		search.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		search.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
				if(sitem==1)
				{
					jtp.addTab("Search", new Searches()); 
					sitem++;
				}
				else
				{
					javax.swing.JOptionPane.showMessageDialog(null, "already open \n Search Tab");

				}  
				}
			});
		ImageIcon icona_book = new ImageIcon("img/a_book.png");
		add_books = new JMenuItem("   Add books",icona_book);
		book.add(add_books);
		add_books.setMnemonic(KeyEvent.VK_E);
		add_books.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		add_books.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
					if(aitem==2)
					{
						jtp.addTab("Add Books", new AddBooks());
						aitem++;
					}
					else
					{
						javax.swing.JOptionPane.showMessageDialog(null, "already open \n Add Books Tab");

					}  
				}
			});
		ImageIcon iconr_book = new ImageIcon("img/r_book.png");
		rev_book = new JMenuItem("   Remove Books",iconr_book);
		book.add(rev_book);
		rev_book.setMnemonic(KeyEvent.VK_Y);
		rev_book.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
		rev_book.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
					if(ritem==3)
					{
						jtp.addTab("Remove Books", new RmoveBooks());
						ritem++;
					}
					else
					{
						javax.swing.JOptionPane.showMessageDialog(null, "already open \n Remove Books Tab");

					}   
				}
			});
		//-------------------------------------------
		acc = new JMenu("   Loan");
		menubar.add(acc);
		ImageIcon icona_acc = new ImageIcon("img/a_acc.png");
		cre_acc = new JMenuItem("   Borrow Book's",icona_acc);
		acc.add(cre_acc);
		cre_acc.setMnemonic(KeyEvent.VK_B);
		cre_acc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK));
		cre_acc.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
					if(aaitem==4)
					{
						jtp.addTab("Borrow Book's", new Borrow());
						aaitem++;
					}
					else
					{
						javax.swing.JOptionPane.showMessageDialog(null, "Borrow Book's Tab");

					}  
				}
			});
		ImageIcon iconr_acc = new ImageIcon("img/r_acc.png");
		re_acc = new JMenuItem("   Return Book's",iconr_acc);
		acc.add(re_acc);
		re_acc.setMnemonic(KeyEvent.VK_R);
		re_acc.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
		re_acc.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) {
					if(raitem==5)
					{
						jtp.addTab("Return Books", new ReturnBooks());
						raitem++;
					}
					else
					{
						javax.swing.JOptionPane.showMessageDialog(null, "already open \n ReturnBooks Tab");

					}   
				}
			});
	}
	
}
class Middle extends Lib
{
	Middle() 
	{}
	void Toolbar()
	{
		
		
		jtp = new JTabbedPane();
		this.add(jtp);
		//----------------
		jtb = new JToolBar();
		jtb.setRollover(true);
		jtb.addSeparator();
		jtb.setBorder(new EmptyBorder(1,1,1,1));
		cont.add(jtb,BorderLayout.NORTH);
		jtb.setBorder(BorderFactory.createEtchedBorder());
		jtb.setFloatable(false);
		
		ImageIcon iconsearchtool = new ImageIcon("img/searchs.png");
		btn1 = new JButton(iconsearchtool);
		btn1.setToolTipText("Search Books and Accounds");
		jtb.add(btn1);
		btn1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent event) 
			{
				if(sitem==1)
				{
					jtp.addTab("Search", new Searches()); 
					sitem++;
				}
				else
				{
					javax.swing.JOptionPane.showMessageDialog(null, "already open \n Search Tab");

				}
			}
			});
		ImageIcon icona_booktool = new ImageIcon("img/a_books.png");
		btn2 = new JButton(icona_booktool);
		btn2.setToolTipText("Add Books");
		jtb.add(btn2);
		btn2.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent event) 
		{
					if(aitem==2)
					{
						jtp.addTab("Add Books", new AddBooks());
						aitem++;
					}
					else
					{
						javax.swing.JOptionPane.showMessageDialog(null, "already open \n Add Books Tab");

					}
				}
		});
		ImageIcon iconr_booktool = new ImageIcon("img/r_books.png");
		btn3 = new JButton(iconr_booktool);
		btn3.setToolTipText("Remove Books");
		jtb.add(btn3);
		btn3.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent event) 
		{
					if(ritem==3)
					{
						jtp.addTab("Remove Books", new RmoveBooks());
						ritem++;
					}
					else
					{
						javax.swing.JOptionPane.showMessageDialog(null, "already open \n Remove Books Tab");

					}
				}
		});
		ImageIcon icona_acctool = new ImageIcon("img/a_accs.png");
		btn4 = new JButton(icona_acctool);
		btn4.setToolTipText("Borrow Book's");
		jtb.add(btn4);
		btn4.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent event) 
		{
					if(aaitem==4)
					{
						jtp.addTab("Borrow Book's", new Borrow());
						aaitem++;
					}
					else
					{
						javax.swing.JOptionPane.showMessageDialog(null, "Borrow Book's Tab");

					}
					
				}
		});
		ImageIcon iconr_acctool = new ImageIcon("img/r_accs.png");
		btn5 = new JButton(iconr_acctool);
		btn5.setToolTipText("Return Books");
		jtb.add(btn5);
		btn5.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent event) 
		{
					if(raitem==5)
					{
						jtp.addTab("Return Books", new ReturnBooks());
						raitem++;
					}
					else
					{
						javax.swing.JOptionPane.showMessageDialog(null, "already open \n ReturnBooks Tab");

					}
					
				}
		});
		ImageIcon icona = new ImageIcon("img/a_uss.png");
		btn6 = new JButton(icona);
		btn6.setToolTipText("About Us");
		jtb.add(btn6);
		btn6.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent event) 
		{
				    About_Us dialog = new About_Us();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				
					dialog.setBounds(430,300,320,240);
					dialog.setTitle("About Us");
					dialog.setVisible(true);
					dialog.setResizable(false);
					dialog.setLayout(new FlowLayout());
					
		}
		});
	}
	
}
class Library
{
  public static void main(String[] args)
  {
    Middle ob = new Middle();
	ob.Toolbar();
    ob.setTitle("Library Management");
    ob.setVisible(true);
    ob.setSize(1130, 750);
	ob.setLocationRelativeTo(null);
    ob.setResizable(true);
    ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}