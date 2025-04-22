
package javaapplication1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;



public class hareketliKareOyunu extends JFrame {
    int genislik =800;
    int yukseklik=600;
    int kare_boyutu=50;
    int puan =0;
    
    JLabel puanLabel;
    JPanel oyunPaneli;
    Random rastgele;
    
    int kareX;
    int kareY;
    
    public hareketliKareOyunu(){
        rastgele=new Random();
        puanLabel = new JLabel("Puan:0");
        puanLabel.setFont(new Font("Arial",Font.BOLD,20));
        
        oyunPaneli=new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.fillRect(kareX, kareY, kare_boyutu, kare_boyutu);
                
            }
        };
        oyunPaneli.setPreferredSize(new Dimension(genislik,yukseklik));
        oyunPaneli.setBackground(Color.WHITE);
        int hedefPuan=5;
        oyunPaneli.addMouseListener(new MouseAdapter() {
            @Override
                    public void mouseClicked(MouseEvent e){
                        int fareX =e.getX();
                        int fareY =e.getY();
                        
                        
                        if(fareX >= kareX && fareX<=kareX+kare_boyutu&&
                                fareY>=kareY&& fareY<=kareY+kare_boyutu){
                            puan++;
                            puanLabel.setText("Puan: "+puan);
                            hareketEttir();
                            
                            if(puan>=hedefPuan){
                                JOptionPane.showMessageDialog(null, "Tebrikler hedef puanı aştınız: "+puan);
                                System.exit(0);
                            }
                            
                           
                        }
                    }
            
            
});
        Timer zamanlayici = new Timer (1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hareketEttir();
               
            }
        });
        
        zamanlayici.start();
        
        setLayout(new BorderLayout());
        add(puanLabel,BorderLayout.NORTH);
        add(oyunPaneli,BorderLayout.CENTER);
        
        setTitle("Hareketli Kare Oyunu");
        setSize(genislik,yukseklik);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
   
    void hareketEttir(){
        kareX =rastgele.nextInt(genislik-kare_boyutu);
        kareY = rastgele.nextInt(yukseklik-kare_boyutu);
        oyunPaneli.repaint();
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new hareketliKareOyunu();
            }
        });
        
    }
    
}
