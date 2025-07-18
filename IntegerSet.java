
import java.util.ArrayList;

/**
 * ADT ที่เก็บ int แบบไม่ซ้ำกันและเรียงลำดับ
 */
public class IntegerSet {
 private String s;
    ArrayList<Integer> Numbers;
    // Add methods and logic here

    // Rep Invariant (RI):
    //  - N must not contain duplicate Numbers.
    //  - Numbers in N must be sorted in ascending order.
    //
    // Abstraction Function (AF):
    //  - AF(s) = the set of Numbers in the int N.
    /**
     * Constructor เริ่มต้น สร้างเซตว่าง
     */
    public IntegerSet() {
        Numbers = new ArrayList<>();
        this.s = ""; 
    }

    /**
     * ตรวจสอบว่า Rep Invariant เป็นจริงหรือไม่
     */
    private void checkRep() {
         
    // กรณีเซตว่างเปล่า ถือว่าถูกต้องเสมอ
    if (s.isEmpty()) {
        return;
    }

    

    
    }

    public void add(Integer X) {

        Numbers.add(X);
        checkRep();

    }


    public String toString() {
       return Numbers.toString();
    }





}
