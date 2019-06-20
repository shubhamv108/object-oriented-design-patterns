package builder;

import java.util.ArrayList;
import java.util.List;

class Object1 {

    private Object attribute;

    public Object attribute() {
        return attribute;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private List<Object1> objects = new ArrayList<>();

        private Object attribute;

        public Object1 build() {
            Object1 object = new Object1();
            object.attribute = this.attribute;
            return object;
        }

//        public List<Object1> build() {
//            return objects;
//        }

        public Builder attribute (Object attribute) {
            this.attribute = attribute;
            return this;
        }

//        public Builder and() {
//            Object1 object = new Object1();
//            object.attribute = this.attribute;
//            objects.add(object);
//            return this;
//        }

    }

    public static void main(String[] args) {
        Object1 object = Object1.builder().attribute(null).build();
//        List<Object1> objects = Object1.builder().attribute(null).and().build();
    }

}
