public class FileFactory {

    public FileType getFile(FILE_TYPE file_type){

        if(file_type != null) {

            if (file_type == FILE_TYPE.CSV)
                return new CsvFile();

            if (file_type == FILE_TYPE.XML)
                return new XmlFile();
        }

        return null;
    }
}
