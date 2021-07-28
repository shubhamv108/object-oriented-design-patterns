package builder;

public class Object1 {

    private Object attribute;

    private Object setAttribute(final Object attribute) {
        return this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "Object1{" +
                "attribute=" + attribute +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder implements IBuilder<Object> {

        private Object attribute;

        public Builder withAttribute (Object attribute) {
            this.attribute = attribute;
            return this;
        }

        @Override
        public Object1 build() {
            Object1 object = new Object1();
            object.setAttribute(this.attribute);
            return object;
        }

    }

    public static void main(String[] args) {
        Object1 object1 = Object1.builder().withAttribute("Attribute-Value").build();
        System.out.println(
                object1
        );
    }

}
