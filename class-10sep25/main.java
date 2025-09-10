public class main {
    public static void main(String[] args) {
        CList base = new CList();
        base.print();
        base.sort();
        base = new VerticalPrintCList(base);
        base.print();
        base = new MergeSortCList(base);
        base.sort();
    }
}