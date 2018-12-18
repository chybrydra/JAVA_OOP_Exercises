package builder2;

public class SkyscraperBuilder extends BuildingBuilder {

    public void composeBuilding(Building building) {
        buildingMode = BuildingMode.DEFAULT_BUILDING;
        this.building = building;
        building.setFloorHeight(3.0);
        building.setGarage(true);
        building.setNumberOfFloors(30);
        building.setType(BuildingType.SKYSCRAPER);
    }

    public void composeOwnBuilding(double floorHeight, boolean isGarage, int numberOfFloors){
        buildingMode = BuildingMode.USER_BUILDING;
        building = new Building();
        building.setFloorHeight(floorHeight);
        building.setGarage(isGarage);
        building.setNumberOfFloors(numberOfFloors);
        building.setType(BuildingType.SKYSCRAPER);

    }

        public Building build(Building building) {
            if (buildingMode == BuildingMode.DEFAULT_BUILDING) {
                composeBuilding(building);
            }
            if (buildingMode == BuildingMode.USER_BUILDING) {
                composeOwnBuilding(building.getFloorHeight(), building.isGarage(), building.getNumberOfFloors());
            }
            return building;
        }
}
