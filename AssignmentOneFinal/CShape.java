/**
 * An abstract class representing a shape.
 */
abstract class CShape {
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