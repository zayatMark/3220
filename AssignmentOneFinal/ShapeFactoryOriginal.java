import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A class representing a shape factory that generates random shapes on a canvas.
 */

public class ShapeFactoryOriginal {

    /**
     * An abstract class representing a shape.
     */
    abstract static class CShape {
        private static int idCounter = 1;
        protected int id;

        /**
         * Constructs a shape and assigns a unique ID to it.
         */
        public CShape() {
            this.id = idCounter++;
        }

        /**
         * Gets the ID of the shape.
         *
         * @return The ID of the shape.
         */
        public int getId() {
            return id;
        }

        /**
         * An abstract method to get the string representation of the shape.
         *
         * @return A string representation of the shape.
         */
        public abstract String getShapeString();
    }

    /**
     * Represents an oval shape.
     */
    static class COval extends CShape {
        protected final int horizontalRadius;
        protected final int verticalRadius;

        /**
         * Constructs an oval shape with given horizontal and vertical radii.
         *
         * @param horizontalRadius The horizontal radius of the oval.
         * @param verticalRadius   The vertical radius of the oval.
         */
        public COval(int horizontalRadius, int verticalRadius) {
            this.horizontalRadius = horizontalRadius;
            this.verticalRadius = verticalRadius;
        }

        /**
         * Gets the string representation of the oval shape.
         *
         * @return A string representation of the oval shape.
         */
        @Override
        public String getShapeString() {
            return "OVAL " + horizontalRadius + "x" + verticalRadius;
        }
    }

    /**
     * Represents a circle shape, which is a specific type of oval.
     */
    static class CCircle extends COval {
        /**
         * Constructs a circle shape with a given radius.
         *
         * @param radius The radius of the circle.
         */
        public CCircle(int radius) {
            super(radius, radius);
        }

        /**
         * Gets the string representation of the circle shape.
         *
         * @return A string representation of the circle shape.
         */
        @Override
        public String getShapeString() {
            return "CIRCLE " + horizontalRadius;
        }
    }

    /**
     * Represents a rectangle shape.
     */
    static class CRectangle extends CShape {
        protected final int length;
        protected final int width;

        /**
         * Constructs a rectangle shape with given length and width.
         *
         * @param length The length of the rectangle.
         * @param width  The width of the rectangle.
         */
        public CRectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        /**
         * Gets the string representation of the rectangle shape.
         *
         * @return A string representation of the rectangle shape.
         */
        @Override
        public String getShapeString() {
            return "RECTANGLE " + length + "x" + width;
        }
    }

    /**
     * Represents a square shape, which is a specific type of rectangle.
     */
    static class CSquare extends CRectangle {
        /**
         * Constructs a square shape with a given side length.
         *
         * @param side The side length of the square.
         */
        public CSquare(int side) {
            super(side, side);
        }

        /**
         * Gets the string representation of the square shape.
         *
         * @return A string representation of the square shape.
         */
        @Override
        public String getShapeString() {
            return "SQUARE " + length;
        }
    }

    /**
     * Represents a canvas containing a list of shapes.
     */
    static class CCanvas {
        private final List<CShape> shapes;

        /**
         * Constructs a canvas and initializes it with 10 random shapes.
         */
        public CCanvas() {
            this.shapes = new ArrayList<>();
            generateRandomShapes();
        }

        /**
         * Generates 10 random shapes and adds them to the canvas.
         */
        private void generateRandomShapes() {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                CShape randomShape = getRandomShape(random);
                addShape(randomShape);
            }
        }

        /**
         * Adds a shape to the canvas, ensuring no duplicates.
         *
         * @param shape The shape to add.
         */
        public void addShape(CShape shape) {
            if (!shapes.contains(shape)) {
                shapes.add(shape);
            }
        }

        /**
         * Displays the contents of the canvas.
         */
        public void display() {
            System.out.println("Canvas has the following random shapes:");

            for (CShape shape : shapes) {
                System.out.println("Shape " + shape.getId() + ": " + shape.getShapeString());
            }
        }

        /**
         * Generates a random shape.
         *
         * @param random An object for generating dimensions.
         * @return A random shape.
         */
        private CShape getRandomShape(Random random) {
            int choice = random.nextInt(4);

            return switch (choice) {
                case 0 -> new CCircle(random.nextInt(100) + 1);
                case 1 -> new COval(random.nextInt(100) + 1, random.nextInt(100) + 1);
                case 2 -> new CRectangle(random.nextInt(100) + 1, random.nextInt(100) + 1);
                case 3 -> new CSquare(random.nextInt(100) + 1);
                default -> throw new IllegalArgumentException("Invalid choice");
            };
        }
    }

    /**
     * The main method to instantiate a canvas with random shapes and display them.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        CCanvas canvas = new CCanvas();
        canvas.display();
    }
}

