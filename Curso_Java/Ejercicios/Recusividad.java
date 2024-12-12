public class Ejercicio1 {

    public static int factorial(int numero){
        if(numero == 0){
            return 1;
        }else{
            return numero * factorial(numero - 1);
        }


    }

    public static void main(String[] args) {

        int numeroFactorizado = factorial(2);

        System.out.println(numeroFactorizado);

    }
}