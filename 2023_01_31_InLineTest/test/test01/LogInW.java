package test01;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class LogInW {
	private JFrame frame;
	private JPanel p1, p2;
	private JLabel lb, plb;
	private JTextField tf;
	private JPasswordField ptf;
	private JButton btn[];
	
	public LogInW() {
		frame = new JFrame("로그인");
		p1 = new JPanel();
		p2 = new JPanel();
		lb = new JLabel("ID", Label.RIGHT);
		plb = new JLabel("PW", Label.RIGHT);
		tf = new JTextField(20);
		ptf = new JPasswordField(20);
		btn = new JButton[2];
	}
	
	private Component userId() {
		p1.setSize(400, 70);
		p1.setLocation(0,0);
		p1.setLayout(null);
		
		lb.setFont(new Font("", Font.BOLD, 18));
		lb.setBounds(70, 20, 40, 30);
		tf.setBounds(110, 23, 200, 30);
		
		p1.add(lb);
		p1.add(tf);
		
		return p1;
	}
	
	private Component userPassword() {
		p2.setSize(400, 70);
		p2.setLocation(0, 70);
		p2.setLayout(null);
		
		plb.setFont(new Font("", Font.BOLD, 18));
		plb.setBounds(60, 10, 40, 30);
		ptf.setBounds(110, 13, 200, 30);
		
		p2.add(plb);
		p2.add(ptf);
		
		return p2;
	}
	
	private void setButtonAct() {
		btn[0] = new JButton("로그인");
		btn[1] = new JButton("취소");

		btn[0].setBounds(110, 140, 90, 30);
		btn[1].setBounds(220, 140, 90, 30);
		
		// 로그인
		btn[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CheckMember log = new CheckMember();
				
				String userId = tf.getText().trim();
				char pass[] = ptf.getPassword();
				String userPassword = String.valueOf(pass);
				
				if (userId.isEmpty() || userPassword.isEmpty()) {
					JOptionPane.showMessageDialog(null, "아이디 혹은 비밀번호를 입력하세요", "알림", 
							JOptionPane.WARNING_MESSAGE);
				} else if (log.in(userId, userPassword) <= 0){
					JOptionPane.showMessageDialog(null, "아이디 혹은 비밀번호가 잘못됐습니다", "로그인 확인", 
							JOptionPane.WARNING_MESSAGE);
				} else if (log.in(userId, userPassword) > 0) {
					JOptionPane.showMessageDialog(null, "로그인 성공!", "로그인 확인", 
							JOptionPane.INFORMATION_MESSAGE);
					
					frame.dispose();
				}
			}
		});
		
		// 취소
		btn[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		for (int i=0; i<btn.length; i++) {
			frame.add(btn[i]);
			btn[i].setBackground(new Color(000, 102, 255));
			btn[i].setForeground(Color.white);
		}
	}
	
	public void setFrame() {
		frame.setSize(400, 250);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		frame.add(userId());
		frame.add(userPassword());
		setButtonAct();
		
		frame.setVisible(true);
	}
}
