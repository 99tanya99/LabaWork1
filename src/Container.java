public class Container
{
        private Object[] elements;
        private int size;

        /**
         * Конструктор класса. Массив со значением по умолчанию 10.
         */
        public Container() {
            elements = new Object[10];
            size = 0;
        }

        /**
         * Добавление элемента
         *
         * @param element Элемент, который добавляем
         */
        public void add(Object element) {
            if (size == elements.length) {
                resize();
            }
            elements[size++] = element;
        }

        /**
         * Удаление элемента по индексу
         * @param index индекс эдлемента
         * @return элемент по индексу
         */
        public Object get(int index)
        {
            if (index < 0 || index >= size)
            {
                throw new
                        IndexOutOfBoundsException("Индекс вне диапазона");
            }
            return elements[index];
        }

        /**
         * Удаление элемента по индексу
         * @param index индекс элемента
         */
        public void remove(int index)
        {
            if (index < 0 || index >= size)
            {
                throw new
                        IndexOutOfBoundsException("Индекс вне диапазона");
            }
            for (int i = index; i < size-1;i++)
            {
                elements[i] = elements[i+1];
            }
            elements[--size] = null;
        }

        /**
         * Возвращает текущее количество элементов в контейнере
         * @return количество элементов
         */
        public int size()
        {
            return size;
        }

    /**
     * Увеличение размера массива
     */
    private void resize() {
            Object[] newArray = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }

}