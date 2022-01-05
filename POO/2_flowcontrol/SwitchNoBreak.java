public class SwitchNoBreak {
        public static void main(String [] args) {
                int z=2;
                final short x=2;
                switch (z) {
                        case x: System.out.print("0 ");
                        case x-1: System.out.print("1 ");
                        case x-2: System.out.print("2 ");
                }
                System.out.println("\n");
        }
 }
