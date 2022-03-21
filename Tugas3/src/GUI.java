import javax.swing.*;
import java.awt.event.*;


public class GUI extends JFrame {

    JLabel lTitle = new JLabel("Cubic Calculator" , SwingConstants.CENTER);
    JLabel lLength = new JLabel("Length : ");
    JLabel lWide = new JLabel("Wide : ");
    JLabel lHeight = new JLabel("Height : ");
    JLabel lResult = new JLabel("");

    JTextField tfLength = new JTextField();
    JTextField tfWide = new JTextField();
    JTextField tfHeight = new JTextField();

    JButton btnCalculate = new JButton("Calculate");

    public GUI(){
        setTitle("Cubic Calculator");
        setSize(400 , 400);
        setLayout(null);

        add(lTitle);
        add(lLength);
        add(lWide);
        add(lHeight);
        add(lResult);

        add(tfLength);
        add(tfWide);
        add(tfHeight);

        add(btnCalculate);

        lTitle.setBounds(100 , 10 , 200 , 20 );

        lLength.setBounds(20 , 60 , 100 , 20);
        tfLength.setBounds(130 , 60 ,100 , 20);

        lWide.setBounds(20 , 110 , 100 , 20);
        tfWide.setBounds(130 , 110 , 100 , 20);

        lHeight.setBounds(20 , 160 , 100 , 20);
        tfHeight.setBounds(130 , 160 , 100 ,20);

        btnCalculate.setBounds(150 , 220 , 90 , 20);

        lResult.setBounds(20 , 240 , 200 , 60);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double length = Double.parseDouble(tfLength.getText());
                    double wide = Double.parseDouble(tfWide.getText());
                    double height = Double.parseDouble(tfHeight.getText());

                    Ruang take = new Ruang(length, wide, height);
                    String rCircumference = Double.toString(take.circumference());
                    String rArea = Double.toString(take.area());
                    String rVol = Double.toString(take.volume());
                    String rSurface = Double.toString(take.surfacearea());

                    lResult.setText("<html>Square Circumference : " + rCircumference + "<br/>Square Area : " + rArea + "<br/>Cuboid Volume : " + rVol
                            + "<br/>Cuboid Surface Area:  " + rSurface + "</html>");
                }
                catch (IllegalArgumentException e1){
                    JOptionPane.showMessageDialog(null,"Check again your input make sure it number");
                }
            }
        });

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
