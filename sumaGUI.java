import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class sumaGUI {

    private Frame f;
    private Panel pan1, pan2, pan3, panOperaciones;
    private JLabel lblInstruccion1, lblInstruccion2, lblNum1, lblnum2, lblResultado;
    private TextField tfNum1, tfNum2, tfResultado;
    private Button btSalir, btCalcular;

    // Checkboxes para operaciones
    private CheckboxGroup grupoOperaciones;
    private Checkbox cbSuma, cbResta, cbMultiplicacion, cbDivision;

    public sumaGUI() {
        f = new Frame("Operaciones entre dos números");
        pan1 = new Panel();
        pan2 = new Panel();
        pan3 = new Panel();
        panOperaciones = new Panel();

        lblInstruccion1 = new JLabel("Instrucciones:");
        lblInstruccion2 = new JLabel("Ingrese los números y seleccione la operación deseada.");

        lblNum1 = new JLabel("Primer número:");
        lblnum2 = new JLabel("Segundo número:");
        lblResultado = new JLabel("Resultado:");

        tfNum1 = new TextField(5);
        tfNum2 = new TextField(5);
        tfResultado = new TextField(8);
        tfResultado.setEditable(false);

        btCalcular = new Button("Calcular");
        btSalir = new Button("Salir");

        // Inicializar checkboxes y grupo
        grupoOperaciones = new CheckboxGroup();
        cbSuma = new Checkbox("Suma", grupoOperaciones, true);
        cbResta = new Checkbox("Resta", grupoOperaciones, false);
        cbMultiplicacion = new Checkbox("Multiplicación", grupoOperaciones, false);
        cbDivision = new Checkbox("División", grupoOperaciones, false);
    }

    public void acomodarEnFrame() {
        btCalcular.addActionListener(new MnjBotonCalcular());
        btSalir.addActionListener(new MnjBotonSalir());

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });

        pan1.setLayout(new GridLayout(2, 1));
        pan1.add(lblInstruccion1);
        pan1.add(lblInstruccion2);
        f.add(pan1, BorderLayout.NORTH);

        pan2.setLayout(new GridLayout(3, 2));
        pan2.add(lblNum1);
        pan2.add(tfNum1);
        pan2.add(lblnum2);
        pan2.add(tfNum2);
        pan2.add(lblResultado);
        pan2.add(tfResultado);
        f.add(pan2, BorderLayout.CENTER);

        // Panel para operaciones
        panOperaciones.setLayout(new GridLayout(1, 4));
        panOperaciones.add(cbSuma);
        panOperaciones.add(cbResta);
        panOperaciones.add(cbMultiplicacion);
        panOperaciones.add(cbDivision);
        f.add(panOperaciones, BorderLayout.WEST);

        pan3.setLayout(new GridLayout(1, 2));
        pan3.add(btCalcular);
        pan3.add(btSalir);
        f.add(pan3, BorderLayout.SOUTH);

        f.setSize(400, 300);
        f.setVisible(true);
    }

    class MnjBotonCalcular implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                double n1 = Double.parseDouble(tfNum1.getText());
                double n2 = Double.parseDouble(tfNum2.getText());
                double res = 0;

                String operacion = grupoOperaciones.getSelectedCheckbox().getLabel();

                switch (operacion) {
                    case "Suma":
                        res = n1 + n2;
                        break;
                    case "Resta":
                        res = n1 - n2;
                        break;
                    case "Multiplicación":
                        res = n1 * n2;
                        break;
                    case "División":
                        if (n2 != 0) {
                            res = n1 / n2;
                        } else {
                            tfResultado.setText("Error: división por cero");
                            return;
                        }
                        break;
                }

                tfResultado.setText(Double.toString(res));
            } catch (NumberFormatException ex) {
                tfResultado.setText("Error: entrada inválida");
            }
        }
    }

    class MnjBotonSalir implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(-1);
        }
    }

    public static void main(String[] args) {
        sumaGUI ventana = new sumaGUI();
        ventana.acomodarEnFrame();
    }
}