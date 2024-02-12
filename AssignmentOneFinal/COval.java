class COval extends CShape {
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