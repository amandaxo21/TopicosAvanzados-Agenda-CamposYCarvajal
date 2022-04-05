import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelIngresar extends JPanel implements ActionListener
{
  private JButton btnIngresar, btnSalir;
  private JTextField txtUser;
  private JPasswordField passContra;
  
  public PanelIngresar(){
  
     Color colorBtn=new Color(70, 74, 72);
     Color colorBtnOp=new Color(60, 110, 79);
     setLayout(new GridLayout(3,2));
     JLabel lblUsuario = new JLabel("User: ", JLabel.RIGHT);
     txtUser = new JTextField(14);
     lblUsuario.setForeground(colorBtnOp);
     add(lblUsuario);
     add(txtUser);
     
     JLabel lblcontra = new JLabel("Password: ", JLabel.RIGHT);
     passContra = new JPasswordField(15);
     lblcontra.setForeground(colorBtnOp);
     passContra.setToolTipText("Ingrese Contraseña");
     passContra.setForeground(Color.BLACK);
     add(lblcontra);
     add(passContra);
     
     btnIngresar = new JButton("Sing in");
     btnIngresar.setBackground(colorBtn);
     btnIngresar.setForeground(Color.WHITE);
     btnIngresar.addActionListener(this);
     btnSalir = new JButton("Exit");
     btnSalir.setBackground(colorBtn);
     btnSalir.setForeground(Color.WHITE);
     btnSalir.addActionListener(this);
     add(btnIngresar);
     add(btnSalir);
  }
  
  public void actionPerformed(ActionEvent e){
   String usuario = txtUser.getText();
   String contra = new String(passContra.getPassword());
   
   if(e.getSource()== btnIngresar){
     if(usuario.isEmpty() && contra.isEmpty())
     {
       JOptionPane.showMessageDialog(null, "Enter username and password");
       txtUser.requestFocus();
     }
     else
     {
      if(usuario.equals("User123") && contra.equals("3411"))
      { 
        JOptionPane.showMessageDialog(null, "¡¡¡Welcome!!!");
        JFrameMenu fMenu = new JFrameMenu();
      }
     else
     {
      JOptionPane.showMessageDialog(null, "User or password wrong");
      txtUser.setText(null);
      passContra.setText(null);
      txtUser.requestFocus();
     }//else usuario
    }//else empty
   }//if boton Ingresar
   
   if(e.getSource() == btnSalir)
   {
     System.exit(0);
   }
  }//metodo ActionPerformed
 }