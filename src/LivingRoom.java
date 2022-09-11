class LivingRoom {
    private int windows;
    private boolean tv;
    private boolean homeTeather;
    private int width;
    private int height;
    private String color;

    public void setWindows(int windows) { // Setters
        this.windows = windows;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public void setHomeTeather(boolean homeTeather) {
        this.homeTeather = homeTeather;
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

    public int getWindows() { // Getters
        return windows;
    }

    public boolean getTv() {
        return tv;
    }

    public boolean getHomeTeather() {
        return homeTeather;
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
