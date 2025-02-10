package LabMyPatterns;

public class TriangleAdapter extends Circle {

    private Triangle triangle;

       public TriangleAdapter(int x1, int y1, int x2, int y2, int x3, int y3) {
        super();
        triangle = new Triangle(x1, y1, x2, y2, x3, y3);
    }

    @Override
    public void draw() {
        if (triangle != null) {
            System.out.println("Triangle: (" + triangle.getX1() + ";" + triangle.getY1() + ")" +
                    "(" + triangle.getX2() + ";" + triangle.getY2() + ")" +
                    "(" + triangle.getX3() + ";" + triangle.getY3() + ")" + Color.GREEN);
        } else {
            System.out.println("Triangle is null");
        }
    }

}




