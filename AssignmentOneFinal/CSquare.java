/**
 * Represents a square shape, which is a specific type of rectangle.
 */
class CSquare extends CRectangle {
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