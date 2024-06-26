package kr.or.ddit.study06.sec03;

public class Triangle {
	//삼각형 3점 좌표, 넓이
	int x1;
	int y1;
	
	int x2;
	int y2;
	
	int x3;
	int y3;
	
	int area;
	
	public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
		this.x1=x1;
		this.y1=y1;
		
		this.x2=x2;
		this.y2=y2;
		
		this.x3=x3;
		this.y3=y3;
		
		this.area = Math.abs((x1*y2+ x2*y3+x3*y1) - (x1*y3+x2*y1+x3*y2))/2;
	}
	public Triangle(Point p1, Point p2, Point p3) {
		this(p1.x,p1.y,p2.x,p2.y,p3.x,p3.y);
	}
	public Triangle(Point[] points) {
		this(points[0],points[1],points[2]);
	}

	@Override
	public String toString() {
		return "Triangle [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + ", x3=" + x3 + ", y3=" + y3
				+ ", area=" + area + "]";
	}
	
	public static void main(String[] args) {
		Triangle t1 = new Triangle(0,0,0,10,10,0);
		System.out.println(t1);
		Triangle t2 = new Triangle(new Point(0,0), new Point(0,10), new Point(10,0));
		System.out.println(t2);
	}

}
