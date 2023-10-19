import java.io.*;

public class FileOperation {
    public static long copyFile(File in, File out) throws IOException {
        try (InputStream is = new FileInputStream(in); OutputStream os = new FileOutputStream(out)) {
            return is.transferTo(os);
        }
    }

    public static long copyFilesWithSpecificExtensionToAnotherFolder(File folderIn, File folderOut, String extension) throws IOException {
        File[] listOfFiles = folderIn.listFiles();
        long fileCopy =0;
        for (File files : listOfFiles) {
            if (files.isFile() && files.getName().endsWith(extension)){
                File out = new File(folderOut, files.getName());
                copyFile(files, out);
                fileCopy += 1;
            }
        }
        return fileCopy;
    }
}
