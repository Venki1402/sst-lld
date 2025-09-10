public class VerticalPrintCList extends CList {

    CList cList;

    VerticalPrintCList(CList cList) {
        this.cList = cList;
    }

    @Override
    public void print() {
        System.out.println("Print Vertcially");
    }

    @Override
    public void sort() {
        this.cList.sort();
    }

}
