import java.io.IOException;
import java.util.List;

public class XmlFile extends FileType{


    @Override
    public void setFileType() {

        file_type = FILE_TYPE.XML;
    }

    @Override
    public void generateFile(String fileName, List<Object> content) throws IOException {


    }

    public XmlFile() {

        setFileType();
    }
}
