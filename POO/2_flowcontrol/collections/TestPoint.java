// Ejemplo de la importancia de sobreescribir los mEtodos equals y hashCode

import java.util.HashSet;
import java.util.Set;

public class TestPoint {

    public static void main(String[] args) {

        final Point p1 = new Point(10, 20);
        final Point p2 = new Point(60, 30);
        final Point p3 = new Point(10, 20);

        final Set<Point> points = new HashSet<Point>();
        points.add(p1);
        points.add(p2);
        points.add(p3);

        System.out.println(points);
	System.out.println(p1.hashCode());
        System.out.println(p3.hashCode());
    }
}
