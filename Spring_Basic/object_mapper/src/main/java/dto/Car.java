package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.UnsupportedEncodingException;

public class Car {

    private String name;

    @JsonProperty("car_number")
    private String carNumber;

    @JsonProperty("TYPE")
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatNumber() {
        return carNumber;
    }

    public void setCatNumber(String catNumber) {
        this.carNumber = catNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", catNumber='" + carNumber + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
