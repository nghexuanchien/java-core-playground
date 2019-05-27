import java.lang.reflect.Field;
/**
 * @author chiennghe
 */
public class Main {
    static class Blog {
        private String name;
    }

    public static void main(String[] args) throws Exception{
        Blog blog = new Blog();
//        blog.name = "codersontrang.com";
        Field blogName = Blog.class.getDeclaredField("name");
        blogName.set(blog, "codersontrang.com");

        System.out.println("The blog name is: "+ blog.name);
    }
}
