package geometries.impl;

import geometries.api.Geometry;
import primitives.Point;
import primitives.Ray;
import primitives.Vector;
/**
 * Class Tube represents an infinite cylindrical tube in 3D space.
 */
public class Tube extends Geometry {
	/**
     * Axis of the tube.
     */
    private final Ray _axis;

    /**
     * Radius of the tube.
     */
    private final double _radius;
    /**
     * Constructor
     */
    public Tube(double radius, Ray axis) {
        _axis = axis;
        _radius = radius;
    }
    
	@Override
	public Vector getNormal(Point point) {
		return null;
	}

}
