import javax.swing.*;
import java.awt.*;

public class JFrameModificar extends JFrame
{
   PanelModificar mostrar = new PanelModificar();
   
    public JFrameModificar()
   {  

      initComponents();
   }
   
   private void initComponents()
   {
      setSize(300, 200);
      setTitle("Edit");
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setResizable(false);
      setContentPane(mostrar);
      setVisible(true);
      
      //Icono
      Image iconoPropio = Toolkit.getDefaultToolkit().getImage(getClass().getResource("modificar.png"));
      setIconImage(iconoPropio);
      setVisible(true);
   }   
}