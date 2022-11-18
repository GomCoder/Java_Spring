package ch08;

public class Point<T, V> {
	T x; //xÁÂÇ¥
	V y; //yÁÂÇ¥
	
	Point(T x, V y) {
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	
	public V getY() {
		return y;
	}
}
