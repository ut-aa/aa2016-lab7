package ee.ut.cs.aa.grading.graph.util;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EdgeReaderImpl implements EdgeReader {
    @Override
    public Iterable<Triple> fileFromClassPath(String name) throws IOException {
        return helper(this.getClass().getClassLoader().getResourceAsStream(name));
    }


    @Override
    public Iterable<Triple> fileFromFullPath(String path) throws IOException {
        return helper(new FileInputStream(new File(path)));
    }

    @Override
    public Iterable<Triple> fileFromDefaultLocation() throws IOException {
        return helper(this.getClass().getClassLoader().getResourceAsStream("kaugused.csv"));
    }


    private Iterable<Triple> helper(InputStream fileAsAStream) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(fileAsAStream))){
            //Dismiss first line as it contains only numbers associated with the cities
            Set<Triple> collection = new HashSet<>();
            br.readLine();

            String[] namesRaw = br.readLine().split(";");
            String[] names = Arrays.copyOfRange(namesRaw,2,namesRaw.length);

            String lineRaw;
            // Taking only things from upper diagonal
            int i= 0;
            while ((lineRaw = br.readLine()) != null){
                String[] lineArrRaw = lineRaw.split(";");
                // for every other line,also ignore 1 first elements
                String current = lineArrRaw[1];
                String[] line = Arrays.copyOfRange(lineArrRaw,2,lineArrRaw.length);
                for (int j = i+1; j < line.length;j++ ){
                    collection.add(new Triple(names[j],current,Integer.parseInt(line[j])));
                }
                i++;
            }
            return collection;
        }
    }
}
