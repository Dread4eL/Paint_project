import java.awt.*;

public class Circle extends Ellipse{
    public Circle(java.awt.Color C, Point P) {
        super(C, P);
    }


    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.height=widthBB;
        this.width=widthBB;
    }
}
