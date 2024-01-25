class COval extends CShape {
    protected final int horizontalRadius;
    protected final int verticalRadius;

    public COval(int horizontalRadius, int verticalRadius) {
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    @Override
    public String getShapeString() {
        return "OVAL " + horizontalRadius + "x" + verticalRadius;
    }
}