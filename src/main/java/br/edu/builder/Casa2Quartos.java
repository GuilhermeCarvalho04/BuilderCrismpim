package br.edu.builder;


public class Casa2Quartos implements IBuilder {

    Casa casa = new Casa();

    public Casa2Quartos() {

        casa = new Casa(1, 2,false);
    }

 @Override
    public void buildQuartos() {
        System.out.println("Um quarto 2,5 x 1,90 outro 2,3 x 1,80");
 }
    @Override
    public void buildBanheiros() {
        System.out.println("Banheiro 2,3 x 1,25");
    }

    @Override
    public void buildChurrasqueira() {
        System.out.println("Sem churrasqueira");
    }

    @Override
    public Casa getCasa() {
        return casa;
    }
}

