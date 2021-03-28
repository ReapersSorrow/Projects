import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class FileType {

    protected FILE_TYPE file_type;

    public abstract void setFileType();
    public abstract void generateFile(String fileName, List<Object> content) throws IOException;
}
