package sg.edu.nus.iss;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws IOException {

        // ArraySortExample.example();

        // CollectionSortExample.example01();

        // ArraySortExample.example02();

        // CollectionSortExample.example02();

        // HashMapExample.example();

        // HashTableExample.example();

        // ConcurrentHashMapExample.example();

        // ArraySortExample ex = new ArraySortExample();
        // ex.example();

        // LinkedListExample.example();

        // StackExample.example();

        String dirPath = ".\\data";
        String fileName = "data.txt";


        // creating directory
        File newDir = new File (dirPath);
        boolean isDirCreated = newDir.mkdir();

        if(isDirCreated){
            System.out.println("New directory " + dirPath + " created");
        }else{
            System.out.println("Directory " + dirPath + " already exists");
        }

        File newFile = new File (dirPath + File.separator + fileName);
        boolean isFileCreated = newFile.createNewFile();

        // creating file
        if(isFileCreated){
            System.out.println("New file " + fileName + " created");
        }else{
            System.out.println("Directory " + fileName + " already exists");
        }

        // list all files under a directory
        File[] fileList = newDir.listFiles();
        for (File f : fileList){
            System.out.println("File " + f.getPath() + " : " + f.getCanonicalFile());
        }
        
        try(FileOutputStream fos = new FileOutputStream(newFile, true);){

            // for (int i = 0; i < 10; i++){
            //     fos.write(i);
            //     fos.flush();
            // }

            // DataOutputStream dos = new DataOutputStream(fos);
            // for (int i = 0; i < 10; i++){
            //     dos.writeInt(i);
            //     dos.writeChar('\n');
            //     dos.flush();
            // }

            for (int i = 0; i < 10; i++){
                char[] str = Integer.toString(i).toCharArray();
                fos.write(str[0]); //only write first digit, does not work for 2 digit int
                fos.write('\n');
                fos.flush();
            }

            // writing string using file output stream, need to convert to bytes before writing
            String welcomeMessage= "WELCOME TO TFIP PROGRAMME";
            byte[] outputData = welcomeMessage.getBytes();
            fos.write(outputData);
            fos.flush();

        }


    }
}
