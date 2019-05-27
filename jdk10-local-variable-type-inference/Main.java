import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author chiennghe
 */
public class Main {
    public static String getName(){
        return "my name is coder son trang";
    }

    static {
        var x = "my string";
    }

    public static void main(String[] args) {
        var x = "my string";
        var y = 10;
        var z = new int[]{1,2,3};

        for(var item : z){

        }

        try{
            var f = new File("C:\\myfile.txt");
            var fos = new FileOutputStream(f);
            var bos = new BufferedOutputStream(fos);

        }catch (Exception e){

        }

        String name = getName();
        var lst = new ArrayList<String>(); // ArrayList<String>()
        lst = new LinkedList<String>();

    }
}
