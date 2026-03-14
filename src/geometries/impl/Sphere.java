package geometries.impl;

import geometries.api.Geometry;
import primitives.Point;
import primitives.Vector;
/**
 * Class Sphere represents a sphere in 3D space.
 */
public class Sphere extends Geometry {
	private final Point _center;
	private final double _radius;
	 /**
     * Constructor for sphere.
     *
     * @param center center point of the sphere
     * @param radius radius of the sphere
     */
    public Sphere(Point center, double radius) {
        _center = center;
        _radius = radius;
    }
    /**
     * Returns the normal vector to the sphere at a given point.
     *
     * @param point point on the sphere surface
     * @return normalized normal vector
     */
	@Override
	public Vector getNormal(Point point) {
        return null; /**point.subtract(_center).normalize();**/

	}

}
