package LabMyPatterns;

public class SceneColor implements Factory {

    Color color = Color.YELLOW;

    @Override
    public Scene scene(Color color) {
        Scene scene = Scene.instance;
        Color sceneYellow = this.color;
        scene.setSceneColor(sceneYellow);
        return scene;
    }

    @Override
    public Point createPoint() {
        Point pYellow = new Point(2, 2);
        Scene.instance.add(pYellow); //hook
        return pYellow;
    }

    @Override
    public Line createLine() {
        Line lYellow = new Line(2, 2, 3, 3);
        Scene.instance.add(lYellow); //hook
        return lYellow;

    }

    @Override
    public Circle createCircle() {
        Circle cYellow = new Circle(2, 2, 2);
        Scene.instance.add(cYellow); //hook
        return cYellow;
    }
}
