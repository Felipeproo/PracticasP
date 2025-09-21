import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseMotionListener;

public class EventosMouseRueda extends JFrame {
    
    public EventosMouseRueda() {
        JLabel lblSaludo = new JLabel();
        lblSaludo.setBounds(25, 10, 350, 30);

        JLabel lblInstruccion = new JLabel("Ingresa tu nombre: ");
        lblInstruccion.setBounds(25, 165, 200, 30);

        JTextField campoSaludo = new JTextField(200);
        campoSaludo.setBounds(25, 200, 200, 30);

        JButton boton = new JButton("¡Saludar!");
        boton.setBounds(25, 235, 150, 30);

        // Labels para coordenadas (opcional)
        /*
        JLabel lblMovedX = new JLabel("Moved x: ");
        lblMovedX.setBounds(25, 10, 100, 30);
        JLabel lblMovedY = new JLabel("y: ");
        lblMovedY.setBounds(230, 10, 100, 30);
        JLabel lblDraggedX = new JLabel("Dragged x: ");
        lblDraggedX.setBounds(25, 40, 110, 30);
        JLabel lblDraggedY = new JLabel("y: ");
        lblDraggedY.setBounds(230, 40, 100, 30);
        */

        // Listener básico de mouse
        MouseListener listener = new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        };

        // Listener para la rueda del mouse
        MouseWheelListener wheel = new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                System.out.println("mouse wheel");
                if(e.getPreciseWheelRotation() == -1) {
                    System.out.println("rueda hacia arriba");
                }
                if(e.getPreciseWheelRotation() == 1) {
                    System.out.println("rueda hacia abajo");
                }
            }
        };

        // Listener para movimiento del mouse
        MouseMotionListener motionListener = new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("dragged");
                // Mostrar coordenadas
                /*
                lblDraggedX.setText("Dragged x: " + e.getX());
                lblDraggedY.setText("y: " + e.getY());
                */
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("moved");
                // Mostrar coordenadas
                /*
                lblMovedX.setText("Moved x: " + e.getX());
                lblMovedY.setText("y: " + e.getY());
                */
            }
        };

        // Agregar listeners
        boton.addMouseListener(listener);
        campoSaludo.addMouseListener(listener);
        campoSaludo.addMouseWheelListener(wheel);
        this.addMouseMotionListener(motionListener);

        add(lblSaludo);
        add(lblInstruccion);
        add(campoSaludo);
        add(boton);
        /*
        add(lblMovedX);
        add(lblMovedY);
        add(lblDraggedX);
        add(lblDraggedY);
        */

        setSize(400, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String args[]) {
        EventosMouseRueda objEventoMouse = new EventosMouseRueda();
    }
}