package LabMyPatterns;

public class Main {
    public static void main(String[] args) {
        Point pointPrototype = new Point(2, 3);
        Point pointClone = pointPrototype.clone();
        pointPrototype.draw();
        pointClone.draw();

        //изменим клон:
        pointClone.setX(7);
        pointClone.setY(7);
        pointClone.draw();

        Line linePrototype = new Line(1,2,3, 4);
        Line lineClone = linePrototype.clone();
        linePrototype.draw();
        lineClone.draw();

        Circle circlePrototype = new Circle(1,2,3);
        Circle circleClone = circlePrototype.clone();
        circlePrototype.draw();
        circleClone.draw();


        SceneBlack sceneBlack = new SceneBlack();
        sceneBlack.createPoint();
        sceneBlack.createLine();
        sceneBlack.createCircle();

        SceneColor sceneColor = new SceneColor();
        sceneColor.createPoint();
        sceneColor.createLine();
        sceneColor.createCircle();

        Scene.instance.draw();

    }
}
