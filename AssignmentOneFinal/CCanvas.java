import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * Represents a canvas containing a list of shapes.
 */
class CCanvas {
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