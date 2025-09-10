public class MergeSortCList extends CList {
    CList cList;

    MergeSortCList(CList cList) {
        this.cList = cList;
    }

    @Override
    public void print() {
        this.cList.print();
    }

    @Override
    public void sort() {
        System.out.println("Merge Sort");
    }
}
