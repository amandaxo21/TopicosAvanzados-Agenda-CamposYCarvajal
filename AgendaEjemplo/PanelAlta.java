import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelAlta extends JPanel implements ActionListener {
  int celda;
  public static PanelMenu cont;
  private JButton btnGuardar, btnCancelar;
  private JTextField txtNombre, txtDireccion, txtTel, txtCorreo;
  
    
  PanelAlta()
  {
    setLayout(new GridLayout(7,2));
    JLabel lblNombre = new JLabel("Name: ", JLabel.RIGHT);
    txtNombre = new JTextField(15);
    add(lblNombre);
    add(txtNombre);
    
    JLabel lblDireccion = new JLabel("Adress ", JLabel.RIGHT);
    txtDireccion = new JTextField(20);
    add(lblDireccion);
    add(txtDireccion);
    
    JLabel lblTel = new JLabel("Cell phone number: ", JLabel.RIGHT);
    txtTel = new JTextField(15);
    add(lblTel);
    add(txtTel);

    JLabel lblCorreo = new JLabel("email: ", JLabel.RIGHT);
    txtCorreo = new JTextField(20);
    add(lblCorreo);
    add(txtCorreo);

    
    btnGuardar = new JButton("Search");
    btnGuardar.addActionListener(this);
    btnCancelar = new JButton("Save");
    btnCancelar.addActionListener(this);
    
    txtDireccion.setEditable(false);
    txtTel.setEditable(false);
    txtCorreo.setEditable(false);
    btnCancelar.setEnabled(false);

    
    add(btnGuardar);
    add(btnCancelar);
  }
  
 public void actionPerformed(ActionEvent e) {
     if(e.getSource() == btnGuardar) {
         if(txtNombre.getText() == null || txtNombre.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "Please put the name",
          "Warning", JOptionPane.INFORMATION_MESSAGE);
          txtNombre.requestFocus();
        } else {
          String nombre = txtNombre.getText();
          int celda = PanelMenu.agenda.getCelda(nombre);
          if (celda == -1) {
            txtDireccion.setEditable(true);
            txtTel.setEditable(true);
            txtCorreo.setEditable(true);
            btnCancelar.setEnabled(true);
            txtDireccion.requestFocus();
          } else {
            JOptionPane.showMessageDialog(this,
                     "confirmed deletion",
                     "Nombre repetido",
                     JOptionPane.ERROR_MESSAGE);
          }
        }
     }
     
     if(e.getSource() == btnCancelar) {
        if(txtTel.getText() == null || txtTel.getText().isEmpty()) {
          JOptionPane.showMessageDialog(null, "Capture the cell phone",
          "Warning", JOptionPane.INFORMATION_MESSAGE);
          txtTel.requestFocus();
        } else {
            String nombre, direccion, tel, correo;
            nombre = txtNombre.getText();
            direccion = txtDireccion.getText();
            tel = txtTel.getText();
            correo = txtCorreo.getText();
            PanelMenu.agenda.agregar(nombre, direccion, tel, correo);
            JOptionPane.showMessageDialog(null, "Saved data, please close window Agregar",
          "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
 
     }
     
     
     
     
     
     
     
     /*if(e.getSource() == btnGuardar){
        if(txtNombre.getText() == null || txtNombre.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Debes colocar al menos el nombre",
          "Aviso", JOptionPane.INFORMATION_MESSAGE);
          txtNombre.requestFocus();
        }
        else
        if(txtTel.getText() == null || txtTel.getText().isEmpty())
        {
          JOptionPane.showMessageDialog(null, "Debes capturar el telefono celular",
          "Aviso", JOptionPane.INFORMATION_MESSAGE);
          txtTel.requestFocus();
        }
       else
       {
         PanelMenu.agenda.agregar(txtNombre.getText(), txtDireccion.getText(), txtTel.getText(),txtCorreo.getText());
         JOptionPane.showMessageDialog(null, "Se guardaran los datos",
          "Aviso", JOptionPane.INFORMATION_MESSAGE);      
       }
    }*/
    
    }

}
