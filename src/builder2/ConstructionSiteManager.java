package builder2;

public class ConstructionSiteManager {

    private BuildingBuilder buildingBuilder;

    public ConstructionSiteManager(BuildingBuilder buildingBuilder) {
        this.buildingBuilder = buildingBuilder;
    }

    public void setBuildingBilder(BuildingBuilder buildingBuilder) {
        this.buildingBuilder = buildingBuilder;
    }

    public Building getBuilding() {
        return buildingBuilder.build();
    }


}
