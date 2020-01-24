package Exercise_3;

import java.util.Objects;

enum SeasonOfYear {
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER,
}

public class Tree extends Leaf {
    // region Properties
    private int treeAge;
    private double treeHeight;
    private boolean bloomTree;
    // end Properties

    // region Constructors
    public Tree() {
    }

    public Tree(int treeAge, double treeHeight, boolean bloomTree) {
        this.treeAge = treeAge;
        this.treeHeight = treeHeight;
        this.bloomTree = bloomTree;
    }
    // end Constructors

    // region getter and setter

    public int getTreeAge() {
        return treeAge;
    }

    public double getTreeHeight() {
        return treeHeight;
    }

    public boolean isBloomTree() {
        return bloomTree;
    }

    public void setTreeAge(int treeAge) {
        this.treeAge = treeAge;
    }

    public void setTreeHeight(double treeHeight) {
        this.treeHeight = treeHeight;
    }

    public void setBloomTree(boolean bloomTree) {
        this.bloomTree = bloomTree;
    }
    // end getter and setter

    // region equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tree tree = (Tree) o;
        return treeAge == tree.treeAge &&
                Double.compare(tree.treeHeight, treeHeight) == 0 &&
                bloomTree == tree.bloomTree;
    }

    @Override
    public int hashCode() {
        return Objects.hash(treeAge, treeHeight, bloomTree);
    }
    // end equals and hashCode

    // region toString
    @Override
    public String toString() {
        return "Tree{" +
                "treeAge=" + treeAge +
                ", treeHeight=" + treeHeight +
                ", bloomTree=" + bloomTree +
                '}';
    }
    // end toString

    // region methods
    void bloom(){
        Leaf leaf = new Leaf();
        if(isBloomTree()){
            leaf.setColor("Green");
        } else {
            leaf.makeLeafsYellow();
            leaf.makeLeafsFall();
        }
    }
    // end methods
}
