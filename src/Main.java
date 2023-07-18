public class Main {
    public static void main(String[] args) {
        System.out.println("Hello My old, but not loved friend, Java (: ");

        Square square = new Square(5);
        System.out.println(square.calculateArea());
    }

    public static class Rectangle {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double calculateArea() {
            return width * height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }
    }

    public static class Square extends Rectangle {
        protected double side;

        public Square(double side) {
            super(side, side);
            this.side = side;
        }
        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
            setWidth(side);
            setHeight(side);
        }


        @Override
        public double calculateArea() {
            return 4 * getSide();
        }
    }
}
