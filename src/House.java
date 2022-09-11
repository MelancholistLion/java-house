class House {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom[] restRooms = new RestRoom[10];
    private BedRoom[] bedRooms = new BedRoom[10];
    private Yard yard;

    public void addBedRoom(BedRoom[] bedRooms) {
        this.bedRooms = bedRooms;
    }

    public void addRestRoom(RestRoom[] restRooms) {
        this.restRooms = restRooms;
    }

    public RestRoom[] getRestRooms() {
        return restRooms;
    }

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }
}
