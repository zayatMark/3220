class CRectangle extends CShape {
    protected final int length;
    protected final int width;

    public CRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String getShapeString() {
        return "RECTANGLE " + length + "x" + width;
    }
}