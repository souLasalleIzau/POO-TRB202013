public class Funcionario {
  private String nome;
  private String CPF;
  private double salario;

  public Funcionario (String nome, String CPF, double salario) {
    this.nome = nome;
    this.CPF = CPF;
    this.salario = salario;
  }

  public double getBonificacao () {
    return this.salario * 0.1;
  }

  public String getNome () {
    return this.nome;
  } 

  public String getCPF () {
    return this.CPF;
  }

  public double getSalario () {
    return this.salario;
  }

  public void setNome (String nome) {
    this.nome = nome;
  } 

  public void setCPF (String CPF) {
    this.CPF = CPF;
  }

  public void setSalario (double salario) {
    this.salario = salario;
  } 
}