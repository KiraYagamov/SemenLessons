package asdasdsafdsfdsf;

public class First {
    public static void main(String[] args) {
        First first = new First();
        first.start();
    }

    private void start(){
        System.out.println(getResult());
    }

    private boolean getResult() {
        String line = "0123456789";
        for (int i = 0; i < line.length(); i++) {
            if (count(line, line.charAt(i)) > 1){
                return false;
            }
        }
        return true;
    }
    private int count(String line, char ch){
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ch) count++;
        }
        return count;
    }
}
