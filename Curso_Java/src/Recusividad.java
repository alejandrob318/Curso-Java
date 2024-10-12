public class Recusividad {

    private void limpiar(int num){
        if(num == 0){
            return;
        }
        else{
            limpiar(num - 1);
            System.out.println(num);
        }
    }


    public static void main(String[] args) {

        Recusividad recusividad = new Recusividad();

        recusividad.limpiar(5);


    }
}