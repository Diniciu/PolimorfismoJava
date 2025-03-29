package org.example.atividade;

public class Gerente extends Funcionario{
    private int matricula;

    public Gerente(String nome, String email, double salario, int matricula) {
        super(nome, email, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                '}';
    }
}
