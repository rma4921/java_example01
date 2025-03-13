package chap06.annotation;

@AnnotationName
public class AnnotationExample {
    @AnnotationName
    private String field;

    @AnnotationName
    public AnnotationExample(String field) {
        this.field = field;
    }
    @AnnotationName
    public String getFeild() {
        return this.field;
    }
}
