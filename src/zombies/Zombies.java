/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombies;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Melvin Mathew
 */
public class Zombies extends javax.swing.JFrame {

    int b = 1, sc = 1, c = 0, bullet = 5, d = 0, l = 10, n = 3, temp, b1 = 5, b2 = 5, b3 = 5;
    boolean click = false;
    boolean click1 = false;
    AudioStream BGMGlobal;

    /**
     * Creates new form NewJFrame9
     */
    public Zombies() {
        initComponents();
        setIcon();
    }

    public int randomNumberbetweenOneAndFive() {
        return 1 + (int) (Math.random() * 5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        g = new javax.swing.JLabel();
        bullets = new javax.swing.JLabel();
        bullets1 = new javax.swing.JLabel();
        bullets4 = new javax.swing.JLabel();
        bullets2 = new javax.swing.JLabel();
        bullets3 = new javax.swing.JLabel();
        spark = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        score2 = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        life = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(773, 578));
        setResizable(false);
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        getContentPane().setLayout(null);

        g.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zombies/gun.png"))); // NOI18N
        getContentPane().add(g);
        g.setBounds(420, 370, 290, 180);

        bullets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zombies/b1.png"))); // NOI18N
        getContentPane().add(bullets);
        bullets.setBounds(-20, 0, 35, 56);

        bullets1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zombies/b1.png"))); // NOI18N
        getContentPane().add(bullets1);
        bullets1.setBounds(0, 0, 40, 56);

        bullets4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zombies/b1.png"))); // NOI18N
        getContentPane().add(bullets4);
        bullets4.setBounds(60, 0, 40, 56);

        bullets2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zombies/b1.png"))); // NOI18N
        getContentPane().add(bullets2);
        bullets2.setBounds(20, 0, 40, 56);

        bullets3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zombies/b1.png"))); // NOI18N
        getContentPane().add(bullets3);
        bullets3.setBounds(40, 0, 40, 56);

        spark.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zombies/spark.png"))); // NOI18N
        getContentPane().add(spark);
        spark.setBounds(460, 310, 110, 130);
        getContentPane().add(t1);
        t1.setBounds(-20, 230, 190, 310);
        getContentPane().add(t2);
        t2.setBounds(300, 230, 190, 310);
        getContentPane().add(t3);
        t3.setBounds(450, 230, 190, 310);
        getContentPane().add(t4);
        t4.setBounds(610, 230, 190, 310);
        getContentPane().add(t5);
        t5.setBounds(140, 230, 190, 310);

        score2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        score2.setForeground(new java.awt.Color(255, 255, 255));
        score2.setText("0");
        getContentPane().add(score2);
        score2.setBounds(210, 10, 40, 30);

        s1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zombies/Grave.png"))); // NOI18N
        getContentPane().add(s1);
        s1.setBounds(170, 0, 40, 50);

        life.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        life.setForeground(new java.awt.Color(255, 255, 255));
        life.setText("10");
        getContentPane().add(life);
        life.setBounds(140, 10, 30, 30);

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zombies/heart.png"))); // NOI18N
        l1.setText("LIFE");
        getContentPane().add(l1);
        l1.setBounds(100, 10, 40, 30);

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/zombies/on-a-scary-scary-night-1600x1200.jpg"))); // NOI18N
        getContentPane().add(bg);
        bg.setBounds(0, 0, 770, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int a = evt.getX();
        int b = g.getY();
        int c = spark.getY();
        if (a < 600) {
            g.setLocation(a, b);
            spark.setLocation(a += 10, c);
        }
        spark.setVisible(false);


    }//GEN-LAST:event_formMouseDragged

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        int a = evt.getX();
        int b = g.getY();
        int c = spark.getY();
        if (a < 600) {
            g.setLocation(a, b);
            spark.setLocation(a += 10, c);
        }
        spark.setVisible(false);

    }//GEN-LAST:event_formMouseMoved

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
        Image image = toolkit.getImage(getClass().getResource("aim1.png"));
        Cursor a = toolkit.createCustomCursor(image, new Point(this.getX(), this.getY()), "");
        this.setCursor(a);
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        int a = evt.getX();
        int b = evt.getY();
        switch (bullet) {
            case 0:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(true);
                bullets4.setVisible(true);
                spark.setVisible(false);
                bullet = 5;
                d = 1;
                sound("reload");

                break;
            case 1:
                spark.setVisible(true);
                bullets.setVisible(false);
                bullets1.setVisible(false);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");

                break;
            case 2:
                bullets.setVisible(true);
                bullets1.setVisible(false);
                spark.setVisible(true);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");

                break;
            case 3:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                spark.setVisible(true);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");

                break;
            case 4:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                spark.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");
                break;
            case 5:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                spark.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(true);
                bullets4.setVisible(false);
                bullet--;
                d = 0;
                sound("gunshot");
                break;

            default:
                break;
        }
        if (d != 1) {
            switch (c) {
                case 1:
                    if (a >= 75 && a <= 95 && b >= 260 && b <= 285) {
                        score2.setText(sc++ + "");
                        t2.setVisible(true);
                        t3.setVisible(true);
                        t4.setVisible(true);
                        t5.setVisible(true);
                        click = true;
                        t1.setVisible(false);
                    } else {
                        click = false;

                    }
                    break;
                case 2:
                    if (a >= 390 && a <= 420 && b >= 260 && b <= 285) {
                        t5.setVisible(true);
                        t3.setVisible(true);
                        t4.setVisible(true);
                        click = true;
                        t1.setVisible(true);
                        t2.setVisible(false);
                        score2.setText(sc++ + "");
                    } else {
                        click = false;

                    }
                    break;
                case 4:
                    if (a >= 230 && a <= 260 && b >= 260 && b <= 285) {
                        t5.setVisible(false);
                        t3.setVisible(true);
                        t4.setVisible(true);
                        t1.setVisible(true);
                        click = true;
                        t2.setVisible(true);
                        score2.setText(sc++ + "");
                    } else {
                        click = false;

                    }
                    break;
                case 5:
                    if (a >= 540 && a <= 570 && b >= 260 && b <= 285) {
                        t5.setVisible(true);
                        t2.setVisible(true);
                        t4.setVisible(true);
                        t1.setVisible(true);
                        t3.setVisible(false);
                        click = true;
                        score2.setText(sc++ + "");
                    } else {

                        click = false;
                    }
                    break;
                case 3:
                    if (a >= 700 && a <= 730 && b >= 260 && b <= 285) {
                        t5.setVisible(true);
                        t3.setVisible(true);
                        t4.setVisible(false);
                        t1.setVisible(true);
                        click = true;
                        t2.setVisible(true);
                        score2.setText(sc++ + "");
                    } else {

                        click = false;
                    }
                    break;
                default:
                    break;
            }
        }
        if (l < 0) {
            Gameover Zombies = new Gameover();
            Zombies.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_formMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated


    }//GEN-LAST:event_formWindowActivated

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        spark.setVisible(false);
        BGMGlobal = soundBGM();
        

