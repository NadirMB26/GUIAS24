
package com.mycompany.guias25;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class pantalla25 extends javax.swing.JFrame {
JCheckBox vcuadros[];
JButton btnAceptar;
    public pantalla25() {
        initComponents();
        CreacionVentana();
    }
public void CreacionVentana(){
 this.setTitle("Ejemplo de vector de componentes");
 this.setSize(300,600);
 vcuadros=new JCheckBox[10];
 String vtextos[]={"Rojo","Verde","Azul","Rosa","Celeste","Morado","Amarillo","Marron","Naranja","Blanco"};
 int i;
 for(i=0; i<vcuadros.length; i++){
     vcuadros[i]=new JCheckBox();
     vcuadros[i].setText(vtextos[i]);
     vcuadros[i].setBounds(10,10+30*i,100,20);
     this.getContentPane().add(vcuadros[i]);
     
 btnAceptar= new JButton();
 btnAceptar.setText("Aceptar");
 btnAceptar.setBounds(10,360,100,20);
 this.getContentPane().add(btnAceptar);
 
 btnAceptar.addActionListener(new ActionListener(){
     public void actionPerformed(ActionEvent evt){
         btnAceptarActionPerformed(evt);
     }
 });
 }
}
public void btnAceptarActionPerformed(ActionEvent evt){
    int i;
    int cont=0;
    for(i=0;i<vcuadros.length;i++){
        if(vcuadros[i].isSelected()){
            cont++;
        }
    }
    JOptionPane.showMessageDialog(null,"hay "+cont+" cuadros seleccionados");
}  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
