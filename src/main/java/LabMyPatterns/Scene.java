package LabMyPatterns;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public List<GraphObject> objects;
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
    }

    public void add (GraphObject object){
        objects.add(object);
    }

    public void clear(){
        objects.clear();
    }

    public void draw(){
        for (GraphObject g : objects)
            g.draw();
    }
}
