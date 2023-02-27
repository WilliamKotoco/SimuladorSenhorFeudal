public class Feudo {
    private final String nome;
    private int population;
    private float armyPercentage;
    private double resources;
    private Lord lord;

    private Army army;

    public Feudo(String nome, int population, float armyPercentage, double resources, Lord lord, Army army)
    {
        this.nome = nome;
        this.population = population;
        this.armyPercentage = armyPercentage;
        this.resources = resources;
        this.lord = lord;
        this.army = army;
    }

}
