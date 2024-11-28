public class BuilderPattern {

static class House {
    private int rooms;
    private String roofType;
    private boolean hasGarden;

    private House(HouseBuilder builder) {
        this.rooms = builder.rooms;
        this.roofType = builder.roofType;
        this.hasGarden = builder.hasGarden;
    }
    public String toString() {
        return "House has " + rooms + " rooms, " + roofType + " typed roof and  Garden status is " + hasGarden + "";
    }

    // Builder Class
    static class HouseBuilder {
        private int rooms;
        private String roofType;
        private boolean hasGarden;

        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setRoofType(String roofType) {
            this.roofType = roofType;
            return this;
        }

        public HouseBuilder setHasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        // Build the House object
        public House build() {
            return new House(this);
        }
    }
}


    public static void main(String[] args) {
        // Create a house using the Builder
        House smallHouse = new House.HouseBuilder()
                .setRooms(2)
                .setRoofType("Flat Roof")
                .setHasGarden(false)
                .build();

        System.out.println(smallHouse);
    }

    
}
