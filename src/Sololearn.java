public class Sololearn{
    private String color;
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        this.color=c;
    }
    public static void main(String[] args) {
        Sololearn v1 = new Sololearn();
        v1.setColor("Red");
        System.out.println(v1.getColor());

        Sololearn v2 = new Sololearn();
        v2.setColor("Green");
        System.out.println(v2.getColor());
    }

}
