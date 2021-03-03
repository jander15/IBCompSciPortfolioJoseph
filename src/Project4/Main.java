package Project4;

import java.io.File;
import java.io.IOException;

public class  Main {
    public static void main(String[] args) throws IOException {

        String dir = "C:\\Users\\josep\\Documents\\IBCompSci\\IBCompSciPortfolio\\src\\Project4\\";


        File myfile = new File(dir+"Unsorted.csv");
        Parser parser = new Parser(myfile);
        parser.findAverage();
        Double[] sortedArray= parser.sortAcending();


        Writer writer = new Writer(dir+"Output.csv");
        writer.writeArrayData(sortedArray);

    }
}
