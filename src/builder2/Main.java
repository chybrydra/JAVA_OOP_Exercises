package builder2;

public class Main {
    public static void main(String[] args) {
        //user-data skyscraper
        BuildingBuilder builder = new SkyscraperBuilder();
        ((SkyscraperBuilder) builder).composeOwnBuilding(3.5, true, 15);
        ConstructionSiteManager manager = new ConstructionSiteManager(builder);
        System.out.println(manager.getBuilding().toString());

        //default skyscraper
        BuildingBuilder builder2 = new SkyscraperBuilder();
        ((SkyscraperBuilder)builder2).composeBuilding(new Building());
        ConstructionSiteManager manager2 = new ConstructionSiteManager(builder2);
        System.out.println(manager2.getBuilding().toString());
    }
}
