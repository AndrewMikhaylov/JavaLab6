public class Sweet {
    private String name;
    private String colour;
    private int price;
    private int weight;
    private int containchokolate;
    public Sweet(String name, String colour, int price, int weight, int containchokolate){
        this.name = name;
        this.colour = colour;
        this.price = price;
        this.weight = weight;
        this.containchokolate = containchokolate;
    }
    public void writesweet(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return"Назва цукерки: " + name +
                "; Колір цукерки: " + colour  +
                "; Ціна цукерки: " + price  +
                "; Вага цукерки: " + weight  +
                "; Вміст шоколаду: " + containchokolate;
    }

    public int compareTo(Sweet o) {

        return this.getPrice() - o.getPrice();
    }
    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getContainchokolate() {
        return containchokolate;
    }
}
