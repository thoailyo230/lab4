public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Cylinder với bán kính 2.4, màu sắc đỏ, và chiều cao 10
        cau2 cylinder = new Cylinder(2.4,"red",10);

        // In diện tích và thể tích của hình trụ
        System.out.println("Area: " + cylinder.getArea());
        System.out.println("Volume: " + ((Cylinder) cylinder).getVolume());
    }
}
