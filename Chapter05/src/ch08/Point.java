package ch08;

public class Point<T, V> {
	T x; //x��ǥ
	V y; //y��ǥ
	
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
