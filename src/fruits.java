
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author PRAKASH
 */
public class fruits extends javax.swing.JFrame {

    /**
     * Creates new form fruits
     */
    public fruits() {
        initComponents();
    }
     DefaultTableModel model=new DefaultTableModel();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        chk1 = new javax.swing.JCheckBox();
        chk2 = new javax.swing.JCheckBox();
        chk3 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        cmb1 = new javax.swing.JComboBox<>();
        cmb2 = new javax.swing.JComboBox<>();
        cmb3 = new javax.swing.JComboBox<>();
        cmb4 = new javax.swing.JComboBox<>();
        qty1 = new javax.swing.JTextField();
        qty2 = new javax.swing.JTextField();
        qty3 = new javax.swing.JTextField();
        qty4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        chk5 = new javax.swing.JCheckBox();
        chk6 = new javax.swing.JCheckBox();
        chk7 = new javax.swing.JCheckBox();
        chk8 = new javax.swing.JCheckBox();
        cmb5 = new javax.swing.JComboBox<>();
        cmb6 = new javax.swing.JComboBox<>();
        cmb7 = new javax.swing.JComboBox<>();
        cmb8 = new javax.swing.JComboBox<>();
        qty5 = new javax.swing.JTextField();
        qty6 = new javax.swing.JTextField();
        qty7 = new javax.swing.JTextField();
        qty8 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtbill = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 255), null));

        chk1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chk1.setText("Apple");

        chk2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chk2.setText("Banana");

        chk3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chk3.setText("Orange");

        chk4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chk4.setText("Mango");

        cmb1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", "GR" }));

        cmb2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", "GR" }));

        cmb3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", "GR" }));

        cmb4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", "GR" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(chk4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(qty4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(cmb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chk2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qty2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(chk1)
                                        .addGap(18, 18, 18)
                                        .addComponent(qty1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(chk3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qty3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk1)
                    .addComponent(cmb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk2)
                    .addComponent(cmb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(cmb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chk3)
                            .addComponent(qty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chk4)
                    .addComponent(cmb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 310, 250));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCheckBox5.setText("Cherry");
        jPanel2.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jCheckBox6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCheckBox6.setText("Pomegranate");
        jPanel2.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1431, 80, -1, -1));

        jCheckBox7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCheckBox7.setText("Pineapple");
        jPanel2.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1457, 139, -1, -1));

        jCheckBox8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jCheckBox8.setText("Stawberry");
        jPanel2.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1457, 193, -1, -1));

        jComboBox5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", " ", "GR" }));
        jPanel2.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 22, -1, -1));

        jComboBox6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", " ", "GR" }));
        jPanel2.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 79, -1, -1));

        jComboBox7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", " ", "GR" }));
        jPanel2.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 138, -1, -1));

        jComboBox8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", " ", "GR" }));
        jPanel2.add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1560, 192, -1, -1));

        chk5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chk5.setText("Strawberry");
        jPanel2.add(chk5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        chk6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chk6.setText("Pomegranate");
        jPanel2.add(chk6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        chk7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chk7.setText("Cherry");
        jPanel2.add(chk7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        chk8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        chk8.setText("Pineapple");
        jPanel2.add(chk8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        cmb5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", "GR" }));
        jPanel2.add(cmb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 80, -1));

        cmb6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmb6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG  ", "GR" }));
        jPanel2.add(cmb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 80, -1));

        cmb7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmb7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG", "GR" }));
        jPanel2.add(cmb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 80, -1));

        cmb8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmb8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "KG ", " GR" }));
        jPanel2.add(cmb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 80, -1));
        jPanel2.add(qty5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 80, -1));
        jPanel2.add(qty6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 80, -1));
        jPanel2.add(qty7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 80, -1));
        jPanel2.add(qty8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 80, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 320, 250));

        jtable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Qty", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 310, 250));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Total Amount");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, -1, -1));

        txtbill.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtbill.setText("Total");
        getContentPane().add(txtbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 540, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton2.setText("Pay");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 530, 80, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("FRUITS");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 160, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fruit.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-420, -10, 1430, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    
       
           
            
             new Payment().setVisible(true);
           
         
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        double sum = 0;
        double price;
        double qty;
        double cal = 0;
        if(chk1.isSelected())
        {
            String Apple= chk1.getText();
           String mes1= cmb1.getSelectedItem().toString();
            price = 200.0;
            qty = Integer.parseInt(qty1.getText());
            
             if(mes1.equals("KG"))
          {
               cal = (qty * price) ;
               model = (DefaultTableModel)jtable.getModel();
               model.addRow(new Object[]
                {  
                Apple,
                 price,
                 qty,
                 cal
                });  
                }
             else
             {
              cal = (qty/1000 * price) ;
 
              model = (DefaultTableModel)jtable.getModel();          
              model.addRow(new Object[]
            {
            
             Apple,
             price,
             qty,
             cal
            });        
             }
              }
            if(chk2.isSelected())
        {
            String Banana = chk2.getText();
           String mes2= cmb2.getSelectedItem().toString();
            price = 50.0;
            qty = Integer.parseInt(qty2.getText());
            
             if(mes2.equals("KG"))
          {
               cal = (qty * price) ;
               model = (DefaultTableModel)jtable.getModel();
               model.addRow(new Object[]
                {  
                Banana,
                 price,
                 qty,
                 cal
                });  
                 }
             else
             {
              cal = (qty/1000 * price) ;
           
              model = (DefaultTableModel)jtable.getModel();          
              model.addRow(new Object[]
            {
            
             Banana,
             price,
             qty,
             cal
            });        
             }
              }
           if(chk3.isSelected())
        {
            String Orange = chk3.getText();
           String mes3= cmb3.getSelectedItem().toString();
            price = 90.0;
            qty = Integer.parseInt(qty3.getText());
            
             if(mes3.equals("KG"))
          {
               cal = (qty * price) ;
               model = (DefaultTableModel)jtable.getModel();
               model.addRow(new Object[]
                        {  
                Orange,
                 price,
                 qty,
                 cal
                });  
          }
             else
             {
              cal = (qty/1000 * price) ;
 
              model = (DefaultTableModel)jtable.getModel();          
              model.addRow(new Object[]
            {
            
             Orange,
                   price,
             qty,
             cal
            });        
             }
            
        }
          if(chk4.isSelected())
        {
            String Mango = chk4.getText();
           String mes4= cmb4.getSelectedItem().toString();
            price = 100.0;
            qty = Integer.parseInt(qty4.getText());
            
             if(mes4.equals("KG"))
          {
               cal = (qty * price) ;
               model = (DefaultTableModel)jtable.getModel();
               model.addRow(new Object[]
                {  
                Mango,
                 price,
                 qty,
                 cal
               });
          }
              else
             {
              cal = (qty/1000 * price) ;
 
              model = (DefaultTableModel)jtable.getModel();          
              model.addRow(new Object[]
            {
            
             Mango,
              price,
             qty,
             cal
            });        
             }}
            
          if(chk5.isSelected())
        {
            String Straberry = chk5.getText();
           String mes5= cmb5.getSelectedItem().toString();
            price = 400.0;
            qty = Integer.parseInt(qty5.getText());
            
             if(mes5.equals("KG"))
          {
               cal = (qty * price) ;
               model = (DefaultTableModel)jtable.getModel();
               model.addRow(new Object[]
                {  
                Straberry,
                 price,
                 qty,
                 cal
               });
          }
              else
             {
              cal = (qty/1000 * price) ;
 
              model = (DefaultTableModel)jtable.getModel();          
              model.addRow(new Object[]
            {
            
             Straberry,
              price,
             qty,
             cal
            });        
             }}
          if(chk6.isSelected())
        {
            String pomegranate = chk6.getText();
           String mes6= cmb6.getSelectedItem().toString();
            price = 350.0;
            qty = Integer.parseInt(qty6.getText());
            
             if(mes6.equals("KG"))
          {
               cal = (qty * price) ;
               model = (DefaultTableModel)jtable.getModel();
               model.addRow(new Object[]
                {  
                pomegranate,
                 price,
                 qty,
                 cal
               });
          }
              else
             {
              cal = (qty/1000 * price) ;
 
              model = (DefaultTableModel)jtable.getModel();          
              model.addRow(new Object[]
            {
            
             pomegranate,
              price,
             qty,
             cal
            });        
             }}
          if(chk7.isSelected())
        {
            String cherry = chk7.getText();
           String mes7= cmb7.getSelectedItem().toString();
            price = 210.0;
            qty = Integer.parseInt(qty7.getText());
            
             if(mes7.equals("KG"))
          {
               cal = (qty * price) ;
               model = (DefaultTableModel)jtable.getModel();
               model.addRow(new Object[]
                {  
                cherry,
                 price,
                 qty,
                 cal
               });
          }
              else
             {
              cal = (qty/1000 * price) ;
 
              model = (DefaultTableModel)jtable.getModel();          
              model.addRow(new Object[]
            {
            
             cherry,
              price,
             qty,
             cal
            });        
             }}
          if(chk8.isSelected())
        {
            String pineapple = chk8.getText();
           String mes8= cmb8.getSelectedItem().toString();
            price = 420.0;
            qty = Integer.parseInt(qty8.getText());
            
             if(mes8.equals("KG"))
          {
               cal = (qty * price) ;
               model = (DefaultTableModel)jtable.getModel();
               model.addRow(new Object[]
                {  
                pineapple,
                 price,
                 qty,
                 cal
               });
          }
              else
             {
              cal = (qty/1000 * price) ;
 
              model = (DefaultTableModel)jtable.getModel();          
              model.addRow(new Object[]
            {
            
             pineapple,
              price,
             qty,
             cal
            });        
             }}
            
           for(double i=0; i <jtable.getRowCount(); i++)
        {
            sum = sum + Double.parseDouble(jtable.getValueAt((int) i, 3).toString());
        }
        
        txtbill.setText(Double.toString(sum));
        
               
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(fruits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fruits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fruits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fruits.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new fruits().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chk5;
    private javax.swing.JCheckBox chk6;
    private javax.swing.JCheckBox chk7;
    private javax.swing.JCheckBox chk8;
    private javax.swing.JComboBox<String> cmb1;
    private javax.swing.JComboBox<String> cmb2;
    private javax.swing.JComboBox<String> cmb3;
    private javax.swing.JComboBox<String> cmb4;
    private javax.swing.JComboBox<String> cmb5;
    private javax.swing.JComboBox<String> cmb6;
    private javax.swing.JComboBox<String> cmb7;
    private javax.swing.JComboBox<String> cmb8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable;
    private javax.swing.JTextField qty1;
    private javax.swing.JTextField qty2;
    private javax.swing.JTextField qty3;
    private javax.swing.JTextField qty4;
    private javax.swing.JTextField qty5;
    private javax.swing.JTextField qty6;
    private javax.swing.JTextField qty7;
    private javax.swing.JTextField qty8;
    private javax.swing.JLabel txtbill;
    // End of variables declaration//GEN-END:variables
}
