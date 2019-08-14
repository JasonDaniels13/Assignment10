package com.jasond.domain.demography;

public class Race {

    private String id, descr;

    private Race(){

    }
    public Race(Builder builder){
        this.id = builder.id;
        this.descr = builder.descr;
    }



    public String getId() {
        return id;
    }

    public String getDescr() {
        return descr;
    }

    @Override
    public String toString() {
        return "Race: " + "\n\n" +
                "id - " + id + "\n" +
                "Description - " + descr + "\n";
    }

    public static class Builder{
        private String id, descr;

        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder descr(String descr){
            this.descr = descr;
            return this;
        }
        public Builder copy(Race race){
            this.id = id;
            this.descr = descr;
            return this;
        }
        public Race build(){
            return new Race(this);
        }
    }
}