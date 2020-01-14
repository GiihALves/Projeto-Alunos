public class Notas {
    public static void main(String[] args) {
        float nota1 = 4.6f;
        float nota2 = 6.1f;
        float nota3 = 1.9f;
        float nota4 = 2.5f
        double media = (nota1 + nota2 + nota3)/2;

        if (media >= 6.5){
            System.out.println("Aprovado");
        }
        else if (media > 5.0 && media < 6.5){
            System.out.println("Recuperação");
            if (media > 5.2 && media < 6.3){
                System.out.println("Vai ter que estudar");
            }
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
