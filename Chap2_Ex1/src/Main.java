import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the maximum size of the directory A?");
        int maxSize = input.nextInt();
        System.out.println("How many files do you have to store in directory A?");
        int numberOfFile = input.nextInt();
        System.out.println("How many files do you have to store in directory A?");
        int[] fileSizeList = new int[numberOfFile];
        for(int i = 0; i < numberOfFile; i++){
            fileSizeList[i] = input.nextInt();
        }
        ArrayList<Storage> result = firstFit(fileSizeList, maxSize);
        for(int i = 0; i < result.size(); i++){
            System.out.println("Block " + (i+1) + " can store following file(s): " + result.get(i).toString() + " in (KB)");
        }
    }

    public static ArrayList<Storage> firstFit(int[] fileSizeList, int maxFileSize) {
        ArrayList<Storage> storages = new ArrayList<>();
        boolean added;
        for(int fileSize : fileSizeList){
            added = false;
            for (Storage block : storages) {
                if (block.addFile(fileSize)) {

                    added = true;
                    break;
                }
            }
            if (!added) {
                Storage temp = new Storage(maxFileSize);
                temp.addFile(fileSize);
                storages.add(temp);
            }
        }
        return storages;
    }
}