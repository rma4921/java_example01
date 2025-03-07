package chap05;


public class StringBufferBuilderExample {
    public static void main(String[] args){
        // hello
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello ");
        buffer.append("Java/Spring");
        buffer.append("DBMS!");
        System.out.println(buffer);

        buffer.insert(1, "Hello!");
        System.out.println(buffer);

        System.out.println(buffer.substring(10));

        System.out.println(buffer.reverse());

        System.out.println("Builder!");
        StringBuilder builder = new StringBuilder();
        builder.append("test ");
        builder.append("server");
        builder.append(" client");
        System.out.println(builder);

        builder.insert(1, "exit!");
        System.out.println(builder);

        System.out.println(builder.substring(5));

        System.out.println(builder.reverse());
    }
}
