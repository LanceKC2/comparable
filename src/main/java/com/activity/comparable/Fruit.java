package com.activity.comparable;

public class Fruit implements Comparable<Fruit> {
    private String fruitName;
    private String fruitDescription;
    private String fruitQuantity;

    public Fruit(){
        this.fruitName = fruitName;
        this.fruitQuantity = fruitQuantity;
        this.fruitDescription = "";
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public void setFruitQuantity(String fruitQuantity) {
        this.fruitQuantity = fruitQuantity;
    }

    public void setFruitDescription(String fruitDescription){
        this.fruitDescription = fruitDescription;
    }


    public String getFruitName() {
        return fruitName;
    }

    public String getFruitDescription() {
        return fruitDescription;
    }

    public String getFruitQuantity() {
        return fruitQuantity;
    }

    public Fruit(String fruitQuantity) {
        this.fruitQuantity = fruitQuantity;
        
    }


@Override
public int compareTo(Fruit that) {
    if(this.fruitName.compareTo(that.fruitName)<0){
        return -1;
    }else if (this.fruitName.compareTo(that.fruitName)>0){
        return 1;
    }else {

        if (this.fruitQuantity > that.fruitQuantity){
            return -1;
        }else if(this.fruitQuantity < that.fruitQuantity){
            return 1;
        }else{
            return 0;
        }
    }
}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("fruitName='").append(fruitName).append('\'');
        sb.append(", fruitDescription='").append(fruitDescription).append('\'');
        sb.append(", fruitQuantity='").append(fruitQuantity).append('\'');
        sb.append('}');
        return sb.toString();
    }


}