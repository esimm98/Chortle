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
		return 2 * baseArea() + 2 * sideArea() * 2 * frontArea();
	}
}

class BoxTester {
	public static void main(String[] args) {
		Box box = new Box(2.5, 5.0, 6.0);

		System.out.println("Surface Area: " + box.surfaceArea() + " volume: " + box.volume());
		System.out.println("length: " + box.length + " width: " + box.width + " height: " + box.height);
	}
}

class Box3 {
	public double width, height, length;

	Box3 (double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}

	Box3 (Box3 oldBox) {
		width = oldBox.width;
		height = oldBox.height;
		length = oldBox.length;
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
		return 2 * baseArea() + 2 * sideArea() * 2 * frontArea();
	}

	public double length() {
		return length;
	}

	public double width() {
		return width;
	}

	public double height() {
		return height;
	}
}

class BoxTester3 {
	public static void main(String[] args) {
		Box3 box = new Box3(2.5, 5.0, 6.0);
		Box3 box3 = new Box3(box);

		System.out.println("Surface Area: " + box.surfaceArea() + " volume: " + box.volume());
		System.out.println("length: " + box.length + " width: " + box.width + " height: " + box.height);

		System.out.println("Surface Area: " + box3.surfaceArea() + " volume: " + box3.volume());
		System.out.println("length: " + box3.length + " width: " + box3.width + " height: " + box3.height);
	}
}