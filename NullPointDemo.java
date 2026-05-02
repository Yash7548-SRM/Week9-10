class NullPointerDemo {
    static void handle() {
        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] args) {
        handle();
    }
}