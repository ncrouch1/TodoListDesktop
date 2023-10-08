public class Todo {

    private String todo;
    private int rank;

    public Todo(String todo, int rank) {
        this.todo = todo;
        this.rank = rank;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String toString() {
        return todo + " " + rank;
    }
}
