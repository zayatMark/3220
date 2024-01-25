class CSquare extends CRectangle {
    public CSquare(int side) {
        super(side, side);
    }

    @Override
    public String getShapeString() {
        return "SQUARE " + length;
    }
}