public class outer {
    int number=0;

    void outerMethod(){
        class Inner{
            public void print(){
                System.out.println("Mengakses inner class yang ke: " + (number++));
            }
        }

        Inner inner = new Inner();
        inner.print(); 
    }
}

class outerAccess{
    public static void main(String[] args) {
        outer out = new outer();
        out.outerMethod();
        out.outerMethod();
        out.outerMethod();
    }
}
