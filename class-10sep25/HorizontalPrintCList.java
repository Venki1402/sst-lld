public class HorizontalPrintCList extends CList {
    CList cList;

    HorizontalPrintCList(CList cList) {
        this.cList = cList;
    }

    @Override
    public void print() {
        System.out.println("Print Horizontally");
    }

    @Override
    public void sort() {
        this.cList.sort();
    }
}
