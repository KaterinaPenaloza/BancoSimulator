package vista;

import controlador.RegistroCliente;
import controlador.Validador;
import javax.swing.JOptionPane;

public class Retirar extends javax.swing.JFrame {

    /**
     * Creates new form Retirar
     */
    public Retirar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgTipoCuenta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblRut = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        lblTipoCuenta = new javax.swing.JLabel();
        optAhorro = new javax.swing.JRadioButton();
        optCorriente = new javax.swing.JRadioButton();
        lblMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnRetirar = new javax.swing.JButton();
        lblMensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Retirar");

        jPanel1.setBackground(new java.awt.Color(213, 214, 255));

        lblRut.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        lblRut.setForeground(new java.awt.Color(51, 51, 51));
        lblRut.setText("Rut a retirar");

        txtRut.setBackground(new java.awt.Color(255, 255, 255));

        lblTipoCuenta.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        lblTipoCuenta.setForeground(new java.awt.Color(51, 51, 51));
        lblTipoCuenta.setText("Tipo de cuenta");

        optAhorro.setBackground(new java.awt.Color(255, 255, 255));
        optAhorro.setForeground(new java.awt.Color(0, 0, 0));
        optAhorro.setSelected(true);
        optAhorro.setText("Ahorro");

        optCorriente.setBackground(new java.awt.Color(255, 255, 255));
        optCorriente.setForeground(new java.awt.Color(0, 0, 0));
        optCorriente.setText("Corriente");

        lblMonto.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        lblMonto.setForeground(new java.awt.Color(51, 51, 51));
        lblMonto.setText("Monto a retirar");

        txtMonto.setBackground(new java.awt.Color(255, 255, 255));

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        lblMensajeError.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblRut)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblTipoCuenta)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(optAhorro)
                                .addGap(18, 18, 18)
                                .addComponent(optCorriente))
                            .addComponent(txtRut)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMensajeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblMonto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMonto)))))
                .addGap(102, 102, 102))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnRetirar)
                .addGap(159, 159, 159))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRut)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optCorriente)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTipoCuenta)
                        .addComponent(optAhorro)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblMonto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtMonto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnRetirar)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        String rut;
        char tipoCuenta;
        boolean ahorro, corriente;
        int monto1=0, monto2=0;
        String monto;

        //Validacion
        rut = txtRut.getText();
        if(Validador.validarTexto(rut) == false) {
            lblMensajeError.setText("*Ingrese rut");
            return;
        }
        else{
            lblMensajeError.setText("");
        }
        monto = txtMonto.getText();
        if(Validador.validarNumero(monto) == false){
            JOptionPane.showMessageDialog(null, "El monto a retirar debe ser un número", "Validación", JOptionPane.WARNING_MESSAGE);
            txtMonto.requestFocus();
            return;
        }
        else{
            monto1 = Integer.parseInt(monto);
            if(monto1<0){
                JOptionPane.showMessageDialog(null, "El monto a retirar debe ser un número positivo", "Validación", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                monto2 = monto1;
            }
        }
        ahorro = optAhorro.isSelected();
        corriente = optCorriente.isSelected();
        if(corriente){
            tipoCuenta = 'C';
        }
        else{
            tipoCuenta = 'A';
        }

        //Buscar si existe el cliente a retirar dinero
        if(RegistroCliente.buscar(rut, tipoCuenta)){
            //Encontrar el cliente a retirar dinero y retirarle
            RegistroCliente.eliminarSaldo(RegistroCliente.encontrar(rut, tipoCuenta), monto2);
            //Si el saldo queda negativo
                //Si es cuenta de ahorro
                if(tipoCuenta=='A'){
                    int x = RegistroCliente.encontrar(rut, tipoCuenta).getCuenta().getSaldo();
                    if(x<0){
                        JOptionPane.showMessageDialog(null, "No puede retirar ese monto", "Validación", JOptionPane.WARNING_MESSAGE);
                        RegistroCliente.agregarSaldo(RegistroCliente.encontrar(rut, tipoCuenta), monto2);
                        return;
                    }
                }
                //Si es cuenta corriente
                else{
                    int x = RegistroCliente.encontrar(rut, tipoCuenta).getCuenta().getSaldo();
                        if(x<-500000){
                            JOptionPane.showMessageDialog(null, "No puede retirar ese monto", "Validación", JOptionPane.WARNING_MESSAGE);
                            RegistroCliente.agregarSaldo(RegistroCliente.encontrar(rut, tipoCuenta), monto2);
                            return;
                        }
                }
            System.out.println(RegistroCliente.encontrar(rut, tipoCuenta).getCuenta().getSaldo());
            JOptionPane.showMessageDialog(null, "El monto ha sido retirado corectamente", "Retiro", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El rut al que intenta retirar dinero no existe", "Validación", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnRetirarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoCuenta;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensajeError;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblRut;
    private javax.swing.JLabel lblTipoCuenta;
    private javax.swing.JRadioButton optAhorro;
    private javax.swing.JRadioButton optCorriente;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
