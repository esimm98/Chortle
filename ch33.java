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

class Box4 {
	public double width, height, length;

	public Box4 (double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}

	public Box4(double side) {
		width = side;
		height = side;
		length = side;
	}

	Public Box4 (Box4 oldBox) {
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

	public Box4 biggerBox(Box4 oldBox) {
		return new Box4(1.25 * oldBox.width, 1.25 * oldBox.height, 1.25 * oldBox.length);
	}

	public Box4 smallerBox(Box4 oldBox) {
		return new Box4(0.75 * oldBox.width, 0.75 * oldBox.height, 0.75 * oldBox.length);
	}
}

class BoxTester4 {
	public static void main(String[] args) {
		Box4 box = new Box4(2.5, 5.0, 6.0);
		Box4 smallBox = new Box4(box);
		Box4 bigBox = new Box4(box);

		System.out.println("Surface Area: " + box.surfaceArea() + " volume: " + box.volume());
		System.out.println("length: " + box.length + " width: " + box.width + " height: " + box.height);

		System.out.println("Surface Area: " + box4.surfaceArea() + " volume: " + box4.volume());
		System.out.println("length: " + box4.length + " width: " + box4.width + " height: " + box4.height);
	}
}

class Box5 {
	public double width, height, length;

	public Box5 (double w, double h, double l) {
		width = w;
		height = h;
		length = l;
	}

	public Box5(double side) {
		width = side;
		height = side;
		length = side;
	}

	Public Box5 (Box5 oldBox) {
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

	public Box5 biggerBox(Box5 oldBox) {
		return new Box5(1.25 * oldBox.width, 1.25 * oldBox.height, 1.25 * oldBox.length);
	}

	public Box5 smallerBox(Box5 oldBox) {
		return new Box5(0.75 * oldBox.width, 0.75 * oldBox.height, 0.75 * oldBox.length);
	}

	public boolean nests(Box outBox) {
		return (width > outBox.width && height > outBox.height && length > outBox.length);
	}
}

class BoxTester5 {
	public static void main(String[] args) {
		Box5 box = new Box5(2.5, 5.0, 6.0);
		Box5 smallBox = Box5.smallerBox(box);
		Box5 bigBox = Box5.biggerBox(box);

		System.out.println("Nests: " + box.nests(smallBox);
	}
}