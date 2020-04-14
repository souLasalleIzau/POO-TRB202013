class Main {
  public static void main(String[] args) {
    Funcionario func1 = new Funcionario("Fulano de tal", "628.424.171-27", 2500);
    
    Funcionario func2 = new Funcionario("Tal de fulano", "494.052.717-41", 3000);

    Gerente ger = new Gerente("Fulano gerente", "471.874.896-84", 5000, 123);

    System.out.println("A bonificação do funcinario 1 é: "+func1.getBonificacao());

    System.out.println("A bonificação do funcinario 2 é: "+func2.getBonificacao());

    ger.autentica(321);

    System.out.println("A bonificação do gerente é: "+ger.getBonificacao());
  }
}