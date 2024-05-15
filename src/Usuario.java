import java.sql.SQLOutput;

public class Usuario {
    public static void main(String[] args) throws Exception{

//        exemplos de entradas
        SmartTv smartTv = new SmartTv();
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(27);

        System.out.println("TV está Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status - Ligada?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status - Desligada?" + smartTv.ligada);


    }
}