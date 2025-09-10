public class main {
    public static void main(String[] args) {
        // using decorators (not exactly appropriate)

        // CList base = new CList();
        // base.print();
        // base.sort();
        // base = new VerticalPrintCList(base);
        // base.print();
        // base = new MergeSortCList(base);
        // base.sort();

        // Stratergy Design Pattern

        SList sList = SListFactory.createSList("merge", "horizontal");
        sList.print();
        sList.sort();

    }
}