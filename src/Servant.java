public class Servant  extends  SocialClass{
private int satisfactionPoints;
private double monthProduction;
    public Servant(int age, int numberOfDescendents, int satisfactionPoints, double monthProduction) {
        super(age, numberOfDescendents);
        this.satisfactionPoints = satisfactionPoints;
        this.monthProduction = monthProduction;
    }
}
