import java.awt.*;

public class Square extends Rectangle{

    public Square(java.awt.Color C, Point P) {
        super(C, P);
    }

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.height=widthBB;
        this.width=widthBB;
    }
}

