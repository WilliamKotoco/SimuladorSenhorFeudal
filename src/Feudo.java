public class Feudo {
    private final String nome;
    private int population;
    private double armyPercentage;
    private double resources;
    private Lord lord;

    public final int id;

    private Army army;

    public Feudo(String nome, int population, double armyPercentage, double resources, Lord lord, Army army, int id)
    {
        this.nome = nome;
        this.population = population;
        this.armyPercentage = armyPercentage;
        this.resources = resources;
        this.lord = lord;
        this.army = army;
        this.id = id;
    }

}
