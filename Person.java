abstract class Person {
    @Override
    public int hashCode() {
        System.out.println("Переопрделенный метод hashcode");
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Переопреденный метод equals");
        return super.equals(obj);
    }

    @Override
    public String toString() {
        System.out.println("Перепопределеныый метод toString'");
        return super.toString();
    }
}
