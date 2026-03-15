package geometries.impl;

import primitives.Point;
import primitives.Ray;
import primitives.Vector;

/**
 * Class Tube represents an infinite cylinder in 3D space.
 */
public class Tube extends RadialGeometry {

    /**
     * The axis ray of the tube.
     */
    protected final Ray _axis;

    /**
     * Constructor to initialize the tube with an axis and a radius.
     *
     * @param axis   the axis ray of the tube
     * @param radius the radius of the tube
     */
    public Tube(double radius,Ray axis) {
        super(radius);
        _axis = axis;
    }

    @Override
    public Vector getNormal(Point point) {
        return null;
    }
}