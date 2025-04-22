
package javaapplication1;

import java.awt.*;
import javax.swing.*;


public class icice10cember extends JPanel {
   @Override
   public void paintComponent (Graphics g1){
       super.paintComponent(g1);
       
       int merkez1 = getWidth()/2;
       int merkez2 = getHeight()/2;
       
       int cembersayisi=10;
       
       int maxcap = Math.min(getWidth(), getHeight()-40);
       
       for (int i = 0; i < cembersayisi; i++) {
           int cap =maxcap -(i*(maxcap/cembersayisi));
           int x = merkez1-merkez1/2;
           int y = merkez2-merkez2/2;
           g1.drawOval(x, y, cap, cap);
       }
       
   }
   
   public static void creatAndShowGUI(){
       JFrame frame1 = new JFrame ("İÇ İÇE ÇEMBERLER");
       frame1.setSize(800,600);
       frame1.add(new icice10cember());
       frame1.setVisible(true);
   }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
                @Override
                public void run (){
                    creatAndShowGUI();
                }
                });
    }
       
}          
               
               
               
               
               
               
               
 