package vista;

import controlador.RegistroCliente;
import controlador.Validador;
import javax.swing.JOptionPane;

public class Depositar extends javax.swing.JFrame {

    /**
     * Creates new form Depositar
     */
    public Depositar() {
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
        lblTipoCuenta = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        optAhorro = new javax.swing.JRadioButton();
        optCorriente = new javax.swing.JRadioButton();
        lblMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();
        lblMensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Depositar");

        jPanel1.setBackground(new java.awt.Color(250, 230, 216));

        lblRut.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        lblRut.setForeground(new java.awt.Color(51, 51, 51));
        lblRut.setText("Rut a depositar");

        lblTipoCuenta.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        lblTipoCuenta.setForeground(new java.awt.Color(51, 51, 51));
        lblTipoCuenta.setText("Tipo de cuenta");

        txtRut.setBackground(new java.awt.Color(255, 255, 255));

        optAhorro.setBackground(new java.awt.Color(255, 255, 255));
        bgTipoCuenta.add(optAhorro);
        optAhorro.setForeground(new java.awt.Color(0, 0, 0));
        optAhorro.setSelected(true);
        optAhorro.setText("Ahorro");

        optCorriente.setBackground(new java.awt.Color(255, 255, 255));
        bgTipoCuenta.add(optCorriente);
        optCorriente.setForeground(new java.awt.Color(0, 0, 0));
        optCorriente.setText("Corriente");

        lblMonto.setFont(new java.awt.Font("Malgun Gothic", 1, 14)); // NOI18N
        lblMonto.setForeground(new java.awt.Color(51, 51, 51));
        lblMonto.setText("Monto a depositar");

        txtMonto.setBackground(new java.awt.Color(255, 255, 255));

        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        lblMensajeError.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMonto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMonto))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRut)
                            .addComponent(lblTipoCuenta))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(optAhorro)
                                .addGap(18, 18, 18)
                                .addComponent(optCorriente))
                            .addComponent(txtRut)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMensajeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDepositar)
                        .addGap(55, 55, 55)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRut)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoCuenta)
                    .addComponent(optAhorro)
                    .addComponent(optCorriente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMonto)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMensajeError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btnDepositar)
                        .addGap(32, 32, 32))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
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
            JOptionPane.showMessageDialog(null, "El monto a depositar debe ser un número", "Validación", JOptionPane.WARNING_MESSAGE);
            txtMonto.requestFocus();
            return;
        }
        else{
            monto1 = Integer.parseInt(monto);
            if(monto1<0){
                JOptionPane.showMessageDialog(null, "El monto a depositar debe ser un número positivo", "Validación", JOptionPane.WARNING_MESSAGE);
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

        if(RegistroCliente.buscar(rut, tipoCuenta)){
            
            RegistroCliente.agregarSaldo(RegistroCliente.encontrar(rut, tipoCuenta), monto2);
            System.out.println(RegistroCliente.encontrar(rut, tipoCuenta).getCuenta().getSaldo());
            JOptionPane.showMessageDialog(null, "El monto ha sido depositado corectamente", "Deposito", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "El rut al que intenta depositar no existe", "Validación", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnDepositarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgTipoCuenta;
    private javax.swing.JButton btnDepositar;
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
