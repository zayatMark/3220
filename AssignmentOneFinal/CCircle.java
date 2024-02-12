/**
 * Represents a circle shape, which is a specific type of oval.
 */
class CCircle extends COval {
    /**
     * Constructs a circle shape with a given radius.
     *
     * @param radius The radius of the circle.
     */
    public CCircle(int radius) {
        super(radius, radius);
    }

    @Override
    public String getShapeString() {
        return "CIRCLE " + horizontalRadius;
    }
}