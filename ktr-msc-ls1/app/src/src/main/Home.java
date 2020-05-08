package src.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel getPannels;
	private JTextField UsernameEntryTF;
	private JPasswordField passwordEntryField;
	private JTextField tfSignIn_Username;
	private JTextField tfSignIn_Password;
	private JTextField tfSignIn_Name;
	private JTextField tfSignIn_CName;
	private JTextField tfSignIn_Email;
	private JTextField tfSignIn_TelNumber;
	private JTextField tfProfile_Username;
	private JTextField tfProfile_Password;
	private JTextField tfProfile_Name;
	private JTextField tfProfile_Email;
	private JTextField tfProfile_TelNumber;
	private JTextField tfProfile_CName;
	private JPanel LogonPanel;
	private JPanel SigninPanel;
	private JPanel HomePanel;
	private JPanel ProfilePanel;
	private JPanel LibraryPanel;
	private BusinessCard[] businessCards;
	private User u;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 561, 390);
		getPannels = new JPanel();
		getPannels.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(getPannels);
		getPannels.setLayout(new CardLayout(0, 0));
		
		JPanel HomePanel = new JPanel();
		getPannels.add(HomePanel, "name_431777955257400");
		HomePanel.setLayout(null);
		HomePanel.setVisible(false);
		
		JPanel LogonPanel = new JPanel();
		getPannels.add(LogonPanel, "name_431751939935500");
		LogonPanel.setLayout(null);
		LogonPanel.setVisible(true);
		
		JPanel SigninPanel = new JPanel();
		getPannels.add(SigninPanel, "name_431765627666000");
		SigninPanel.setLayout(null);
		SigninPanel.setVisible(false);
		
		JPanel ProfilePanel = new JPanel();
		getPannels.add(ProfilePanel, "name_431791903974400");
		ProfilePanel.setLayout(null);
		ProfilePanel.setVisible(false);
		
		JPanel LibraryPanel = new JPanel();
		getPannels.add(LibraryPanel, "name_431802490615000");
		LibraryPanel.setLayout(null);
		
		JButton btnCreateBC_Library = new JButton("Create");
		btnCreateBC_Library.setBounds(59, 236, 121, 44);
		LibraryPanel.add(btnCreateBC_Library);
		
		JLabel lblNewLabel = new JLabel("Your Business Cards");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(40, 32, 360, 16);
		LibraryPanel.add(lblNewLabel);
		
		JLabel lblCreateANew = new JLabel("Create a new Business Card");
		lblCreateANew.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblCreateANew.setBounds(40, 176, 360, 16);
		LibraryPanel.add(lblCreateANew);
		LibraryPanel.setVisible(false);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setBounds(66, 48, 188, 16);
		LogonPanel.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.LEFT);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword.setBounds(66, 80, 188, 16);
		LogonPanel.add(lblPassword);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(UsernameEntryTF.getText()!=""&&passwordEntryField.getPassword()!=null) {
						u = new User(UsernameEntryTF.getText(),passwordEntryField.getPassword());
					}
					HomePanel.setVisible(true);
					LogonPanel.setVisible(false);
				}
				catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		btnConnect.setBounds(339, 57, 97, 39);
		LogonPanel.add(btnConnect);
		
		JButton btnSignIn = new JButton("Sign in");
		btnSignIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SigninPanel.setVisible(true);
				LogonPanel.setVisible(false);
			}
		});
		btnSignIn.setBounds(161, 142, 136, 52);
		LogonPanel.add(btnSignIn);
		
		UsernameEntryTF = new JTextField();
		UsernameEntryTF.setBounds(181, 48, 116, 22);
		LogonPanel.add(UsernameEntryTF);
		UsernameEntryTF.setColumns(10);
		
		passwordEntryField = new JPasswordField();
		passwordEntryField.setBounds(181, 77, 117, 22);
		LogonPanel.add(passwordEntryField);
		

		
		JLabel lblAccount = new JLabel("Account : ");
		lblAccount.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblAccount.setBounds(57, 24, 102, 20);
		SigninPanel.add(lblAccount);
		
		JLabel lblUsername_SignIn = new JLabel("Username : ");
		lblUsername_SignIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_SignIn.setBounds(64, 76, 136, 16);
		SigninPanel.add(lblUsername_SignIn);
		
		JLabel lblPassword_SignIn = new JLabel("Password :");
		lblPassword_SignIn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_SignIn.setBounds(64, 105, 136, 16);
		SigninPanel.add(lblPassword_SignIn);
		
		JLabel lblPersoInfo = new JLabel("Personnal informations :");
		lblPersoInfo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblPersoInfo.setBounds(57, 172, 380, 20);
		SigninPanel.add(lblPersoInfo);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName.setBounds(67, 205, 92, 16);
		SigninPanel.add(lblName);
		
		JLabel lblCompanyName = new JLabel("Company name :");
		lblCompanyName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCompanyName.setBounds(67, 231, 166, 22);
		SigninPanel.add(lblCompanyName);
		
		JLabel lblEmailAdress = new JLabel("Email adress :");
		lblEmailAdress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmailAdress.setBounds(67, 260, 180, 16);
		SigninPanel.add(lblEmailAdress);
		
		JLabel lblTelephoneNumber = new JLabel("Telephone number:");
		lblTelephoneNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelephoneNumber.setBounds(67, 289, 207, 22);
		SigninPanel.add(lblTelephoneNumber);
		
		JButton btnSignIn_SignIn = new JButton("Sign in");
		btnSignIn_SignIn.setBounds(423, 25, 97, 25);
		SigninPanel.add(btnSignIn_SignIn);
		
		JButton btnSignIn_Cancel = new JButton("Cancel");
		btnSignIn_Cancel.setBounds(423, 63, 97, 25);
		SigninPanel.add(btnSignIn_Cancel);
		
		tfSignIn_Username = new JTextField();
		tfSignIn_Username.setBounds(193, 76, 116, 22);
		SigninPanel.add(tfSignIn_Username);
		tfSignIn_Username.setColumns(10);
		
		tfSignIn_Password = new JTextField();
		tfSignIn_Password.setColumns(10);
		tfSignIn_Password.setBounds(193, 105, 116, 22);
		SigninPanel.add(tfSignIn_Password);
		
		tfSignIn_Name = new JTextField();
		tfSignIn_Name.setColumns(10);
		tfSignIn_Name.setBounds(243, 205, 116, 22);
		SigninPanel.add(tfSignIn_Name);
		
		tfSignIn_CName = new JTextField();
		tfSignIn_CName.setColumns(10);
		tfSignIn_CName.setBounds(243, 231, 116, 22);
		SigninPanel.add(tfSignIn_CName);
		
		tfSignIn_Email = new JTextField();
		tfSignIn_Email.setColumns(10);
		tfSignIn_Email.setBounds(243, 260, 116, 22);
		SigninPanel.add(tfSignIn_Email);
		
		tfSignIn_TelNumber = new JTextField();
		tfSignIn_TelNumber.setColumns(10);
		tfSignIn_TelNumber.setBounds(245, 289, 116, 22);
		SigninPanel.add(tfSignIn_TelNumber);
		
		
		
		JButton btnHome_Profile = new JButton("Profile");
		btnHome_Profile.setBounds(25, 57, 97, 25);
		HomePanel.add(btnHome_Profile);
		
		JButton btnHome_Library = new JButton("Library");
		btnHome_Library.setBounds(25, 116, 97, 25);
		HomePanel.add(btnHome_Library);
		
		JButton btnHome_Exchange = new JButton("Exchange");
		btnHome_Exchange.setBounds(25, 170, 97, 25);
		HomePanel.add(btnHome_Exchange);
		
		JLabel lblHome_Hello = new JLabel("Hello");
		lblHome_Hello.setFont(new Font("Tahoma", Font.ITALIC, 20));
		lblHome_Hello.setBounds(187, 120, 56, 16);
		HomePanel.add(lblHome_Hello);
		
		JLabel lblHome_Username = new JLabel(u.getUsername());
		lblHome_Username.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblHome_Username.setBounds(285, 120, 156, 16);
		HomePanel.add(lblHome_Username);
		

		
		JLabel lblAccount_Profile = new JLabel("Account : ");
		lblAccount_Profile.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblAccount_Profile.setBounds(30, 24, 102, 20);
		ProfilePanel.add(lblAccount_Profile);
		
		JLabel lblUsername_Profile = new JLabel("Username : ");
		lblUsername_Profile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername_Profile.setBounds(45, 60, 136, 16);
		ProfilePanel.add(lblUsername_Profile);
		
		JLabel lblPassword_Profile = new JLabel("Password :");
		lblPassword_Profile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPassword_Profile.setBounds(52, 88, 136, 16);
		ProfilePanel.add(lblPassword_Profile);
		
		JLabel lblPersoInfo_Profile = new JLabel("Personnal informations :");
		lblPersoInfo_Profile.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblPersoInfo_Profile.setBounds(30, 166, 380, 20);
		ProfilePanel.add(lblPersoInfo_Profile);
		
		JLabel lblName_Profile = new JLabel("Name :");
		lblName_Profile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblName_Profile.setBounds(37, 209, 92, 16);
		ProfilePanel.add(lblName_Profile);
		
		JLabel lblCompanyName_Profile = new JLabel("Company name :");
		lblCompanyName_Profile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCompanyName_Profile.setBounds(37, 236, 166, 22);
		ProfilePanel.add(lblCompanyName_Profile);
		
		JLabel lblEmailAdress_Profile = new JLabel("Email adress :");
		lblEmailAdress_Profile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmailAdress_Profile.setBounds(37, 269, 180, 16);
		ProfilePanel.add(lblEmailAdress_Profile);
		
		JLabel lblTelephoneNumber_Profile = new JLabel("Telephone number:");
		lblTelephoneNumber_Profile.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelephoneNumber_Profile.setBounds(37, 298, 207, 22);
		ProfilePanel.add(lblTelephoneNumber_Profile);
		
		JButton btnProfile_Modify = new JButton("Modify");
		btnProfile_Modify.setBounds(424, 13, 97, 25);
		ProfilePanel.add(btnProfile_Modify);
		
		JButton btnProfile_Cancel = new JButton("Cancel");
		btnProfile_Cancel.setBounds(424, 58, 97, 25);
		ProfilePanel.add(btnProfile_Cancel);
		
		tfProfile_Username = new JTextField();
		tfProfile_Username.setColumns(10);
		tfProfile_Username.setBounds(190, 59, 116, 22);
		ProfilePanel.add(tfProfile_Username);
		
		tfProfile_Password = new JTextField();
		tfProfile_Password.setColumns(10);
		tfProfile_Password.setBounds(192, 86, 116, 22);
		ProfilePanel.add(tfProfile_Password);
		
		tfProfile_Name = new JTextField();
		tfProfile_Name.setColumns(10);
		tfProfile_Name.setBounds(230, 205, 116, 22);
		ProfilePanel.add(tfProfile_Name);
		
		tfProfile_Email = new JTextField();
		tfProfile_Email.setColumns(10);
		tfProfile_Email.setBounds(230, 264, 116, 22);
		ProfilePanel.add(tfProfile_Email);
		
		tfProfile_TelNumber = new JTextField();
		tfProfile_TelNumber.setColumns(10);
		tfProfile_TelNumber.setBounds(230, 298, 116, 22);
		ProfilePanel.add(tfProfile_TelNumber);
		
		tfProfile_CName = new JTextField();
		tfProfile_CName.setColumns(10);
		tfProfile_CName.setBounds(230, 236, 116, 22);
		ProfilePanel.add(tfProfile_CName);
		
		JPanel BusinessCardPanel = new JPanel();
		getPannels.add(BusinessCardPanel, "name_436180118900000");
		BusinessCardPanel.setLayout(null);
		
		JLabel lblName_BusinessCard = new JLabel("Name :");
		lblName_BusinessCard.setBounds(82, 61, 65, 25);
		lblName_BusinessCard.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BusinessCardPanel.add(lblName_BusinessCard);
		
		JLabel lblCompanyName_BusinessCard = new JLabel("Company name :");
		lblCompanyName_BusinessCard.setBounds(82, 88, 152, 25);
		lblCompanyName_BusinessCard.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BusinessCardPanel.add(lblCompanyName_BusinessCard);
		
		JLabel lblEmailAdress_BusinessCard = new JLabel("Email adress :");
		lblEmailAdress_BusinessCard.setBounds(82, 114, 126, 25);
		lblEmailAdress_BusinessCard.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BusinessCardPanel.add(lblEmailAdress_BusinessCard);
		
		JLabel lblTelephoneNumber_BusinessCard = new JLabel("Telephone number:");
		lblTelephoneNumber_BusinessCard.setBounds(82, 141, 175, 25);
		lblTelephoneNumber_BusinessCard.setFont(new Font("Tahoma", Font.PLAIN, 20));
		BusinessCardPanel.add(lblTelephoneNumber_BusinessCard);
		

	}

}
