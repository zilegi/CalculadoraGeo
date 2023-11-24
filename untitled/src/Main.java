import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media;
        int faltas ;
        boolean comportamento;
        String opcao="";

        while (!opcao.equalsIgnoreCase("sair")) {
            try {
                System.out.println("Insira a média do aluno: [0-10]");
                media = Double.parseDouble(input.nextLine());
                System.out.println("Insira as faltas do aluno: [0-100]");
                faltas = Integer.parseInt(input.nextLine());
                System.out.println("Este aluno apresentou bom comportamento? [Y] para sim [Qualquer tecla] para não" );
                comportamento = input.nextLine().equalsIgnoreCase("Y");

            } catch (Exception e) {
                System.out.println("Você digitou opções invalidas");
                continue;
            }
            if (media>=5.0 && faltas<25 && comportamento){
                System.out.println("Este aluno foi aprovado");
            }
            else if (media<5.0 && faltas<25 && comportamento) {
                System.out.println("Este aluno fara recuperação");
            }
            else if (media>= 5.0 && faltas>=25 && comportamento){
                System.out.println("Este aluno ficará sem férias");
            }
            else if (media>=5.0&& faltas<25 && !comportamento) {
                System.out.println("Chamaremos este aluno para conversar");
            } else {
                System.out.println("Este aluno foi reprovado");
            }
            System.out.println("Digite sair para encerrar ou qualquer tecla para executar novamente");
            opcao=input.nextLine();
        }
    }
}