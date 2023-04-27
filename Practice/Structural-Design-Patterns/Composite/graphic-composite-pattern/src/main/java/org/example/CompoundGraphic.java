package org.example;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic{
    private final List<Graphic> children;

    public CompoundGraphic() {
        this.children = new ArrayList<>();
    }

    @Override
    public void move(int x, int y) {
        for (Graphic graphic : children)
             graphic.move(x, y);
    }

    @Override
    public void draw() {
        for (Graphic graphic : children)
            graphic.draw();
    }

    public void addGraphic(Graphic graphic){
        children.add(graphic);
    }

    public void removeGraphic(Graphic graphic){
        children.remove(graphic);
    }
}
