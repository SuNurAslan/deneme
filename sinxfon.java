
package yeniuygula;

import java.awt.Graphics;
import java.applet.*;
import java.awt.*;
import javax.swing.*;

public class sinxfon extends Applet {
     int x,y;
    public void init(){
    this.setSize(850,600);
        
}
    public void paint (Graphics g ){
        double ydegeri1;
        double ydegeri2;
        for(double x =0;x<=50.5;x+=0.1){
            ydegeri1=Math.sin(x);
            ydegeri2=Math.sin(x+1);
            g.drawLine(10+(int)(20*x), 100-(int)(20*ydegeri1),10+(int)(20*(x+1)) , 100-(int)(20*ydegeri2));
        }
    }
    
}


