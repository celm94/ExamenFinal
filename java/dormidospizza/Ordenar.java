/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dormidospizza;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Ordenar extends javax.swing.JFrame {

    /**
     * Creates new form Ordenar
     */
    ArrayList<Pizzas> listagt = new ArrayList<>();

    public void setListaGT(ArrayList<Pizzas> pizzas) {
        this.listagt = pizzas;

    }

    ArrayList<Pizzas> listaj = new ArrayList<>();

    public void setListaJ(ArrayList<Pizzas> pizzas) {
        this.listaj = pizzas;

    }

    ArrayList<Pizzas> listaep = new ArrayList<>();

    public void setListaEP(ArrayList<Pizzas> pizzas) {
        this.listaep = pizzas;

    }

    public void VerOrdenesGT() {
        int x = 0;
        String listgt[][] = new String[listagt.size()][4];
        for (int i = 0; i < listagt.size(); i++) {
            x++;
            listgt[i][0] = "" + x;
            listgt[i][1] = listagt.get(i).getNombre();
            listgt[i][2] = listagt.get(i).getDescripcion();
            listgt[i][3] = "Guatemala";
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                listgt,
                new String[]{
                    "Número", "Pizza", "Descripción", "Sucursal"
                }));

    }

    public void VerOrdenesEP() {
        
        int x = 0;
        String listep[][] = new String[listaep.size()][4];
        for (int i = 0; i < listaep.size(); i++) {
            x++;
            listep[i][0] = "" + x;
            listep[i][1] = listaep.get(i).getNombre();
            listep[i][2] = listaep.get(i).getDescripcion();
            listep[i][3] = "El Progreso";
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                listep,
                new String[]{
                    "Número", "Pizza", "Descripción", "Sucursal"
                }));

        /*String seljbox = (String) JCOMBOXSUCURSAL.getSelectedItem();
        String sl[][] = new String[listaep.size()][4];
        for (int x = 0; x < listaep.size(); x++) {
           for(sl[x][3]: )
        }*/
    }

    public void VerOrdenesJ() {
        int x = 0;
        String listj[][] = new String[listaj.size()][4];
        for (int i = 0; i < listaj.size(); i++) {
            x++;
            listj[i][0] = "" + x;
            listj[i][1] = listaj.get(i).getNombre();
            listj[i][2] = listaj.get(i).getDescripcion();
            listj[i][3] = "Jalapa";
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                listj,
                new String[]{
                    "Número", "Pizza", "Descripción", "Sucursal"
                }));
    }

    public Ordenar() {
        initComponents();

        /*String plgt[][] =new String[listasp.size()][1];
        for(int show = 0; show < listasp.size(); show++){
         plgt[show][0]= listasp.get(show).getNombre();
         
         jcbox.addItem( Arrays.toString(plgt)+"");
        }*/
    }

    /**
     * *************************VER ÓRDENES EN LA TABLA************************
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ORDENAR = new javax.swing.JButton();
        JCOMBOXSUCURSAL = new javax.swing.JComboBox<>();
        jcbox = new javax.swing.JComboBox<>();
        JLABELPRECIO = new javax.swing.JLabel();
        jdescripcion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("SUCURSAL:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("PIZZA:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("DESCRIPCIÓN");

        ORDENAR.setBackground(new java.awt.Color(153, 0, 0));
        ORDENAR.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ORDENAR.setForeground(new java.awt.Color(255, 255, 255));
        ORDENAR.setText("ORDENAR");
        ORDENAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORDENARActionPerformed(evt);
            }
        });

        JCOMBOXSUCURSAL.setForeground(new java.awt.Color(0, 0, 51));
        JCOMBOXSUCURSAL.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Guatemala", "El Progreso", "Jalapa" }));
        JCOMBOXSUCURSAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCOMBOXSUCURSALActionPerformed(evt);
            }
        });

        jcbox.setForeground(new java.awt.Color(0, 0, 102));
        jcbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcboxActionPerformed(evt);
            }
        });

        JLABELPRECIO.setFont(new java.awt.Font("Verdana", 2, 12)); // NOI18N
        JLABELPRECIO.setForeground(new java.awt.Color(0, 0, 102));

        jdescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdescripcionActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Número", "Pizza", "Descripción", "Sucursal"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Stencil", 2, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("DORMIDOS");

        jLabel5.setFont(new java.awt.Font("Stencil", 2, 60)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("PIZZA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ORDENAR, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(JCOMBOXSUCURSAL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbox, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLABELPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(99, 99, 99))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JCOMBOXSUCURSAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ORDENAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLABELPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ORDENARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORDENARActionPerformed

        String sel = (String) JCOMBOXSUCURSAL.getSelectedItem();

        switch (sel) {
            case "Guatemala" -> {
                for (Pizzas p : listagt) {
                    jcbox.equals(p.getNombre());
                    String seleccionbox = (String) jcbox.getSelectedItem();
                    for (Pizzas gt : listagt) {
                        jdescripcion.equals(gt.getDescripcion());
                        JLABELPRECIO.equals(gt.getPrecio());

                        VerOrdenesGT();
                    }

                }

            }
            case "El Progreso" -> {
                for (Pizzas ep : listaep) {
                    jcbox.equals(ep.getNombre());
                    String seleccionbox = (String) jcbox.getSelectedItem();
                    for (Pizzas pep : listaep) {
                        jdescripcion.equals(pep.getDescripcion());
                        JLABELPRECIO.equals(pep.getPrecio());
                        VerOrdenesEP();
                    }
                }
            }
            case "Jalapa" -> {
                for (Pizzas j : listaj) {
                    jcbox.equals(j.getNombre());
                    String seleccionbox = (String) jcbox.getSelectedItem();
                    for (Pizzas pj : listaj) {
                        jdescripcion.equals(pj.getDescripcion());
                        JLABELPRECIO.equals(pj.getPrecio());
                        VerOrdenesJ();
                    }
                }
            }
            default -> {
            }
        }


    }//GEN-LAST:event_ORDENARActionPerformed

    private void JCOMBOXSUCURSALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCOMBOXSUCURSALActionPerformed
        String seleccion = (String) JCOMBOXSUCURSAL.getSelectedItem();

        if (seleccion != null) {
            switch (seleccion) {
                case "Guatemala" -> {
                    jcbox.removeAllItems();
                    for (Pizzas p : listagt) {
                        
                        jcbox.addItem(p.getNombre());

                    }
                    

                }
                case "El Progreso" -> {
                    jcbox.removeAllItems();
                    for (Pizzas ep : listaep) {
                        
                        jcbox.addItem(ep.getNombre());
                    }
                }
                case "Jalapa" -> {
                    jcbox.removeAllItems();
                    for (Pizzas j : listaj) {
                        
                        jcbox.addItem(j.getNombre());
                    }
                }
                default -> {
                }
            }

        }


    }//GEN-LAST:event_JCOMBOXSUCURSALActionPerformed

    private void jcboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcboxActionPerformed
        String sel = (String) JCOMBOXSUCURSAL.getSelectedItem();

        switch (sel) {
            case "Guatemala" -> {
                for (Pizzas p : listagt) {
                    jcbox.equals(p.getNombre());
                    String seleccionbox = (String) jcbox.getSelectedItem();
                    for (Pizzas gt : listagt) {
                        jdescripcion.setText(gt.getDescripcion());
                        JLABELPRECIO.setText(gt.getPrecio());
                    }

                }

            }
            case "El Progreso" -> {
                for (Pizzas ep : listaep) {
                    jcbox.equals(ep.getNombre());
                    String seleccionbox = (String) jcbox.getSelectedItem();
                    for (Pizzas pep : listaep) {
                        jdescripcion.setText(pep.getDescripcion());
                        JLABELPRECIO.setText(pep.getPrecio());
                    }
                }
            }
            case "Jalapa" -> {
                for (Pizzas j : listaj) {
                    jcbox.equals(j.getNombre());
                    String seleccionbox = (String) jcbox.getSelectedItem();
                    for (Pizzas pj : listaj) {
                        jdescripcion.setText(pj.getDescripcion());
                        JLABELPRECIO.setText(pj.getDescripcion());
                    }
                }
            }
            default -> {
            }
        }
    }//GEN-LAST:event_jcboxActionPerformed

    private void jdescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdescripcionActionPerformed


    }//GEN-LAST:event_jdescripcionActionPerformed

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
            java.util.logging.Logger.getLogger(Ordenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ordenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ordenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ordenar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ordenar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> JCOMBOXSUCURSAL;
    private javax.swing.JLabel JLABELPRECIO;
    private javax.swing.JButton ORDENAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> jcbox;
    public static javax.swing.JTextField jdescripcion;
    // End of variables declaration//GEN-END:variables
}
