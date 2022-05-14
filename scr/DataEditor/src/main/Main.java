package main;

import Database.DataManager;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main extends javax.swing.JFrame {

    private String url = "";
    
    private String url_f_e = "";
    
    public Main() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Data");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        author = new javax.swing.JTextField();
        gmail = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setText("Name");
        name.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                nameInputMethodTextChanged(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_add16.png"))); // NOI18N
        jButton1.setText("Crear data base");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel16.png"))); // NOI18N
        jButton2.setText("Restart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        author.setText("Author");
        author.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                authorKeyPressed(evt);
            }
        });

        gmail.setText("Gmail");
        gmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                gmailKeyPressed(evt);
            }
        });

        pass.setText("Password");
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });

        jLabel1.setText("Creacion base de datos");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open16.png"))); // NOI18N
        jButton3.setText("Elegir file encript");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(name)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(author)
                    .addComponent(gmail)
                    .addComponent(pass)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1))
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_nameInputMethodTextChanged
        
    }//GEN-LAST:event_nameInputMethodTextChanged

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        
        if(name.getText().length() == 4){
            if(name.getText().equals("Name")){
                name.setText("");
            }
        }
        
    }//GEN-LAST:event_nameKeyPressed

    private void authorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_authorKeyPressed
        
        if(author.getText().length() == 6){
            if(author.getText().equals("Author")){
                author.setText("");
            }
        }
        
    }//GEN-LAST:event_authorKeyPressed

    private void gmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gmailKeyPressed
        
        if(gmail.getText().length() == 5){
            if(gmail.getText().equals("Gmail")){
                gmail.setText("");
            }
        }
        
    }//GEN-LAST:event_gmailKeyPressed

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        
        if(pass.getText().length() == 8){
            if(pass.getText().equals("Password")){
                pass.setText("");
            }
        }
        
    }//GEN-LAST:event_passKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        name.setText("Name");
        author.setText("Author");
        gmail.setText("Gmail");
        pass.setText("Password");
        url = ""; url_f_e = "";
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        SaveFile(); if(!url.equals("")) created();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser file_c = new JFileChooser();        
        file_c.showOpenDialog(null);
        url_f_e = file_c.getSelectedFile().toString();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SaveFile(){
        JFileChooser file_c = new JFileChooser();        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Data File *.dat", "dat");
        file_c.setAcceptAllFileFilterUsed(false);
        file_c.addChoosableFileFilter(filter);
        file_c.showSaveDialog(null);
        url = file_c.getSelectedFile().toString();
    }
    
    private void created(){
        
        String name = "";
        String author = "";
        String gmail = "";
        String pass = "";
        
        if(!this.name.getText().equals("Name")) name = this.name.getText();
        if(!this.author.getText().equals("Author")) author = this.author.getText();
        if(!this.gmail.getText().equals("Gmail")) gmail = this.gmail.getText();
        if(!this.pass.getText().equals("Password")) pass = this.pass.getText();
        
        DataManager dm = new DataManager(url);
        
        dm.setName(name);
        dm.setAuthor(author);
        dm.setGmail(gmail);
        dm.setPassword(pass);
        dm.setEncriptFile(url_f_e);
        dm.newDatabase();
        
    }
    
    public static void main(String args[]) {
        try{
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }catch(Exception e){
           e.printStackTrace();
        } 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author;
    private javax.swing.JTextField gmail;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pass;
    // End of variables declaration//GEN-END:variables
}
