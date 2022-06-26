package elements;

import visitors.Visitor;

public abstract class Element {
    public String uuid;

    public Element(String uuid) {
        this.uuid = uuid;
    }

    public abstract void accept(Visitor v);
}