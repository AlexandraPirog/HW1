package ModelElements;

public class Camera {
    public Point3D points;
    public Angle3D angle;

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D poinst) {
        this.points = points;
    }
}
