public class Gerente extends Funcionario {
  private int senhaEspecial;
  private int numeroDeFuncionariosGerenciados;

  public Gerente (String nome, String CPF, double salario, int senhaEspecial) {
    super(nome, CPF, salario);
    this.senhaEspecial = senhaEspecial;
  }

  public double getBonificacao () {
    return super.getBonificacao() + 1000;
  }

  public void autentica (int senha) {
    if (this.senhaEspecial == senha) {
      System.out.println("Acesso liberado.");
    } else {
      System.out.println("Acesso negado.");
    }
  }

  public int getNumeroDeFuncionariosGerenciados () {
    return this.numeroDeFuncionariosGerenciados;
  }

  public void setNumeroDeFuncionariosGerenciados (int valor) {
    this.numeroDeFuncionariosGerenciados = valor;
  }
}