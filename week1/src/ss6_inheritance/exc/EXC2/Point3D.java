package ss6_inheritance.exc.EXC2;

public class Point3D extends Point2D {
    private float z;

    Point3D() {
    }

    Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ (float x, float y, float z){
        setXY(x,y);
        this.z = z;
    }
    public float [] getXYZ(){
        return new float[] {getX(),getY(),z};
    }


    @Override
    public String toString() {
        return super.toString() + " and z = "+z;
    }
}
