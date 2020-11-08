package com.test.question.q22;





public class Example_1
{
    public static void main(String[] args) throws Exception
    {

        Item item = new Item();
        item.size = 10;
        item.data = 20;
        item.color = "red";

        System.out.println("item.size : " + item.size);
        System.out.println("item.data : " + item.data);
        System.out.println("item.color : " + item.color);

    } //main

} //Example

class Item {
    public int size;
    public int data;
    public String color;
}
