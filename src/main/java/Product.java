public class Product{

    private String surface = new String();
    private String color = new String();
    private String dimensions = new String();
    private float weight;
    private float price;
    private int pro_id;


    public float getPrice() {
        return price;
    }

    public float getWeight() {
        return weight;
    }

    public int getPro_id() {
        return pro_id;
    }

    public String getColor() {
        return color;
    }

    public String getDimensions() {
        return dimensions;
    }

    public String getSurface() {
        return surface;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setPro_id(int pro_id) {
        this.pro_id = pro_id;
    }

    public void setSurface(String surface) {
        this.surface = surface;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
