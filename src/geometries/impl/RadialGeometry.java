package geometries.impl;

import geometries.api.Geometry;
/**
 * Abstract base class for geometries that have a radius.
 * Examples: Sphere, Tube, Cylinder.
 */
public abstract class RadialGeometry extends Geometry {

	/**
     * Radius of the geometry.
     */
    protected final double _radius;

    /**
     * Squared radius (used for faster calculations).
     */
    protected final double _radiusSquared;

    /**
     * Constructor for radial geometries.
     *
     * @param radius the radius of the geometry
     */
    public RadialGeometry(double radius) {
        _radius = radius;
        _radiusSquared = radius * radius;
    }
}
