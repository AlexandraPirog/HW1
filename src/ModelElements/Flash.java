package ModelElements;

import java.awt.*;

public class Flash {


    public Point3D points;
    public Angle3D angle;
    public Color color;
    public float Power;

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D points) {
        this.points = points;
    }

}
