import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Clinica {
    private PriorityQueue<Pacientes> listaPacientes;
    public Clinica(){
        listaPacientes=new PriorityQueue<Pacientes>();

    }
    public Pacientes atender() throws Exception{
        if(listaPacientes.isEmpty())
            throw new Exception("No existen pacientes");
        return listaPacientes.remove();
    }
    public void encolar(Pacientes p){
        listaPacientes.add(p);
    }
    public List<Pacientes> listaPacientes(){
        return listaPacientes.stream().collect(Collectors.toList());
    }
}
