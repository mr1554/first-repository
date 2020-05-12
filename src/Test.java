public class Test {
    public static void main(String[] args) {
        String example = "/abc/def/ghfj.doc";
        System.out.println(example.substring(example.lastIndexOf("/") + 1));
    }
}
