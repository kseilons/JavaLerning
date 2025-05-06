import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path[] paths = new Path[5];
        paths[0] = Paths.get("C:\\java\\JavaLerning\\6sem\\lab10\\pathdemo\\DemoFile.txt");
        paths[1] = Paths.get("C:/java/JavaLerning/6sem/lab10/pathdemo/DemoFile.txt");
        paths[2] = Paths.get("C", "java", "JavaLearning", "6sem", "lab10", "pathdemo", "DemoFile.txt");
        paths[3] = Paths.get("DemoFile.txt");
        paths[4] = Paths.get(URI.create("file:/C:/java/JavaLerning/6sem/lab10/pathdemo/DemoFile.txt"));

        for(int i = 0; i < paths.length; i++)
            System.out.println("Default File Path p[" + i + "] - " + paths[i]);

        System.out.println("\nAdditional Path methods:");
        System.out.println("File name: " + paths[0].getFileName());
        System.out.println("Parent: " + paths[0].getParent());
        System.out.println("Name count: " + paths[0].getNameCount());
        System.out.println("Is absolute: " + paths[0].isAbsolute());
        System.out.println("Absolute path: " + paths[3].toAbsolutePath());

        Path rp = Paths.get("C:/java/JavaLerning/6sem/lab10/../lab10/pathdemo/DemoFile.txt");
        System.out.println("\nNormalization example:");
        System.out.println("Original path: " + rp);
        System.out.println("Normalized path: " + rp.normalize());
        
        Path sp = Paths.get("C:/java/JavaLerning/6sem/lab10/../lab10/pathdemo/DemoFile.txt");
        System.out.println("\nSubpath examples with your path:");
        System.out.println("path.subpath(0,3): [" + sp.subpath(0,3) + "]");
        System.out.println("Normalized subpath(0,3): [" + sp.normalize().subpath(0,3) + "]");
        System.out.println("All but last: [" + 
            sp.normalize().subpath(0, sp.normalize().getNameCount()-1) + "]");
    } //end method main
} //end class PathDemo