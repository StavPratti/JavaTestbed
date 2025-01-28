package gr.aueb.cf.ch13.immutable;

/**
 * Point3D should be immutable.
 */
public class Point3D {
    private final Point point;
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
        this.point = new Point(point.getX(), point.getY()); // deep copy
        this.z = z;
    }


    // the reference is not being copied
    public Point getPoint() {
        return new Point(point.getX(), point.getY()); // deep copy
    }

    public int getZ() {
        return z;
    }
}