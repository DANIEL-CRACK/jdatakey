package main;

import java.io.FileWriter;
import java.io.IOException;
import javafx.stage.FileChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class main extends javax.swing.JFrame {

    private String ale = "";
    
    private String pal = "";
    
    private int count = 0;
    
    public main() {
        initComponents();
        this.setResizable(false);
        this.setSize(217, 435);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        edit = new javax.swing.JTextField();
        random = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTextArea();
        save = new javax.swing.JButton();
        agregar1 = new javax.swing.JButton();
        p = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        random.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/up16.png"))); // NOI18N
        random.setText("Valor aleatorio");
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });

        agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit_add16.png"))); // NOI18N
        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        t.setColumns(20);
        t.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        t.setRows(5);
        t.setEnabled(false);
        jScrollPane1.setViewportView(t);

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        save.setText("Guardar file");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        agregar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancel16.png"))); // NOI18N
        agregar1.setText("Eliminar");
        agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar1ActionPerformed(evt);
            }
        });

        p.setText("Palabras : 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(edit)
                                    .addComponent(random, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(p)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(p)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(random)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(agregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        
        if(!edit.getText().equals("")){
        
            if(!pal.equals(edit.getText())){
                count++;
                t.setText(t.getText() + "[" + edit.getText() + "],\n");
            }
            else JOptionPane.showMessageDialog(null, "El texto no puede ser el mismo!","Error",JOptionPane.OK_OPTION);;
            
        } else JOptionPane.showMessageDialog(null, "Campo vacio!\nLlena todos los campos","Error",JOptionPane.OK_OPTION);
        
        pal = edit.getText();
        
        p.setText("Palabras : " + count);
        
    }//GEN-LAST:event_agregarActionPerformed

    private void agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar1ActionPerformed
        
        if(!t.getText().equals("")){
         
        String c = t.getText().substring(0,t.getText().length() - 1);
        
        int i = 0; String lexema = "";
        
        while(i < c.length()){
            if(c.substring(i,i+1).equals("\n"))lexema = c.substring(0,i);
            i++;
        }
        
        t.setText(lexema + "\n");
        
        if(t.getText().equals("\n"))t.setText("");

        count--; p.setText("Palabras : " + count);
        
        }
        
    }//GEN-LAST:event_agregar1ActionPerformed

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed
        String im = Generated();
        if(im.equals(ale))Generated();
        edit.setText(ale);
    }//GEN-LAST:event_randomActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        
        if(count == 97){
            String txt = t.getText(); 
            txt.substring(0,txt.length() - 2);
            JFileChooser file_c = new JFileChooser();        
            file_c.showSaveDialog(null);
            String url = file_c.getSelectedFile().toString();
            if(!url.equals("")) SaveFile(txt, url);
            
        } else JOptionPane.showMessageDialog(null, "La cantidad de palabras debe ser 97","Error",JOptionPane.OK_OPTION);
        
    }//GEN-LAST:event_saveActionPerformed

    public void SaveFile(String texto, String namefile){
        
        try {
            FileWriter myWriter = new FileWriter(namefile);
            myWriter.write(texto.substring(0,texto.length() - 2)); myWriter.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en el proceso...\n" 
            + "No se puede crear file en: " + namefile); e.printStackTrace();
        }
        
    }
    
    public String Generated() {

        int pass[] = {(getRandom(35) + 5),(getRandom(4))};
        
        String a = ""; int i = 0;

        while(i < 5){
            a += ch(getRandom(35) + 5);
            i++;
        }
        
        ale = a;
        
        return a;
        
    }

    private String ch(int num) {

        if (num == 1) {
            return "*";
        }
        if (num == 2) {
            return "#";
        }
        if (num == 3) {
            return "@";
        }
        if (num == 4) {
            return "!";
        }
        if (num == 5) {
            if(getRandom(2) == 1)return "a";
            else return "A";
        }
        if (num == 6) {
            if(getRandom(2) == 1)return "b";
            else return "B";
        }
        if (num == 7) {
            if(getRandom(2) == 1)return "c";
            else return "C";
        }
        if (num == 8) {
            if(getRandom(2) == 1)return "d";
            else return "D";
        }
        if (num == 9) {
            if(getRandom(2) == 1)return "e";
            else return "E";
        }
        if (num == 10) {
            if(getRandom(2) == 1)return "f";
            else return "F";
        }
        if (num == 11) {
            if(getRandom(2) == 1)return "g";
            else return "G";
        }
        if (num == 12) {
            if(getRandom(2) == 1)return "h";
            else return "H";
        }
        if (num == 13) {
            if(getRandom(2) == 1)return "i";
            else return "I";
        }
        if (num == 14) {
            if(getRandom(2) == 1)return "j";
            else return "J";
        }
        if (num == 15) {
            if(getRandom(2) == 1)return "k";
            else return "K";
        }
        if (num == 16) {
            if(getRandom(2) == 1)return "l";
            else return "L";
        }
        if (num == 17) {
            if(getRandom(2) == 1)return "m";
            else return "M";
        }
        if (num == 18) {
            if(getRandom(2) == 1)return "n";
            else return "N";
        }
        if (num == 19) {
            if(getRandom(2) == 1)return "o";
            else return "O";
        }
        if (num == 20) {
            if(getRandom(2) == 1)return "p";
            else return "P";
        }
        if (num == 21) {
            if(getRandom(2) == 1)return "q";
            else return "Q";
        }
        if (num == 22) {
            if(getRandom(2) == 1)return "r";
            else return "R";
        }
        if (num == 23) {
            if(getRandom(2) == 1)return "s";
            else return "S";
        }
        if (num == 24) {
            if(getRandom(2) == 1)return "t";
            else return "T";
        }
        if (num == 25) {
            if(getRandom(2) == 1)return "u";
            else return "U";
        }
        if (num == 26) {
            if(getRandom(2) == 1)return "v";
            else return "V";
        }
        if (num == 27) {
            if(getRandom(2) == 1)return "w";
            else return "W";
        }
        if (num == 28) {
            if(getRandom(2) == 1)return "x";
            else return "X";
        }
        if (num == 29) {
            if(getRandom(2) == 1)return "y";
            else return "Y";
        }
        if (num == 30) {
            if(getRandom(2) == 1)return "z";
            else return "Z";
        }
        if (num == 31) {
            return "0";
        }
        if (num == 32) {
            return "1";
        }
        if (num == 33) {
            return "2";
        }
        if (num == 34) {
            return "3";
        }
        if (num == 35) {
            return "4";
        }
        if (num == 36) {
            return "5";
        }
        if (num == 37) {
            return "6";
        }
        if (num == 38) {
            return "7";
        }
        if (num == 39) {
            return "8";
        }
        if (num == 40) {
            return "9";
        }

        return "";
    }

    private int getRandom(int p) {
        double ran = Math.random() * p;
        return (int) ran + 1;
    }
    
    public static void main(String args[]) {
        try{
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }catch(Exception e){
           e.printStackTrace();
        } 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton agregar1;
    private javax.swing.JTextField edit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel p;
    private javax.swing.JButton random;
    private javax.swing.JButton save;
    private javax.swing.JTextArea t;
    // End of variables declaration//GEN-END:variables
}
