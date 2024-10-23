public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.add(3);
        container.add(7);
        container.add(1);
        container.add(8);
        container.add(5);
        System.out.println("Количество элементов в контейнере: " + container.size());

        for (int i = 0; i < container.size(); i++) {
            System.out.println("Элемент по индексу " + i + ": " + container.get(i));
        }
        container.remove(2);
        System.out.println("После удаления первого элемента:");

        // Выводим оставшиеся элементы
        for (int i = 0; i < container.size(); i++) {
            System.out.println("Элемент по индексу " + i + ": " + container.get(i));
        }

        // Проверяем количество элементов после удаления
        System.out.println("Количество элементов в контейнере: " + container.size());

    }
}
