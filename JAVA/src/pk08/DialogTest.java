package pk08;

import javax.swing.JOptionPane;

public class DialogTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject;
		int jumsu;
		
		subject= JOptionPane.showInputDialog("과목명");
		jumsu=Integer.parseInt(JOptionPane.showInputDialog("점수"));
		
		System.out.println("과목명: "+subject);
		System.out.println("점수: "+jumsu);
		
		String subject2;
		int jumsu2;
		subject2=JOptionPane.showInputDialog("과목명");
		jumsu=Integer.parseInt(JOptionPane.showInputDialog("점수"));
		
		JOptionPane.showMessageDialog(null,"과목명: "+subject);
		JOptionPane.showMessageDialog(null,"점수"+jumsu);
		
		
	}

}
