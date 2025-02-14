import java.util.ArrayList;

public class Storage
{
    private ArrayList<Integer> file = new ArrayList<>();
    private int maxFileSize = 0;
    private int totalSize = 0;

    public Storage(int maxFileSize)
    {
        this.maxFileSize = maxFileSize;
    }

    /**
     * method addFile
     * @param fileSize
     * @return boolean
     * description: this method will add file as long as total size
     * includng a new file size you want to add
     * is not larger than the maximum file size
     */
    public boolean addFile(int fileSize)
    {
        if ((fileSize + this.totalSize) <= this.maxFileSize){
            file.add(fileSize);
            totalSize += fileSize;
            return true;
        }
        return false;
    }

    public int getNumberOfFiles()
    {
        return file.size();
    }

    @Override
    public String toString()
    {
        String output = "";
        for (int i = 0; i < getNumberOfFiles(); i++){
            output += " " + this.file.get(i);
        }
        return output;
    }
}