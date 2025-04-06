package br.edu.builder;

public class Casa {

    private int quartos;

    private int banheiros;

    private boolean churrasuqueira;

    public Casa(){}

    public Casa(int quartos, int banheiros, boolean churrasuqueira) {
        this.quartos = quartos;
        this.banheiros = banheiros;
        this.churrasuqueira = churrasuqueira;

    }
     public int getQuartos() {return quartos;}
    public int getBanheiros() {return banheiros;}
    public boolean isChurrasuqueira() {return churrasuqueira;}

}
