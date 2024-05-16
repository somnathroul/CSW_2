

import java.io.File;
import java.util.*;

class FileNotFoundException extends Exception {
    FileNotFoundException(String s) {
        super(s);
    }
}

class FileReadPermissionException extends Exception {
    FileReadPermissionException(String s) {
        super(s);
    }
}

public class Q4 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Paste the Path of File in the directory :");
        String s = obj.nextLine();
        obj.close();
        File f = new File(s);

        try {
            if (!f.exists()) {
                throw new FileNotFoundException("File not Found");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try {
            if (f.exists()) { // Use && here instead of ||
                System.out.println("File Name is: " + f.getName());

            } else if (!f.canRead()) {
                throw new FileReadPermissionException("File cannot be read that...");
            }
        } catch (FileReadPermissionException e) {
            System.out.println(e);
        }
    }
}
