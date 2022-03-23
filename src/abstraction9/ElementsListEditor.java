package abstraction9;

public abstract class ElementsListEditor {

    public String[] addElement(String newElementName) {
        return new String[0];
    }

    public abstract String[] deleteElement(int indexElement);

    public abstract void showListElements();
}
