package DELETEFILES;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myObj=new File("File Name.txt");
        if(myObj.delete()){
            System.out.println("deleted the file: "+myObj.getName());
        }else{
            System.out.println("Failed to delete the file. ");
        }
    }
}
