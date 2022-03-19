package lab9p2_bryanespinal_pamelarramirez;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;


public class Reloj implements Runnable {

    private JLabel hora;
    private JLabel adver;
    
    public Reloj(JLabel hora,JLabel adver) {
        this.hora = hora;
        this.adver=adver;
    }        

    @Override
    public void run() {
            String s="";
            int min=0,sec=0;
            boolean pass=true;
            while (pass) {
                System.out.println("hola");
                for (int i = 0; i < 61; i++) {
                    s=""+min+": "+sec;
                    hora.setText(s);
                    sec=i;
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if (sec==10&&min>=1) {
                        adver.setText("");
                    }
                    if (sec==60) {
                        sec=0;
                        min+=1;
                        adver.setText("ya pasaron "+min+" Minutos Desde que empezaste el examen");
                    }
                }
            }     
    }
}