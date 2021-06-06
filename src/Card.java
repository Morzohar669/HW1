public class Card {
    final int num;
    final Shape shape;

    public Card(int num, Shape shape) {
        this.num = num;
        this.shape = shape;
    }

    int compare(Card other) {
        if (this.num < other.num) {
            return -1;

        } else if (this.num == other.num) {
            return 0;

        } else {
            return 1;
        }
    }

    public String toString() {
        if (num == 11) {
            return "Jack of " + shape;
        }
        if (num == 12) {
            return "Queen of " + shape;
        }
        if (num == 13) {
            return "King of " + shape;
        }
        if (num == 1) {
            return "Ace of " + shape;
        }
        return num + " of " + shape;
    }

    public Shape getShape() {
        return shape;
    }

    public int getNum() {
        return num;
    }

}