public interface Employe {
    public int getId();

    public String getName();

    public double getSalary();

    public void print();

    public void add(Employe employee);

    public void remove(Employe employee);

    public Employe getChild(int i);
}
