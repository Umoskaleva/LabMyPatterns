package LabMyPatterns;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public List<GraphObject> objects;
    public List<Triangle> objectsTriangles;
    private Color sceneColor;


    public Color getSceneColor() {
        return sceneColor;
    }

    public void setSceneColor(Color color) {
        this.sceneColor = color;
    }

    public static final Scene instance = new Scene(); // делаем сцену одиночкой

    private Scene() {
        objects = new ArrayList<>();
//        objectsTriangles = new ArrayList<>();
    }

    public void add(GraphObject object) {
        objects.add(object);
    }

    public void addTriangle(Triangle triangle) {
        TriangleAdapter adapter = new TriangleAdapter(
                triangle.getX1(), triangle.getY1(),
                triangle.getX2(), triangle.getY2(),
                triangle.getX3(), triangle.getY3()
        );
        objects.add(adapter);
    }


    public void clear() {
        objects.clear();
    }

    public void draw() {
        for (GraphObject g : objects) {
            g.draw();
        }
    }
}
