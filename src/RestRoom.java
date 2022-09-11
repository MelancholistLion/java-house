class RestRoom {
    private boolean showerCabin;
    private int width;
    private int height;
    private String color;

    public void setShowerCabin(boolean showerCabin) { // Getters
        this.showerCabin = showerCabin;
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

    public boolean getShowerCabin() { // Getters
        return showerCabin;
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
