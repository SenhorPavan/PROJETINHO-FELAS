package escola;

import Models.Aluno;
import Models.Coordenador;
import Models.Funcionario;
import Views.TelaInicial;
import java.util.ArrayList;

public class Escola {

    public static ArrayList<Aluno> listaAluno = new ArrayList<>();

    public static ArrayList<Coordenador> listaCoordenador = new ArrayList<>();

    public static ArrayList<Funcionario> listaProfessor = new ArrayList<>();

    public static void main(String[] args) {
        TelaInicial t = new TelaInicial();
        t.setVisible(true);
    }

}
