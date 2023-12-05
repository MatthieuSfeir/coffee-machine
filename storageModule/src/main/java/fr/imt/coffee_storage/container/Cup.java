package fr.imt.coffee_storage.container;

public class Cup extends Container{

    public Cup(double capacity){
        super(capacity);
    }

    public Cup(Container container){
        super(container);
    }
}
