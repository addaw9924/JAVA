import javax.swing.*;
import java.awt.*;

public class GuIEx02 extends JFrame {
	public GuIEx02() {
		setTitle("flowlayout ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();
		
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
		contentPane.add(new JButton("add"));
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuIEx02 mf = new GuIEx02();
	}

}
