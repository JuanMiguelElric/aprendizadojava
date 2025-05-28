package condicoes.desafio;

public class Ninja {

    public static void main(String[] args) {
        String nome1 = "Naruto";
        String nome2 = "Sasuke";
        String nome3 = "Neji";
        int idade1 = 20;
        int idade2 = 15;
        int idade3 =26;
        String missao1= "pular 10 muros";
        String missao2 = "pescar 20 peixes";
        String missao3 = "limpaar o chiqueiro";

        if(nome1 == "Naruto" && idade1 == 20){
            System.out.printf(missao1);
        } else if (nome2 == "Sasuke" && idade2 == 15) {
            System.out.printf(missao2);
        } else if (nome3 == "Neji" && idade3 == 26) {
            System.out.printf(missao3);

        }

    }
}
