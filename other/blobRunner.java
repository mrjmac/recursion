public class blobRunner
{
    public static void main(String[] args)
    {
        String[][] blobs = {{"@", "-", "@", "-", "-", "@", "-", "@", "@", "@"},
                            {"@", "@", "@", "-", "@", "@", "-", "@", "-", "@"},
                            {"-", "-", "-", "-", "-", "-", "-", "@", "@", "@"},
                            {"-", "@", "@", "@", "@", "@", "-", "@", "-", "@"},
                            {"-", "@", "-", "@", "-", "@", "-", "@", "-", "@"},
                            {"@", "@", "@", "@", "@", "@", "-", "@", "@", "@"},
                            {"-", "@", "-", "@", "-", "@", "-", "-", "-", "@"},
                            {"-", "@", "@", "@", "-", "@", "-", "-", "-", "-"},
                            {"-", "@", "-", "@", "-", "@", "-", "@", "@", "@"},
                            {"-", "@", "@", "@", "@", "@", "-", "@", "@", "@"}};
        blob b = new blob(blobs);
        System.out.println(b.getCount(3, 1));
    }
}