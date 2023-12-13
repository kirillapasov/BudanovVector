public class Vector {
    private final int x;
    private final int y;
    private final int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int length() {
        return (int) Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());
    }

    public Vector add(Vector other) {
        return new Vector(this.getX() + other.getX(), this.getY() + other.getY(), this.getZ() + other.getZ());
    }

    public Vector sub(Vector other) {
        return new Vector(this.getX() - other.getX(), this.getY() - other.getY(), this.getZ() - other.getZ());
    }

    public Vector mult(int a) {
        return new Vector(this.getX() * a, this.getY() * a, this.getZ() * a);
    }

    public Vector scalarMult(Vector other) {
        return new Vector(this.getX() * other.getX(), this.getY() * other.getY(), this.getZ() * other.getZ());
    }

    public Vector vectorMult(Vector other) {
        return new Vector(this.getY() * other.getZ() - this.getZ() * other.getY(), -(this.getX() * other.getZ() - this.getZ() * other.getX()), this.getZ() * other.getY() - this.getY() * other.getX());
    }


    public boolean lenghtEquals(Vector other) {
        return this.length() == other.length();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return x == vector.x && y == vector.y && z == vector.z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

}
