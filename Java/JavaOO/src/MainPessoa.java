public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Pessoa p1 = new Pessoa();

    System.out.print("Digite o nome: ");
    p1.nome = sc.nextLine();

    System.out.print("Digite a idade: ");
    p1.idade = sc.nextInt();

    p1.apresentar();
    p1.fazerAniversario();
    p1.apresentar();}