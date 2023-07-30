package com.hydroyura.articles.patterns.composite.factory;

public class Starter {

    public static void main(String[] args) {

        CustomPart part1 = new CustomPart("part1");
        CustomPart part2 = new CustomPart("part2");
        CustomPart part3 = new CustomPart("part3");
        CustomPart part4 = new CustomPart("part4");
        CustomPart part5 = new CustomPart("part5");

        Assembly asm1 = new Assembly("asm1")
                .addElement(part1, 2L)
                .addElement(part2, 1L)
                .addElement(part3, 2L)
                .addElement(part5, 2L);

        Assembly asm2 = new Assembly("asm2")
                .addElement(part1, 3L)
                .addElement(part2, 2L)
                .addElement(asm1, 1L);

        Assembly asm3 = new Assembly("asm3")
                .addElement(part4, 3L)
                .addElement(part5, 2L)
                .addElement(asm1, 2L)
                .addElement(asm2, 1L);

        System.out.println("--- Result ---");
        asm3.getSpecification().forEach((key, value) -> System.out.println("element number = " + key.getNumber() + "; count = " + value));
    }

}
