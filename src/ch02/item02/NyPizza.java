package ch02.item02;

import java.util.Objects;

/**
 * Name:NyPizza
 * Desc :
 * Developer :82108
 * Date : 2019-07-07
 * Time : 오후 4:02
 */
public class NyPizza extends Pizza {
    public enum Size {SMALL, MEDIUM, LARGE}
    private final Size size;


    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }



    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;

    }
}
