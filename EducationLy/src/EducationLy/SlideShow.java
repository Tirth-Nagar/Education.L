/**
Author: Tirth Nagar
Date: 7/12/2020
Purpose: To create the JFrame form that will act as a controlled slide show
 */

package EducationLy;

//Import nessaccary packages
import java.awt.AWTException;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SlideShow extends javax.swing.JFrame {
    private CardLayout cardLayout;
    
    //Create and initialize the images for the slideshow
    public void initImage(){
        String[] fileNames = {"note1.png","note2.png","note3.png","note4.png","note5.png","note6.png","note7.png","note8.png","note9.png","note10.png","note11.png","note12.png","note13.png","note14.png","note15.png","note16.png"};
        for(String s:fileNames){
            Icon icon = new ImageIcon("src/NoteImgs/"+s);
            JLabel Slides = new JLabel(icon);
            RootWindow.add(Slides);
        }
        cardLayout = new CardLayout();
        RootWindow.setLayout(cardLayout);
        RootWindow.setVisible(true);
    }
    
    //Create the SlideShow Form and all its components
    public SlideShow() {
        initComponents();
        initImage();
        SetIcon(); 
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        // Move the window
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        next = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        screenshot = new javax.swing.JLabel();
        RootWindow = new javax.swing.JPanel();
        Background = new javax.swing.JLabel();

        setTitle("Education.Ly");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EducationLy/images/next.png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });
        getContentPane().add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 670, 60, 50));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EducationLy/images/backSlide.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 670, 60, 50));

        screenshot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EducationLy/images/screenshot.png"))); // NOI18N
        screenshot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                screenshotMouseClicked(evt);
            }
        });
        getContentPane().add(screenshot, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 60));

        RootWindow.setLayout(new java.awt.CardLayout());
        getContentPane().add(RootWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 940, 690));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EducationLy/images/background.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //When the next label that acts as a button is clicked switch to the next component in the layout
    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        cardLayout.next(RootWindow);
    }//GEN-LAST:event_nextMouseClicked
    
    //When the back label that acts as a button is clicked switch to the previous component in the layout
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        cardLayout.previous(RootWindow);
    }//GEN-LAST:event_backMouseClicked
    
    //When the screenshot label that acts as a button is clicked open a dialog box that tells the user how to take a screenshot
    private void screenshotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_screenshotMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this,"To take a screenshot on a Windows machine press the WINDOWS KEY \non the keyboard and PRTSCN KEY at the same time.\n\nOn a MacOS machine press the SHIFT,COMMAND,and 3 KEYS at\nthe same time.");
    }//GEN-LAST:event_screenshotMouseClicked

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
            java.util.logging.Logger.getLogger(SlideShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SlideShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SlideShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SlideShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SlideShow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel RootWindow;
    private javax.swing.JLabel back;
    private javax.swing.JLabel next;
    private javax.swing.JLabel screenshot;
    // End of variables declaration//GEN-END:variables

    //Set the icon for the JFrame form
    private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images//study.png")));
    }

}

