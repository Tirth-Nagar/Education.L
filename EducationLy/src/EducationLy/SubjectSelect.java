/**
Author: Tirth Nagar
Date: 7/12/2020
Purpose: To create the JFrame form that will ask the user what subject they would like to learn
 */

package EducationLy;

//Import nessaccary packages
import java.awt.*;
import java.io.IOException;
import java.util.Random;

public class SubjectSelect extends javax.swing.JFrame {
    
    //Creates new form SubjectSelect and all of its components
    public SubjectSelect() {
        
        initComponents();
        SetIcon();
        jScrollPane1.setBorder(null);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        // Move the window
        this.setLocation(x, y);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RootWindow = new javax.swing.JPanel();
        math = new javax.swing.JButton();
        english = new javax.swing.JButton();
        science = new javax.swing.JButton();
        history = new javax.swing.JButton();
        french = new javax.swing.JButton();
        FactPrompt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Fact = new javax.swing.JTextArea();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        HowToUse = new javax.swing.JMenuItem();
        AboutUs = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Education.Ly");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setName("SubjectSelect"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(550, 500));

        RootWindow.setBackground(new java.awt.Color(255, 255, 255));
        RootWindow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        math.setBackground(new java.awt.Color(255, 255, 255));
        math.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        math.setText("Math");

        english.setBackground(new java.awt.Color(255, 255, 255));
        english.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        english.setText("English");

        science.setBackground(new java.awt.Color(255, 255, 255));
        science.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        science.setText("Science");
        science.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scienceActionPerformed(evt);
            }
        });

        history.setBackground(new java.awt.Color(255, 255, 255));
        history.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        history.setText("History");

        french.setBackground(new java.awt.Color(255, 255, 255));
        french.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        french.setText("French");

        FactPrompt.setBackground(new java.awt.Color(255, 255, 255));
        FactPrompt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FactPrompt.setText("Did you know?");

        Fact.setEditable(false);
        Fact.setColumns(20);
        Fact.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Fact.setLineWrap(true);
        Fact.setRows(5);
        String fact1 = "The primary school is Phumachangtang, Tibet, is thought to be the highest school in the world.";
        String fact2 = "The King's School in Canterbury, England is the world's oldest school.";
        String fact3 = "A school in the Philippines is made entirely of recycled pop bottles.";
        String fact4 = "The largest school in the world in terms of number of students is the City Montessori School in Lucknow, India.";
        String fact5 = "Meal-time in France is considered part of the curriculum.";
        String fact6 = "Students in South Korea are expected to stay and help clean and tidy the classroom when lessons are over.";
        String fact7 = "Kids in Finland do not start school until the age of 7, which is one of the oldest ages around the world to start school.";
        String fact8 = "In Russia, children always start school on ‘Knowledge Day’ (September 1) even if it’s a weekend or a holiday.";
        String fact9 = "In Bangladesh, there are no fewer than 100 boat schools! Each one has Internet access, a library and is solar powered.";
        String fact10 = "In a remote area of Colombia, kids have to travel to school on a zip-line.";
        String fact11 = "A school in Germany has been built to look like a giant white cat, complete with whiskers and circular windows for eyes.";
        String fact12 = "Summer vacations in Chile start from mid-December and end in early March.";

        String[] facts = {fact1,fact2,fact3,fact4,fact5,fact6,fact7,fact8,fact9,fact10,fact11,fact12};
        Random random = new Random();
        int index = random.nextInt(facts.length);
        Fact.setText(""+facts[index]);
        Fact.setWrapStyleWord(true);
        Fact.setBorder(null);
        Fact.setDisabledTextColor(java.awt.Color.white);
        Fact.setSelectionColor(java.awt.Color.white);
        jScrollPane1.setViewportView(Fact);

        title.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        title.setText("Pick A Subject");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EducationLy/images/back.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout RootWindowLayout = new javax.swing.GroupLayout(RootWindow);
        RootWindow.setLayout(RootWindowLayout);
        RootWindowLayout.setHorizontalGroup(
            RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RootWindowLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(FactPrompt)
                .addGap(218, 218, 218))
            .addGroup(RootWindowLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(english, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RootWindowLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(RootWindowLayout.createSequentialGroup()
                        .addGroup(RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(science, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(french, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(50, 50, 50))
            .addGroup(RootWindowLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(title)
                .addGap(143, 143, 143))
        );
        RootWindowLayout.setVerticalGroup(
            RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RootWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(math, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(science, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(english, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(RootWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(history, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(french, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(FactPrompt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        File.setText("File");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        File.add(exit);

        MenuBar.add(File);

        Help.setText("Help");

        HowToUse.setText("How To Use");
        HowToUse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HowToUseActionPerformed(evt);
            }
        });
        Help.add(HowToUse);

        MenuBar.add(Help);

        AboutUs.setText("About Us");
        AboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUsMouseClicked(evt);
            }
        });
        MenuBar.add(AboutUs);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RootWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(RootWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //If you close the program terminate it completely
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    //When the How to use menu item is clicked teach the user how to use the program
    private void HowToUseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HowToUseActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this,"1. Choose Your Grade\n2. Select Your Subject\n3. Choose the Topic You Want to Learn");
    }//GEN-LAST:event_HowToUseActionPerformed

    //When the about us tab on the menu bar is clicked tell the ueser about the purpose of the program and who made it
    private void AboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this,"This GUI application is made by Tirth Nagar using Jframe.\nIts purpose is to help educate students in our community.");
    }//GEN-LAST:event_AboutUsMouseClicked

    //When the science button is clicked make the current frame invisible and set the TopicSelect frame visible
    private void scienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scienceActionPerformed
        new TopicSelect().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_scienceActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        new GradeSelect().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) throws IOException {
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
            java.util.logging.Logger.getLogger(SubjectSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SubjectSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SubjectSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SubjectSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SubjectSelect().setVisible(true);
            }
        });
        
    }
    
    //Set the icon for the JFrame form;
    private void SetIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Images//study.png")));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AboutUs;
    private javax.swing.JTextArea Fact;
    private javax.swing.JLabel FactPrompt;
    private javax.swing.JMenu File;
    private javax.swing.JMenu Help;
    private javax.swing.JMenuItem HowToUse;
    private javax.swing.JMenuBar MenuBar;
    private static javax.swing.JPanel RootWindow;
    private javax.swing.JButton english;
    private javax.swing.JMenuItem exit;
    private javax.swing.JButton french;
    private javax.swing.JButton history;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton math;
    private javax.swing.JButton science;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
