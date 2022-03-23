package abstraction9;

class MyArrayList extends ElementsListEditor{
    private String[]LIST = {"Mike", "Jack", "Bob", "Mike"};
    String newElementName;
    int indexElement;

    public String[] getLIST() {
        return LIST;
    }

    public String getNewElementName() {
        return newElementName;
    }

    public int getIndexElement() {
        return indexElement;
    }

    @Override

    public String[] addElement(String newElementName) {
        String[]newList = new String[LIST.length + 1];
        for(int i = 0; i < newList.length; i++) {
            if(i < LIST.length) {
                newList[i] = LIST[i];
            }
            else {
                newList[i] = newElementName;
            }
        }
        return newList;
    }

    @Override
    public String[] deleteElement(int indexElement) {
        String[]newList = new String[LIST.length - 1];
        for(int i = 0; i < newList.length; i++) {
            if(i == indexElement) {
                i++;
            }
            newList[i] = LIST[i];
        }
        return newList;
    }

    @Override
    public void showListElements() {

    }
}
