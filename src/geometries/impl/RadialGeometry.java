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
    protected final double radius;

    /**
     * Squared radius (used for faster calculations).
     */
    protected final double radiusSquared;

    /**
     * Constructor for radial geometries.
     *
     * @param radius the radius of the geometry
     */
    public RadialGeometry(double radius) {
        this.radius = radius;
        this.radiusSquared = radius * radius;
    }
}
