import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicToggleButtonUI;

public class GuIEx03 extends JFrame{
	public GuIEx03() {
		setTitle("이벤트 리스너");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 닫을때 그냥 닫히라는 뜻
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("qjxms");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		setSize(200,300);
		setVisible(true);
		
	}

	
	public static void main(String[] args) {
		new GuIEx03();

	}

}

class MyActionListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton b =(JButton)e.getSource();
		if(b.getText().equals("Action"))
			b.setText("액션");
		else
			b.setText("Action");
	}
}