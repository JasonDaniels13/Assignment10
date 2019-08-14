package com.jasond.domain.demography;


public class Gender {

    private String id, descr;

    private Gender(){

    }
    public void setDescription(String description) {
        this.descr = description;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Gender(Builder builder){
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
        return "Gender: " + "\n\n" +
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
        public Builder copy(Gender gender){
            this.id = id;
            this.descr = descr;
            return this;
        }
        public Gender build(){
            return new Gender(this);
        }
    }
}
