import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.opencsv.CSVWriter;

public class CsvFile extends FileType{


    @Override
    public void setFileType() {

        file_type = FILE_TYPE.CSV;
    }

    @Override
    public void generateFile(String fileName, List<Object> content) throws IOException{

        if(content == null || content.size() == 0)
            throw new IOException("List is empty");

        if(content.get(0) instanceof Reservastion){

            content.forEach(obj -> {

                Reservation objRes = (Reservation) obj;

                try{

                    CSVWriter csvWriter = new CSVWriter(new FileWriter(fileName + ".csv"));

                    csvWriter.writeNext(new String[]{objRes.getId().toString()});

                }catch (IOException exc){
                    exc.printStackTrace();
                }
            });
        }
    }

    public CsvFile(){

        setFileType();
    }

}
