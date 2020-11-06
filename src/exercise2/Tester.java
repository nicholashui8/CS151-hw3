package exercise2;

public class Tester {
    public static void main(String[] args) {
        GraphView gv = new GraphView();
        Model model = new Model(gv);
        NumberView nv = new NumberView(model);
    }
}

