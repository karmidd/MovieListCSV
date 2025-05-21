package Movies;

import java.io.File;

public class hgfgdsfgsdf {
    public static void main(String[] args) {
        File dir0Folder = new File(System.getProperty("user.dir"));
        File[] dirFolderFiles0 = dir0Folder.listFiles();
        for (int i = 0; i < dirFolderFiles0.length; i++) {
            if(dirFolderFiles0[i].getName().contains(".ser") || dirFolderFiles0[i].getName().contains(".csv") || dirFolderFiles0[i].getName().contains(".txt")){
                File file = new File(dirFolderFiles0[i].getName());
                file.delete();
            }
        }
    }
}
