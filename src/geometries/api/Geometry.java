package geometries.api;

import primitives.Point;
import primitives.Vector;

/**
 * Abstract base class for all geometric objects.
 * A geometry represents a surface in 3D space.
 * Each geometry must be able to compute the normal vector
 * to its surface at a given point.
 */
public abstract class Geometry {

	 /**
     * Default constructor for Geometry.
     */
    public Geometry() {}

    /**
     * Returns the normal vector to the geometry at the given point.
     *
     * @param point a point on the surface of the geometry
     * @return the normal vector at that point
     */
	
    public abstract Vector getNormal(Point point);
}