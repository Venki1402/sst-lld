public class SList {
    ISortingAlgo iSortingAlgo;
    IPrintAlgo iPrintAlgo;

    SList(ISortingAlgo iSortingAlgo, IPrintAlgo iPrintAlgo) {
        this.iSortingAlgo = iSortingAlgo;
        this.iPrintAlgo = iPrintAlgo;
    }

    void sort() {
        this.iSortingAlgo.sort();
    }

    void print() {
        this.iPrintAlgo.print();
    }
}
