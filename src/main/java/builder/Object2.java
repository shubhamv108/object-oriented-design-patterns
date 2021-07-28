package builder;

import java.util.List;

class Object2 {

    private String attribute;

    private void setAttribute(final String attribute) {
        this.attribute = String.valueOf(attribute);
    }

    @Override
    public String toString() {
        return "Object2{" +
                "attribute=" + this.attribute +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends AbstractSequenceBuilder<Builder, Object2> {

        private String attribute;

        public Builder withAttribute(final String attribute) {
            this.attribute = attribute;
            return this;
        }

        @Override
        public Builder and() {
            Object2 object2 = new Object2();
            object2.setAttribute(this.attribute);
            super.add(object2);
            this.reset();
            return this;
        }

        @Override
        public void reset() {
            this.attribute = null;
        }
    }

    public static void main(String[] args) {
        List<Object2> objects =
                Object2.builder()
                    .withAttribute("Attribute-Value")
                .and()
                    .withAttribute("Attribute-Value2")
                .and()
                .build();

        System.out.println(
                objects
        );
    }

}
