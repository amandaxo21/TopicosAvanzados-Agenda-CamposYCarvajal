import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelMenu extends JPanel implements ActionListener
{
  private JButton btnAlta, btnModificar, btnEliminar, btnConsultar;
  public static Agenda agenda;
  int cantidadPersonas;
  int cont;
  public PanelMenu()
  {
    //Color
    Color colorBtn=new Color(34, 129, 108);
    setLayout(new GridLayout(4,1));
    btnAlta = new JButton("Add");
    btnAlta.setForeground(colorBtn);
    btnAlta.addActionListener(this);    
    btnModificar = new JButton("Edit");
    btnModificar.setForeground(colorBtn);
    btnModificar.addActionListener(this);
    btnConsultar = new JButton("Consult");
    btnConsultar.setForeground(colorBtn);
    btnConsultar.addActionListener(this);    
    btnEliminar = new JButton("Delete");
    btnEliminar.setForeground(colorBtn);
    btnEliminar.addActionListener(this);
    
    
    add(btnAlta);
    add(btnModificar);
    add(btnConsultar);
    add(btnEliminar);
  }
  
   public void actionPerformed(ActionEvent e){
      if(e.getSource() == btnAlta) {
        if (cont == 0) {
            cantidadPersonas = Integer.parseInt(JOptionPane.showInputDialog(this,
                "Enter the number of people on the agenda: ",
                "Starting..."));
            agenda = new Agenda(cantidadPersonas);
            cont++;
        }
      if(cantidadPersonas > 0 ) {
            if (agenda.getCont() < cantidadPersonas){    
            JFrameAlta alta = new JFrameAlta();
            } else{
               JOptionPane.showMessageDialog(this,
                    "there is no more space in memory",
                    "Full agenda",
                    JOptionPane.INFORMATION_MESSAGE);
            }
        }      
      } else if (e.getSource() == btnModificar) {
         if (cont > 0){
            JFrameModificar modificar = new JFrameModificar();
        }
        else{
            JOptionPane.showMessageDialog(this,
                    "No people have been registered in the agenda",
                    "no empty data",
                    JOptionPane.INFORMATION_MESSAGE);
        }
         
      } else if (e.getSource() == btnConsultar) {
         if (cont > 0){
            JFrameConsulta modificar = new JFrameConsulta();
        }
        else{
            JOptionPane.showMessageDialog(this,
                    "No people have been registered in the agenda",
                    "No empty data",
                    JOptionPane.INFORMATION_MESSAGE);
        }

      } else if (e.getSource() == btnEliminar) {
         if (cont > 0){
            JFrameEliminar modificar = new JFrameEliminar();
        }
        else{
            JOptionPane.showMessageDialog(this,
                    "No people have been registered in the agenda",
                    "No empty data",
                    JOptionPane.INFORMATION_MESSAGE);
        }
      }
   }//metodo ActionPerformed

 }