abstract class CShape {
    private static int idCounter = 1;
    protected int id;

    public CShape() {
        this.id = idCounter++;
    }

    public int getId() {
        return id;
    }

    public abstract String getShapeString();
}