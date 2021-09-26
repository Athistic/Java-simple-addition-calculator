
package gui7;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Gui7 {
    
JFrame myFrame=new JFrame("Calculator");

JPanel top=new JPanel(new FlowLayout());
JPanel middle=new JPanel(new GridLayout(3,2,30,100));
JPanel bottom=new JPanel(new GridLayout(1,3,2,5));

JLabel lblTitle=new JLabel("Simple addition calculator");

JLabel lblNum1=new JLabel("PLease enter first number",JLabel.RIGHT);
JLabel lblNum2=new JLabel("Please enter second number",JLabel.RIGHT);
JLabel lblSum=new JLabel("The sum is:",JLabel.RIGHT);

JTextField txtNum1=new JTextField(10);
JTextField txtNum2=new JTextField(10);
JTextField txtSum=new JTextField(10);

JButton btnCalculate=new JButton("Calculate");
JButton btnClear=new JButton("Clear");
JButton btnExit=new JButton("Exit");

public void showGui(){
myFrame.add(top);
myFrame.add(middle);
myFrame.add(bottom);
    
top.add(lblTitle);

middle.add(lblNum1);
middle.add(txtNum1);
middle.add(lblNum2);
middle.add(txtNum2);
middle.add(lblSum);
middle.add(txtSum);

bottom.add(btnCalculate);
bottom.add(btnClear);
bottom.add(btnExit);

myFrame.add(top,BorderLayout.NORTH);
myFrame.add(middle,BorderLayout.CENTER);
myFrame.add(bottom,BorderLayout.SOUTH);
myFrame.setSize(500,600);
myFrame.setLocation(800,80);
myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
myFrame.setVisible(true);

btnCalculate.addActionListener(new btnCalculate());
btnCalculate.setToolTipText("Calculates the sum of two numbers");

btnClear.addActionListener(new btnClear());
btnClear.setToolTipText("Clears the first number, second number as well as the sum of both numbers");

btnExit.addActionListener(new btnExit());
btnExit.setToolTipText("Exits the application");
txtSum.setEditable(false);
}
private class btnCalculate implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int num1;
            int num2;
            int sum;
            
            num1=Integer.parseInt(txtNum1.getText());
            num2=Integer.parseInt(txtNum2.getText());
            sum=num1+num2;
            txtSum.setText(sum+"");
            
        }

    }

private class btnClear implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            txtNum1.setText(null);
            txtNum2.setText(null);
            txtSum.setText(null);
            
        }

}

private class btnExit implements ActionListener{
@Override
public void actionPerformed(ActionEvent e){
    int x=JOptionPane.showConfirmDialog(null,"Do you want to close you application?","EXIT..",JOptionPane.OK_CANCEL_OPTION);
if(x==JOptionPane.OK_OPTION){
System.exit(0);
}
}
}

        public static void main(String[] args) {
        Gui7 obj=new Gui7();
        obj.showGui();
    }
    
}
