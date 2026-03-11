package geometries.impl;
import primitives.Ray;
/**
 * Class Cylinder represents a finite cylinder in 3D space.
 * A cylinder is a tube with a finite height.
 */
public class Cylinder extends Tube {
	 /**
     * Height of the cylinder.
     */
	private final double _height;
	 /**
     * Constructor for cylinder.
     *
     * @param axis axis ray of the cylinder
     * @param radius radius of the cylinder
     * @param height height of the cylinder
     */
	public Cylinder(double radius,Ray axis, double height) {
        super(radius,axis);
        _height = height;
    }
}
