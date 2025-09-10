public class BubbleSortCList extends CList {
    CList cList;

    BubbleSortCList(CList cList) {
        this.cList = cList;
    }

    @Override
    public void print() {
        this.cList.print();
    }

    @Override
    public void sort() {
        System.out.println("Bubble Sort");
    }
}
