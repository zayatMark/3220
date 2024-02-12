/**
 * Represents a rectangle shape.
 */
class CRectangle extends CShape {
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