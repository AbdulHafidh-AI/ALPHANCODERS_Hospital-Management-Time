package Projek.MAIN;

import Projek.GUI.RegAcc;

import javax.swing.*;


public class RegPekerjaHospital
{
    public static void runGUI(){
    JFrame frame = new JFrame("REGISTRATION");
    frame.setContentPane(new RegAcc().getPanel());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}

    public static void main(String[] args) throws Exception{
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runGUI();
            }
        });
    }
}
