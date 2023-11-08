public class SurfaceArea {
    static float rectangle(float a, float b) {
        return a*b;    
    }

    static double circe(double r){
        return (Math.PI*r*r);
    }

    static float triangle(float a, float h) {
        return (a*h)/2;
    }

    static double cuboid(double l, double w, double h) {
        return (l * w + w * h + l * h) * 2;
    }

    static double sphere(double r) {
        return 4 * Math.PI * r * 2;
    }

    static double cone(double r, double h) {
        double l = Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
        return Math.PI * Math.pow(r, 2) + Math.PI * r * l;
    }

}
