import javax.swing.JOptionPane;

public class hw {
    public static void main(String[] args) {
       
        String name = JOptionPane.showInputDialog("Enter your name:");

        int mark1 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark 1:"));
        int mark2 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark 2:"));
        int mark3 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark 3:"));
        int mark4 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark 4:"));
        int mark5 = Integer.parseInt(JOptionPane.showInputDialog("Enter mark 5:"));

        double average = (mark1 + mark2 + mark3 + mark4 + mark5) / 5.0;

        JOptionPane.showMessageDialog(null, "Name: " + name + "\nAverage Marks: " + average);
    }
}