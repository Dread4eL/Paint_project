import java.awt.*;

public abstract class Figure {

    protected int width;
    protected int height ;
    protected Point Origin;
    protected Color Color;
    public abstract void setBoundingBox (int heightBB, int widthBB);


    public abstract void draw (Graphics g);

    public Figure(Color C,Point Origin) {
        this.Color = C;
        this.Origin = Origin;
    }

    @Override
    public String toString(){
        return "Color: "+this.Color+"\n"+"Width : "+this.width+"\n"+"Height : "+this.height+"\n"+"Origin : "+this.Origin;
    }
}