        java.util.Timer t = new java.util.Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                switch (b % 5) {
                    case 0:

                        t1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("zombie.png")));
                        t2.setIcon(new ImageIcon(""));
                        t5.setIcon(new ImageIcon(""));
                        t3.setIcon(new ImageIcon(""));
                        t4.setIcon(new ImageIcon(""));
                        c = 1;
                        temp = b;
                        while (b == temp) {
                            b = randomNumberbetweenOneAndFive();
                        }
                        if (click == false || click1 == false) {
                            life.setText(l-- + "");
                            if (l < 0) {

                                Gameover score1 = new Gameover();
                                int a = Integer.parseInt(score2.getText());
                                Gameover.score.setText(a + "");
                                score1.setVisible(true);
                                this.cancel();
                            }

                        }
                        break;
                    case 1:
                        t2.setIcon(new ImageIcon(getClass().getClassLoader().getResource("zombie.png")));
                        t4.setIcon(new ImageIcon(""));
                        t3.setIcon(new ImageIcon(""));
                        t1.setIcon(new ImageIcon(""));
                        t5.setIcon(new ImageIcon(""));
                        c = 2;
                        temp = b;
                        while (b == temp) {
                            b = randomNumberbetweenOneAndFive();
                        }
                        if (click == false || click1 == false) {
                            life.setText(l-- + "");
                            if (l < 0) {

                                Gameover score1 = new Gameover();
                                int a = Integer.parseInt(score2.getText());
                                Gameover.score.setText(a + "");
                                score1.setVisible(true);
                                this.cancel();
                            }

                        }
                        break;
                    case 2:
                        t4.setIcon(new ImageIcon(getClass().getClassLoader().getResource("zombie.png")));
                        t1.setIcon(new ImageIcon(""));
                        t2.setIcon(new ImageIcon(""));
                        t5.setIcon(new ImageIcon(""));
                        t3.setIcon(new ImageIcon(""));
                        c = 3;
                        temp = b;
                        while (b == temp) {
                            b = randomNumberbetweenOneAndFive();
                        }
                        if (click == false || click1 == false) {
                            life.setText(l-- + "");
                            if (l < 0) {

                                Gameover score1 = new Gameover();
                                int a = Integer.parseInt(score2.getText());
                                Gameover.score.setText(a + "");
                                score1.setVisible(true);
                                this.cancel();
                            }
                        }
                        break;
                    case 3:
                        t5.setIcon(new ImageIcon(getClass().getClassLoader().getResource("zombie.png")));
                        t1.setIcon(new ImageIcon(""));
                        t2.setIcon(new ImageIcon(""));
                        t3.setIcon(new ImageIcon(""));
                        t4.setIcon(new ImageIcon(""));
                        c = 4;
                        temp = b;
                        while (b == temp) {
                            b = randomNumberbetweenOneAndFive();
                        }
                        if (click == false || click1 == false) {
                            life.setText(l-- + "");
                            if (l < 0) {

                                Gameover score1 = new Gameover();
                                int a = Integer.parseInt(score2.getText());
                                Gameover.score.setText(a + "");
                                score1.setVisible(true);
                                this.cancel();
                            }
                        }
                        break;
                    default:
                        t3.setIcon(new ImageIcon(getClass().getClassLoader().getResource("zombie.png")));
                        t1.setIcon(new ImageIcon(""));
                        t4.setIcon(new ImageIcon(""));
                        t2.setIcon(new ImageIcon(""));
                        t5.setIcon(new ImageIcon(""));
                        c = 5;
                        temp = b;
                        while (b == temp) {
                            b = randomNumberbetweenOneAndFive();
                        }
                        if (click == false || click1 == false) {
                            life.setText(l-- + "");
                            if (l < 0) {

                                Gameover score1 = new Gameover();
                                int a = Integer.parseInt(score2.getText());
                                Gameover.score.setText(a + "");
                                score1.setVisible(true);
                                this.cancel();
                            }
                        }
                        break;
                }
                click = false;

            }
        }, 1000, 1000);
    }//GEN-LAST:event_formWindowOpened

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved

        switch (n) {
            case 1:
                b1 = bullet;
                break;
            case 2:
                b2 = bullet;
                break;
            case 3:
                b3 = bullet;
                break;
            default:
                System.out.println("n<=0 || n>=4");
        }

        if (evt.getWheelRotation() >= 0) {
            n++;
            if (n > 3) {
                n = 1;
            }
        } else {
            n--;
            if (n < 1) {
                n = 3;
            }
        }

        switch (n) {
            case 1:
                g.setIcon(new ImageIcon(getClass().getClassLoader().getResource("g4.png")));
                spark.setVisible(false);
                bullet = b1;
                break;
            case 2:
                spark.setVisible(false);
                bullet = b2;
                g.setIcon(new ImageIcon(getClass().getClassLoader().getResource("g3.png")));
                break;
            case 3:
                bullet = b3;
                spark.setVisible(false);
                g.setIcon(new ImageIcon(getClass().getClassLoader().getResource("gun.png")));
                break;
            default:
                break;
        }

        switch (bullet) {
            case 0:
                bullets.setVisible(false);
                bullets1.setVisible(false);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                break;
            case 1:
                bullets.setVisible(true);
                bullets1.setVisible(false);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                break;
            case 2:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                bullets2.setVisible(false);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                break;
            case 3:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(false);
                bullets4.setVisible(false);
                break;
            case 4:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(true);
                bullets4.setVisible(false);
                break;
            case 5:
                bullets.setVisible(true);
                bullets1.setVisible(true);
                bullets2.setVisible(true);
                bullets3.setVisible(true);
                bullets4.setVisible(true);
                break;
        }

    }//GEN-LAST:event_formMouseWheelMoved

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        stopBGM(BGMGlobal);
    }//GEN-LAST:event_formWindowLostFocus

    public AudioStream soundBGM() {
        AudioStream BGM = null;
        try {
            InputStream music = getClass().getResourceAsStream("/bg.wav");
            BGM = new AudioStream(music);
            AudioPlayer.player.start(BGM);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        } finally {
            return BGM;
        }
    }

    public void sound(String nm) {
        AudioStream BGM;
        try {
            InputStream music = getClass().getResourceAsStream("/" + nm + ".wav");
            BGM = new AudioStream(music);
            AudioPlayer.player.start(BGM);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Zombies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Zombies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bullets;
    private javax.swing.JLabel bullets1;
    private javax.swing.JLabel bullets2;
    private javax.swing.JLabel bullets3;
    private javax.swing.JLabel bullets4;
    private javax.swing.JLabel g;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel life;
    private javax.swing.JLabel s1;
    public static javax.swing.JLabel score2;
    private javax.swing.JLabel spark;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    private void stopBGM(AudioStream BGMGlobal) {
        AudioPlayer.player.stop(BGMGlobal);
    }
}
