package builder2;

public class SkyscraperBuilder extends BuildingBuilder {

        public void composeBuilding() {
            building = new Building();
            building.setFloorHeight(3.0);
            building.setGarage(true);
            building.setNumberOfFloors(30);
            building.setType(BuildingType.SKYSCRAPER);
        }

        public Building build() {
            composeBuilding();
            return building;
        }
}
