package view;

import javax.swing.JPanel;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Principal extends JPanel {
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Create the panel.
	 */
	public Principal() {
		setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ava\u00ED Futebol Clube", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBackground(new Color(0, 0, 255));
		add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00C1rea do S\u00F3cio");
		lblNewLabel.setBounds(191, 74, 258, 22);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(230, 230, 250));
		lblNewLabel.setBackground(new Color(0, 0, 255));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Login do S\u00F3cio");
		lblNewLabel_2.setForeground(SystemColor.inactiveCaption);
		lblNewLabel_2.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		lblNewLabel_2.setBounds(230, 107, 105, 30);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(230, 141, 174, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(SystemColor.inactiveCaption);
		lblSenha.setFont(new Font("Bahnschrift", Font.BOLD, 13));
		lblSenha.setBounds(230, 172, 105, 30);
		panel.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(230, 205, 174, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setBounds(264, 236, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Leo\\workspace\\senac-dd-2021-LeonardoSimone\\logo-avai-topo.png"));
		lblNewLabel_1.setBounds(0, 85, 230, 162);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("esqueci a senha");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Bahnschrift", Font.BOLD, 10));
		lblNewLabel_3.setBounds(264, 270, 104, 14);
		panel.add(lblNewLabel_3);

	}
}
