public class Main {
    public static void main(String[] args) {
        System.out.println("Hello My old, but not loved friend, Java (: ");
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

        public Square(double side) {
            super(side, side);
        }

        @Override
        public void setWidth(double width) {
            super.setWidth(width);
            super.setHeight(width);
        }

        @Override
        public void setHeight(double height) {
            super.setHeight(height);
            super.setWidth(height);
        }
    }
}
