public class SListFactory {
    public static SList createSList(String sortingType, String printType) {
        ISortingAlgo sortingAlgo = null;
        IPrintAlgo printAlgo = null;

        // Sorting strategy selection
        if ("merge".equalsIgnoreCase(sortingType)) {
            sortingAlgo = new MergeSortImpl();
        } else if ("count".equalsIgnoreCase(sortingType)) {
            sortingAlgo = new CountSortImpl();
        } else if ("bubble".equalsIgnoreCase(sortingType)) {
            sortingAlgo = new BubbleSortImpl();
        }

        // Print strategy selection
        if ("vertical".equalsIgnoreCase(printType)) {
            printAlgo = new VerticalPrintImpl();
        } else if ("horizontal".equalsIgnoreCase(printType)) {
            printAlgo = new HorizontalPrintImpl();
        }

        return new SList(sortingAlgo, printAlgo);
    }
}
