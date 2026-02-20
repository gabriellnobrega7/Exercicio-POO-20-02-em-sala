package exercicio;

public class Triangulo {
    

    //Atributos:
    private int lado1;
    private int lado2;
    private int lado3;


    //Construtores: 

    Triangulo(int lado){

        this.lado1 = lado;
        this.lado2 = lado;
        this.lado3 = lado;
    }

    Triangulo(int lado1, int lado2){

        this.lado1 = lado1;
        this.lado2 = lado1;
        this.lado3 = lado2;
    }

    Triangulo(int lado1, int lado2, int lado3){

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    //Métodos:

    public int perimetro(){

        return lado1 + lado2 + lado3;

    }

    public void identificarTriangulo() {

    if(lado1 == lado2 && lado2 == lado3){
        System.out.println("Esse triângulo é: Equilátero");
    }

    else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
        
        System.out.println("Esse Triângulo é: Escaleno");

    }
    else{
        System.out.println("Esse triângulo é Isósceles");
    }
    }
    public void mostrarInformacoes(){

        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.println("Perímetro: " + perimetro());
        identificarTriangulo();
}


    

    }

