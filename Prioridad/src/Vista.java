import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Vista {
    private JPanel principal;
    private JComboBox cboPrioridad;
    private JTextField txtNombre;
    private JTextArea textSintomas;
    private JButton btnInsertae;
    private JList lstPacientes;
    private Clinica clinica = new Clinica();
    public Vista(){

        btnInsertae.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int prioridad=Integer.parseInt(cboPrioridad.getSelectedItem().toString());
                String nombre = txtNombre.getText();
                String sintomas = textSintomas.getText();
                clinica.encolar(new Pacientes(prioridad, nombre, sintomas));
                llenarJlist();
            }
        });
    }
    public void llenarJlist(){
        DefaultListModel dlm=new DefaultListModel();
        Stream<Pacientes> ordenado=clinica.listaPacientes().stream().sorted();
        for(Pacientes p:ordenado.collect(Collectors.toList())){
            dlm.addElement(p);
        }
        lstPacientes.setModel(dlm);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vista");
        frame.setContentPane(new Vista().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
