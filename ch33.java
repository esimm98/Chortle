class Box {
	public double width, height, length;

	Box (double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}

	Box (double side) {
		width = side;
		height = side;
		length = side;
	}

	public double volume() {
		return width * height * length;
	}

	public double baseArea() {
		return width * length;
	}

	public double sideArea() {
		return height * width;
	}

	public double frontArea() {
		return length * height;
	}

	public double surfaceArea() {
		return 2 * baseArea + 2 * sideArea * 2 * frontArea;
	}
}

class BoxTester {
	public static void main(String[] args) {
		Box box = new Box(2.5, 5.0, 6.0);

		System.out.println("Area: " + box.area() + " volume: " + box.volume());
		System.out.println("length: " + box.length + " width: " + box.width + " height: " + box.height);
	}
}