class BedRoom {
    private BedSize bedSize;
    private boolean tv;
    private int width;
    private int height;
    private String color;

    public void setBedSize(BedSize bedSize) { // Setters
        this.bedSize = bedSize;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public BedSize getBedSize() { // Getters
        return bedSize;
    }

    public boolean getTv() {
        return tv;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
