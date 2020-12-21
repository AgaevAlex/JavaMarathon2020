package day18;

public class Node {
    private int value;
    private Node leftSon, rightSon;
    private boolean visited= false;

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Node(int value) {
        this.value = value;
        this.leftSon = null;
        this.rightSon = null;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

    public int getValue() {
        return value;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }
}
