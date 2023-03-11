package Generics.Enum;

enum Operation {
    PLUS {
        public int apply(int x, int y) {
            return x + y;
        }
    },
    MINUS {
        public int apply(int x, int y) {
            return x - y;
        }
    },
    TIMES {
        public int apply(int x, int y) {
            return x * y;
        }
    },
    DIVIDE {
        public int apply(int x, int y) {
            return x / y;
        }
    };

    public abstract int apply(int x, int y);
}

public class Enum1 {
    public static void main(String[] args) {
        int x = 10, y = 6;
        for (Operation op : Operation.values()) {
            System.out.printf("%d %s %d = %d%n", x, op, y, op.apply(x, y));
        }
    }
}
