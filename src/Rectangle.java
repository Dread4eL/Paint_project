import java.awt.*;

public class Rectangle extends Figure {

    @Override
    public void setBoundingBox(int heightBB, int widthBB) {
        this.height = heightBB;
        this.width = widthBB;
    }

    @Override
    public void draw(Graphics g) {

    }

    public Rectangle (java.awt.Color C,Point P){
        super(C,P);

    }
}
