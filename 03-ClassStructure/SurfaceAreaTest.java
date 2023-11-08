public class SurfaceAreaTest {
    public static void main(String[] args) {
        System.out.println("Rectangle area (5,2) is ");
        System.out.println(SurfaceArea.rectangle(5,2));

        System.out.println("Circle area (3) is ");
        System.out.println(SurfaceArea.circe(3));

        System.out.println("Tringle area (3,4) is ");
        System.out.println(SurfaceArea.triangle(3,4));

        System.out.println("Tringle cuboid (3,4,5) is ");
        System.out.println(SurfaceArea.cuboid(3,4,5));

        System.out.println("Tringle sphere (5) is ");
        System.out.println(SurfaceArea.sphere(5));

        System.out.println("Tringle cone (3,4) is ");
        System.out.println(SurfaceArea.cone(3,4));
    }
}
