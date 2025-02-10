package LabMyPatterns;

public interface Factory {

    Scene scene(Color color);
    Point createPoint();
    Line createLine();
    Circle createCircle();
    Triangle createTriangle();
}
