import java.io.File;

public class DeleteFolder {
public static void main(String  s[])
{
File f=new File("e:\\13april2021");
deleteFolder(f);
f.delete();
}
  public static void deleteFolder(File f) {
    File[] files = f.listFiles();
    for (File fi : files) {
      if (fi.isDirectory()) {
        deleteFolder(fi);
      }
      fi.delete();
    }

  }
}