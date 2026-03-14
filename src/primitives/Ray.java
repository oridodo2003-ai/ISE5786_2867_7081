package primitives;

/**
 * Class Ray represents a ray in 3D space.
 * A ray is defined by an origin point and a direction vector.
 */
public class Ray {

    /**
     * The starting point of the ray.
     */
    private final Point _origin;

    /**
     * The direction vector of the ray, always normalized.
     */
    private final Vector _direction;

    /**
     * Constructs a ray with origin point and direction vector.
     *
     * @param origin the starting point of the ray
     * @param direction the direction vector of the ray
     */
    public Ray(Point origin, Vector direction) {
        _origin = origin;
        _direction = direction.normalize();
    }

    /**
     * Returns the origin point of the ray.
     *
     * @return the origin point
     */
    public Point getOrigin() {
        return _origin;
    }

    /**
     * Returns the normalized direction vector of the ray.
     *
     * @return the direction vector
     */
    public Vector getDirection() {
        return _direction;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Ray other)) return false;
        return _origin.equals(other._origin) && _direction.equals(other._direction);
    }

    @Override
    public int hashCode() {
        return _origin.hashCode() + _direction.hashCode();
    }

    @Override
    public String toString() {
        return "Ray{origin=" + _origin + ", direction=" + _direction + "}";
    }
}