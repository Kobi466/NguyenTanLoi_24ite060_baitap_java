package bai5.bai5_1;

public class Line {
    private Point begin;
    private Point end;
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public String toString() {
        return "Line[begin=" + begin + ", end=" + end + "]";
    }
    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    //Tra ve gia tri ban dau va ket thuc
    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }
    //Dat gia tri ban dau va ket thuc
    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }
    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }
    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    public void setEndY(int endY) {
        this.end.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        this.end.setX(endX);
        this.end.setY(endY);
    }
    public void setBeginXY(int beginX, int beginY) {
        this.begin.setX(beginX);
        this.begin.setY(beginY);
    }

    public int getLength(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return (int)Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }
    // tra ve goc radian
    public double getGrandient(){
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    }
}

