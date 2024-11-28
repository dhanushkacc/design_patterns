public class AdapterPattern {

    static class RoundHole {
        public RoundHole() {
            System.out.println("RoundHole created");
        }

        public void insert() {
            System.out.println("Peg inserted into round hole");
        }
    }

    static class SquarePeg {
        private int pins;

        public SquarePeg(int num_of_pins) {
            this.pins = num_of_pins;
            System.out.println("SquarePeg with " + pins + " pins created");
        }

        public int getPins() {
            return pins;
        }
    }

    static class Adapter extends RoundHole {
        private SquarePeg peg;

        public Adapter(SquarePeg peg) {
            this.peg = peg;
        }

        @Override
        public void insert() {
            System.out.println("SquarePeg with " + peg.getPins() + " pins connected to round hole");
        }
    }

    public static void main(String[] args) {
        System.out.println("Adapter Pattern Example");

        SquarePeg squarePeg = new SquarePeg(6);
        RoundHole roundHole = new Adapter(squarePeg);
        roundHole.insert();
    }
}
