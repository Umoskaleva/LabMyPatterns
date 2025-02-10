package LabMyPatterns;

public class SceneBlack implements Factory {
    public Color color = Color.BLACK;

    @Override
    public Scene scene(Color color) {
        Scene scene = Scene.instance;
//        Color sceneBlack = (color != null) ? color : this.color;
        Color sceneBlack = this.color;
        scene.setSceneColor(sceneBlack);
        return scene;
    }

    @Override
    public Point createPoint() {
        Point pBlack = new Point(1, 1);
        Scene.instance.add(pBlack); //hook
        return pBlack;
    }

    @Override
    public Line createLine() {
        Line lBlack = new Line(1, 1, 2, 2);
        Scene.instance.add(lBlack); //hook
        return lBlack;
    }

    @Override
    public Circle createCircle() {
        Circle cBlack = new Circle(1, 1, 1);
        Scene.instance.add(cBlack); //hook
        return cBlack;
    }

    @Override
    public Triangle createTriangle() {
       Triangle tBlack = new Triangle(3,3,4,4,5,5);
       Scene.instance.addTriangle(tBlack);//hook
       return tBlack;
    }
}
