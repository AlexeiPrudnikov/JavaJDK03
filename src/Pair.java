public class Pair<T, E> {
    private T firstValue;
    private E secondValue;

    public T getFirst() {
        return firstValue;
    }
    public void setFirst(T value){
        firstValue = value;
    }
    public E getSecond() {
        return secondValue;
    }
    public void setSecond(E value){
        secondValue = value;
    }
    public Pair(T firstValue, E secondValue){
        this.firstValue = firstValue;
        this.secondValue = secondValue;

    }
    @Override
    public String toString() {
        return firstValue + " - " + secondValue;
    }
}
