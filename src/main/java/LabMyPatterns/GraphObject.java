package LabMyPatterns;

public abstract class GraphObject implements Cloneable {


    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Клонирование не возможно", e);
        }
    }

    public abstract void draw();

}