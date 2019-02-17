package models;

public interface Observable<T>
{
    public T getInstance();
    public  void  register(Observer<T> observer);
    public void unregister(Observer<T> observer);
    public void notifyObservers();
}
