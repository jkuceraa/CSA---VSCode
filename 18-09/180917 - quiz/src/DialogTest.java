import javax.swing.JOptionPane;
/*
DialogTest.java
*/

public class DialogTest
{
    public static void main(String[] args) {
String input1;
String message1 = "Write first value"; 
input1 = JOptionPane.showInputDialog(message1);

int input2;
String message2 = "Number"; 
input2 = Integer.parseInt(JOptionPane.showInputDialog(message2));

double input3;
String message3 = "Number double"; 
input3 = Double.parseDouble(JOptionPane.showInputDialog(message3));

JOptionPane.showMessageDialog(null, input1);
JOptionPane.showMessageDialog(null, input2/input3);
    }
}