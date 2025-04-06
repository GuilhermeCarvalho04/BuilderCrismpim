package br.edu.builder;

public class Casa2QuartosBanheirosChurrasqueira implements IBuilder {

    Casa casa = new Casa();

    public Casa2QuartosBanheirosChurrasqueira() {

        casa = new Casa (2,2,true);
    }

    @Override
    public void buildQuartos() {

        System.out.println("Um quarto 2,5 x 1,90 outro 2,3 x 1,80");
    }

    @Override
    public void buildBanheiros() {

        System.out.println("Dois banheiros 2,3 x 1,25");
    }

    @Override
    public void buildChurrasqueira() {

        System.out.println("Com churrasqueira");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}
