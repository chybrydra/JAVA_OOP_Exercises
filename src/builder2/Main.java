package builder2;

public class Main {
    public static void main(String[] args) {
        BuildingBuilder builder = new SkyscraperBuilder();

        ConstructionSiteManager manager = new ConstructionSiteManager(builder);

        System.out.println(manager.getBuilding().toString());
    }
}
