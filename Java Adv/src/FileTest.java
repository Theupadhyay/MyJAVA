import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileTest {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("z:\\abc\\.\\pqr\\..\\xyz");
      //  System.out.println(p.isAbsolute());    // To get the path is absolute or not
      //  System.out.println(p.getRoot());       // To get root Directory
      //  System.out.println(p.getFileName());   // To get File name
      //  System.out.println(p.getParent());     // To get all accept file name
      //  System.out.println(p.getNameCount());  // To get no. of Directory
      //  System.out.println(p.normalize());     // To get Normalize path

 // Resolve Path - resolve with another path
        Path p2 = Paths.get("z:\\abc\\.\\pqr\\..\\xyz");
        System.out.println(p2.resolve(p));


//        Path p3 = Paths.get("d:\\Abhi");
//        Files.deleteIfExists(p3);
//        Files.createFile(p3);
//        Files.createDirectories(p);


        // Path finding
        Path p4 = Paths.get("D:\\Abhi");
        Stream<Path> pt = Files.list(p4);
        pt.forEach(pp -> System.out.println(pt));


    }
}
