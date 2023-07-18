public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
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

    }
}
