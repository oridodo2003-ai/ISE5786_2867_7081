package primitives;
/**
 * Class Point represents a point in 3D Cartesian coordinates.
 */
public class Point {
	 /**
     * The coordinates of the point.
     */
	protected final Double3 _xyz;
	 /**
     * Constant point representing the origin (0,0,0).
     */
	 public static final Point ZERO = new Point(0, 0, 0);
	 /**
	     * Constructor to initialize point with three coordinate values.
	     *
	     * @param x x coordinate
	     * @param y y coordinate
	     * @param z z coordinate
	    */
	 public Point(double x, double y, double z) {
		 _xyz = new Double3(x,y,z);
	 }
	 /**
	     * Constructor to initialize point with Double3 object.
	     *
	     * @param xyz coordinates object
	  */
	 public Point(Double3 xyz) {
		 _xyz = xyz;
	 }
	 /**
	     * Subtracts another point from this point and returns the vector
	     * from the other point to this point.
	     *
	     * @param other the other point
	     * @return vector from other to this point
	  */
	 public Vector subtract(Point other) {
		 return new Vector(_xyz.subtract(other._xyz));
	 }
	 /**
	  * Adds a vector to this point.
	  *
	  * @param vector the vector to add
	  * @return a new point obtained by adding the vector to this point
	  */
	 public Point add(Vector vector) {
		 return new Point(_xyz.add(vector._xyz));
	 }
	 /**
	     * Calculates the squared distance between this point and another point.
	     *
	     * @param other the other point
	     * @return squared distance
	 */
	 public double distanceSquared(Point other) {
		 double dx = _xyz._d1() - other._xyz._d1();
		 double dy = _xyz._d2() - other._xyz._d2();
		 double dz = _xyz._d3() - other._xyz._d3();
		 return dx*dx + dy*dy + dz*dz;
	 }
	 /**
	     * Calculates the distance between this point and another point.
	     * Must use distanceSquared.
	     *
	     * @param other the other point
	     * @return distance between the points
	  */
	 public double distance(Point other) {
		 return Math.sqrt(distanceSquared(other));
	 }
	 
	 @Override
	 public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (!(obj instanceof Point other)) return false;
	        return _xyz.equals(other._xyz);
	 }
	 @Override
	    public String toString() {
	        return "Point" + _xyz;
	 }
	 @Override
	 public int hashCode() {
	     return _xyz.hashCode();
	 }
	 
}
