class CCircle extends COval {
    public CCircle(int radius) {
        super(radius, radius);
    }

    @Override
    public String getShapeString() {
        return "CIRCLE " + horizontalRadius;
    }
}