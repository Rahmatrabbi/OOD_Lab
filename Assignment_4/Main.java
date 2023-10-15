public class Main{
    public static void main(String[] args){
        Housing building = new Housing("Shaheed Habibur Rahman Hall");
        Housing fourthFloor = new Housing("Fourth Floor");

        Room washroom = new Room("4th floor washroom");
        Room commonArea = new Room("Common Room");
        Room boarderRoom = new Room("Number of room 20");
        building.addStructure(fourthFloor);
        fourthFloor.addStructure(boarderRoom);
        fourthFloor.addStructure(washroom);
        fourthFloor.addStructure(commonArea);

        building.enter();
        building.showLocation();
        fourthFloor.enter();
        fourthFloor.showLocation();
        fourthFloor.exit();
        building.exit();
    }
}