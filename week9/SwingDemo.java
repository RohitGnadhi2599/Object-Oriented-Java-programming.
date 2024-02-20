import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class SwingDemo{
    SwingDemo(){
        // create jframe container
        JFrame jfrm = new JFrame("Divider App");
        jfrm.setSize(275, 200);
        jfrm.setLayout(new FlowLayout());
        // to terminate on close
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
 
        // text label
        JLabel jlab = new JLabel("Enter the divider and dividend:");
 
        // add text field for both numbers
        JTextField ajtf = new JTextField(8);
        JTextField bjtf = new JTextField(8);
 
        // calc button
        JButton button = new JButton("Calculate");
 
        // labels
        JLabel err = new JLabel();
        JLabel alab = new JLabel();
        JLabel blab = new JLabel();
        JLabel anslab = new JLabel();
 
        // add in order :)
        jfrm.add(err);  // to display error message
        jfrm.add(jlab);
        jfrm.add(ajtf);
        jfrm.add(bjtf);
        jfrm.add(button);
        jfrm.add(alab);
        jfrm.add(blab);
        jfrm.add(anslab);
       
        ActionListener l = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                // No need to handle action event from text fields separately
                // because we handle it in the button's action listener
            }
        };
        ajtf.addActionListener(l);
        bjtf.addActionListener(l);
 
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try{
                    int a = Integer.parseInt(ajtf.getText());
                    int b = Integer.parseInt(bjtf.getText());
                    if (b == 0) {
                        throw new ArithmeticException();
                    }
                    int ans = a/b;
                   
                    alab.setText("A = " + a);
                    blab.setText("B = " + b);
                    anslab.setText("Ans = "+ ans);
                    err.setText(""); // Clear any previous error message
                }
                catch(NumberFormatException e){
                    clearLabels();
                    err.setText("Enter Only Integers!");
                }
                catch(ArithmeticException e){
                    clearLabels();
                    err.setText("B should be NON zero!");
                }
            }

            private void clearLabels() {
                alab.setText("");
                blab.setText("");
                anslab.setText("");
            }
        });
 
        // display frame
        jfrm.setVisible(true);
    }
 
    public static void main(String args[]){
        // create frame on event dispatching thread
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new SwingDemo();
            }
        });
    }
}
