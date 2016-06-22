package hospital;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Paciente paciente1;
        paciente1 = new Paciente();
        paciente1.setNome("Nome lindo");
        System.out.println(paciente1.getNome());  
    }
}
