package exercicio;

public class Main {
    

    public static void main(String[] args) {
        
        Triangulo t1 = new Triangulo(4);
        Triangulo t2 = new Triangulo(2, 3);
        Triangulo t3 = new Triangulo(3, 4, 5);

        t1.mostrarInformacoes();
        t2.mostrarInformacoes();
        t3.mostrarInformacoes();


    }
}