package primitives;

/**
 * Class Vector represents a non-zero vector in 3D Cartesian coordinates.
 * <p>
 * A vector describes direction and magnitude in space.
 * This class extends {@link Point} because both point and vector are represented
 * internally by three coordinates.
 * </p>
 * <p>
 * The zero vector {@code (0,0,0)} is not allowed and attempting to create it
 * will cause an {@link IllegalArgumentException} to be thrown.
 * </p>
 */
public class Vector extends Point {
	public static final Vector AXIS_Z = new Vector(0, 0, 1);
    /**
     * Constructs a vector from three coordinate values.
     *
     * @param x the x-coordinate of the vector
     * @param y the y-coordinate of the vector
     * @param z the z-coordinate of the vector
     * @throws IllegalArgumentException if the vector is the zero vector
     */
    public Vector(double x, double y, double z) {
        super(x, y, z);
        if (_xyz.equals(Double3.ZERO))
            throw new IllegalArgumentException("Zero vector is not allowed");
    }

    /**
     * Constructs a vector from a {@link Double3} object.
     *
     * @param xyz the coordinate container of the vector
     * @throws IllegalArgumentException if the vector is the zero vector
     */
    public Vector(Double3 xyz) {
        super(xyz);
        if (_xyz.equals(Double3.ZERO)) {
            throw new IllegalArgumentException("Zero vector is not allowed");
        }
    }

    /**
     * Adds another vector to this vector.
     *
     * @param other the vector to add
     * @return a new vector representing the sum of the two vectors
     */
    public Vector add(Vector other) {
        return new Vector(_xyz.add(other._xyz));
    }

    /**
     * Scales this vector by a scalar value.
     *
     * @param scalar the scaling factor
     * @return a new vector scaled by the given scalar
     */
    public Vector scale(double scalar) {
        return new Vector(_xyz.scale(scalar));
    }

    /**
     * Computes the dot product of this vector with another vector.
     * <p>
     * The dot product is defined as:
     * {@code x1*x2 + y1*y2 + z1*z2}
     * </p>
     *
     * @param other the other vector
     * @return the dot product of the two vectors
     */
    public double dotProduct(Vector other) {
        Double3 result = _xyz.product(other._xyz);
        return result._d1() + result._d2() + result._d3();
    }

    /**
     * Computes the cross product of this vector with another vector.
     * <p>
     * The cross product returns a vector perpendicular to both input vectors.
     * </p>
     *
     * @param other the other vector
     * @return a new vector representing the cross product of the two vectors
     * @throws IllegalArgumentException if the result is the zero vector
     *                                  (for parallel vectors)
     */
    public Vector crossProduct(Vector other) {
        double x = _xyz._d2() * other._xyz._d3() - _xyz._d3() * other._xyz._d2();
        double y = _xyz._d3() * other._xyz._d1() - _xyz._d1() * other._xyz._d3();
        double z = _xyz._d1() * other._xyz._d2() - _xyz._d2() * other._xyz._d1();

        return new Vector(x, y, z);
    }

    /**
     * Computes the squared length of this vector.
     * <p>
     * The squared length is defined as:
     * {@code x^2 + y^2 + z^2}
     * </p>
     *
     * @return the squared length of the vector
     */
    public double lengthSquared() {
        Double3 result = _xyz.product(_xyz);
        return result._d1() + result._d2() + result._d3();
    }

    /**
     * Computes the length of this vector.
     * <p>
     * The length is the square root of the squared length.
     * </p>
     *
     * @return the length of the vector
     */
    public double length() {
        return Math.sqrt(lengthSquared());
    }

    /**
     * Computes the squared distance between this vector and another vector.
     * <p>
     * Since a vector is represented by coordinates, this method reuses the
     * implementation inherited from {@link Point}.
     * </p>
     *
     * @param other the other vector
     * @return the squared distance between the two vectors
     */
    public double distanceSquared(Vector other) {
        return super.distanceSquared(other);
    }

    /**
     * Computes the distance between this vector and another vector.
     * <p>
     * Since a vector is represented by coordinates, this method reuses the
     * implementation inherited from {@link Point}.
     * </p>
     *
     * @param other the other vector
     * @return the distance between the two vectors
     */
    public double distance(Vector other) {
        return super.distance(other);
    }

    /**
     * Returns a normalized version of this vector.
     * <p>
     * A normalized vector has the same direction as this vector,
     * but its length is exactly 1.
     * </p>
     *
     * @return a new normalized vector
     */
    public Vector normalize() {
        double len = length();
        return new Vector(_xyz.scale(1 / len));
    }
    @Override
    public String toString() {
        return "Vector" + _xyz;
    }
}