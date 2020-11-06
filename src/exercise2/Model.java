package exercise2;

public class Model {

    private GraphView gv;

    public Model(GraphView gv) {
        this.gv = gv;
    }

    //model tells graphview to update whenever "update" button gets clicked
    public void update(int height1, int height2, int height3) {
        System.out.println("update coming from model");
        //tell graphview to update rectangle heights
        gv.updateGraph(height1, height2, height3);
    }
}
