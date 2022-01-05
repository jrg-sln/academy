public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(final int y) {
        this.y = y;
    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder();
        sb.append("Point = {");
        sb.append(super.toString());
        sb.append(", x = ").append(x);
        sb.append(", y = ").append(y);
        sb.append('}');
        return sb.toString();
    }


   @Override
    public boolean equals(final Object object) {
        if (this == object)
		return true;
        if (!(object instanceof Point))
		return false;
        final Point point = (Point) object;
        return (this.x == point.x) && (this.y == point.y);
    }

    @Override
    public int hashCode() {
        return x * 31 + y;
    }
}
