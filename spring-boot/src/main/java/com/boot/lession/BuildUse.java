package com.boot.lession;


public class BuildUse {
    /**
     * 实体类定义了属性，产品型号
     */
   static class Product {
        private String name;
        private String type;

        public void showProduct() {
            System.out.println("名称：" + name);
            System.out.println("型号：" + type);

        }

        public void setName(String name) {
            this.name = name;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    /**
     * 抽象类定义了抽象方法分别是set值和get值
     */
    abstract static class Builder {
        public abstract void setPart(String arg1, String arg2);

        public abstract Product getProduct();
    }

    /**
     * 继承抽象类，实现抽象方法
     */
   static class ConcreteBuilder extends Builder {
        private Product product = new Product();

        public Product getProduct() {
            return product;
        }

        public void setPart(String arg1, String arg2) {
            product.setName(arg1);
            product.setType(arg2);
        }
    }

    /**
     * 公开的方法，新建方法类
     */
    public static class Director {
        private Builder builder = new ConcreteBuilder();

        public Product getAProduct() {
            builder.setPart("宝马汽车", "X7");
            builder.setPart("华为手机", "P40");
            return builder.getProduct();
        }

        public Product getBProduct() {
            builder.setPart("奥迪汽车", "Q5");
            return builder.getProduct();
        }
    }

    public static class Client {

        public static void main(String[] args) {
            Director director = new Director();
            Product product1 = director.getAProduct();
            product1.showProduct();
            Product product2 = director.getBProduct();
            product2.showProduct();
        }
    }

}
