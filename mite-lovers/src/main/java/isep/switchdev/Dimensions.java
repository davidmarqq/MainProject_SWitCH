package isep.switchdev;

public class Dimensions {
    private double _height;
    private double _width;
    private double _depth;

    public Dimensions(double height, double width, double depth) {
        if (height <= 0 || width <= 0 || depth <= 0)
            throw new IllegalArgumentException("height, width and depth must be valid");

        this._height = height;
        this._width = width;
        this._depth = depth;
    }

    public double getHeight() {
        return this._height;
    }

    public double getWidth() {
        return this._width;
    }

    public double getDepth() {
        return this._depth;
    }
}
