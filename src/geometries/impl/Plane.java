package geometries.impl;

import geometries.api.Geometry;
import primitives.Point;
import primitives.Vector;

/**
 * Class Plane represents a plane in 3D space.
 * <p>
 * A plane is defined either by three non-collinear points
 * or by a point and a normal vector.
 */
public class Plane extends Geometry {

    /**
     * A point on the plane.
     */
    private final Point _point;

    /**
     * The normal vector of the plane.
     */
    private final Vector _normal;

    /**
     * Constructor using three points on the plane.
     * At this stage, the normal is initialized to null.
     *
     * @param p1 first point
     * @param p2 second point
     * @param p3 third point
     */
    public Plane(Point p1, Point p2, Point p3) {
        _point = p1;
        _normal = null;
    }

    /**
     * Constructor using a point and a normal vector.
     *
     * @param point point on the plane
     * @param normal normal vector to the plane
     */
    public Plane(Point point, Vector normal) {
        _point = point;
        _normal = normal.normalize();
    }

    /**
     * Returns the normal vector of the plane.
     *
     * @return the normal vector
     */
    public Vector getNormal() {
        return _normal;
    }

    /**
     * Returns the normal vector of the plane at a specific point.
     *
     * @param point point on the plane
     * @return the normal vector
     */
    @Override
    public Vector getNormal(Point point) {
        return _normal;
    }
}