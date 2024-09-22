public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        //Tipos Primitivos

        byte idade = 123;
        short ano = 2021;
        int cep = 2170333; //Se começar com zero, talez tenha que ser outro tipo
        long cpf = 974753464L; //Se começar com zero, talez tenha que ser outro tipo. Encerrando com "L" para representar para o java que é literal
        float pi = 3.14F;
        double salario = 1275.33;

        //Tipo texto na aplicação
        String meuNome = "Gustavo";

        //TiposEVariaveis

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        //ExemploVariavel

        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14;
        
    }
}
