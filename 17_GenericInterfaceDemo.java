interface Repository<T>{ void save(T item); T get(int index); }
class InMemoryRepository<T> implements Repository<T>{
    private java.util.List<T> list=new java.util.ArrayList<>();
    public void save(T item){list.add(item);} public T get(int i){return list.get(i);}
    public static void main(String[] args){ InMemoryRepository<String> r=new InMemoryRepository<>(); r.save("Hi"); System.out.println(r.get(0)); }
}