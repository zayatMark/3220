import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class CCanvas {
    private final List<CShape> shapes;

    public CCanvas() {
        this.shapes = new ArrayList<>();
        generateRandomShapes();
    }

    private void generateRandomShapes() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            CShape randomShape = getRandomShape(random);
            addShape(randomShape);
        }
    }

    public void addShape(CShape shape) {
        if (!shapes.contains(shape)) {
            shapes.add(shape);
        }
    }

    public void display() {
        System.out.println("Canvas has the following random shapes:");

        for (CShape shape : shapes) {
            System.out.println("Shape " + shape.getId() + ": " + shape.getShapeString());
        }
    }

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