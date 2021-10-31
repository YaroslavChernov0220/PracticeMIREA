package ru.mirea.Practice16;

public class Main {
    public static void main(String[] args) {
        OrderManager k = new OrderManager();
        Dish[] d1 = new Dish[] {
                new Dish(220, "Суп", "Описание"),
                new Dish(550,"Лазанья", "Описание"),
                new Dish(99,"Пюре", "Описание"),
                new Dish(199,"Хачапури по-аджарски", "Описание"),
        };
        RestaurantOrder od1 = new RestaurantOrder(d1);
        k.add(od1,1);
        k.add("1 Стол",od1);
        String[] result = k.getOrders(1).dishesNames();
        for (String it: result)
            if (it != null)
                System.out.println(it);
        System.out.println(k.ordersCostSummary());
        System.out.println("=======");
        System.out.println("HashMap");
        System.out.println("=======");
        String[] result2 = k.getOrders("1 Стол").dishesNames();
        for (String it: result2)
            if (it != null)
                System.out.println(it);
        System.out.println(k.ordersCostSummary());
        System.out.println("=======");
        System.out.println("Drink");
        System.out.println("=======");
        Drink[] d2 = new Drink[] {
                new Drink(89,"BLACK_TEA", "Описание"),
                new Drink(125,"JUICE", "Описание"),
                new Drink(100,"COFFEE", "Описание"),
                new Drink(50,"MILK", "Описание"),
        };
        InternetOrder od2 = new InternetOrder(d2);
        String[] result3 = od2.dishesNames();
        for (String it: result3)
            if (it != null)
                System.out.println(it);
        System.out.println(od2.costTotal());
    }
}