import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.opencsv.CSVReader;

public class Calculator {

  public List<List<String>> parseCSV(String path){
    List<List<String>> records = new ArrayList<List<String>>();
    try (CSVReader csvReader = new CSVReader(new FileReader(path));) {
        String[] values = null;
        while ((values = csvReader.readNext()) != null) {
            records.add(Arrays.asList(values));
        }
    } catch (Exception e) {
      
    }
    return records;
  }
  
  public static void main(String[] args) {
    
  }

}
