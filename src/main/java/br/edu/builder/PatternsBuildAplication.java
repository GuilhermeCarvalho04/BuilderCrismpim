package br.edu.builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class PatternsBuildAplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternsBuildAplication.class, args);
        IBuilder builderCasa1 = new Casa2Quartos();
        builderCasa1.buildQuartos();
        builderCasa1.buildBanheiros();
        builderCasa1.buildChurrasqueira();
        Casa casa1 = builderCasa1.getCasa();

        System.out.println("Casa 1");
        System.out.println("Quartos:  " + casa1.getQuartos());
        System.out.println("Banheiros: " + casa1.getBanheiros());
        System.out.println("Churrasqueira:"  + casa1.isChurrasuqueira());

        System.out.println("------------------------------");

    }

}
