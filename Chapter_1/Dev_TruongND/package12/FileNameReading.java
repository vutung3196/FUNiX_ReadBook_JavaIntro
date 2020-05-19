package package12;

import java.io.File;

public class FileNameReading {

    static void listFilesForFolder(File[] fileArr, int index, int level) {

        //ending recursive
        if(index == fileArr.length) return;

        //add tabs for internal level
        for (int i = 0; i < level; i++)
            System.out.print("\t");

        //print file names
        if(fileArr[index].isFile()) {
            System.out.println(fileArr[index].getName());
        }
        //print files in sub-directories
        else if (fileArr[index].isDirectory()) {
            System.out.println("[" + fileArr[index].getName() + "]");
            listFilesForFolder(fileArr[index].listFiles(), 0, level + 1);
        }

        listFilesForFolder(fileArr, ++index, level);

    }

    public static void main(String[] args) {
        String path = "/home/truongdev/Desktop/CSD201x-A1";
        File mainfolder = new File(path);

        if(mainfolder.exists() && mainfolder.isDirectory()) {
            File fileArr[] = mainfolder.listFiles();
            
            System.out.println("**************************************************");
            System.out.println("Files from the directory: " + mainfolder);
            System.out.println("**************************************************");

            listFilesForFolder(fileArr, 0, 0);
        }
    }
}