package geometries.impl;

import primitives.Point;
import primitives.Vector;

/**
 * Class Sphere represents a sphere in 3D space.
 */
public class Sphere extends RadialGeometry {

    /**
     * The center point of the sphere.
     */
    private final Point _center;

    /**
     * Constructor for Sphere.
     *
     * @param center the center point
     * @param radius the radius of the sphere
     */
    public Sphere(Point center, double radius) {
        super(radius);
        _center = center;
    }

    @Override
    public Vector getNormal(Point point) {        
        return null;
    }
}