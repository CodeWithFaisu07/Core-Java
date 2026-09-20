package javaEightFeatures;

public class InheritanceOfFunctionalInterface {


    }
 interface  Parents {
    public void satHello();

 }
 @FunctionalInterface
 interface Child extends Parents{
    //public void sayBye(); -> its throw an error because Parent class have already have a static Method in Parent interface


 }

