package isep.switchdev;

public class Dimensions {
    private double _height;
    private double _width;
    private double _length;

    public Dimensions(double height, double width, double length) {
        if (height <= 0 || width <= 0 || length <= 0)
            throw new IllegalArgumentException("height, width and length must be valid");

        this._height = height;
        this._width = width;
        this._length = length;
    }

    public double getHeight() {
        return this._height;
    }

    public double getWidth() {
        return this._width;
    }

    public double getlength() {
        return this._length;
    }
}
