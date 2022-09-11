class Yard {
    boolean grass;
    int width;
    int height;
    String color;

    public void setGrass(boolean grass) { // Setters
        this.grass = grass;
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

    public boolean isGrass() { // Getters
        return grass;
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
