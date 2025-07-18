import java.util.HashSet;
import java.util.Set;

public class IntegerSetManual {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>();
       
        int passed = 0;
        int failed = 0;
         
        System.out.println("--- Starting CharSet Manual Tests ---");
        // Test 1: การสร้างเซตว่าง
        A.add(50);
        A.add(70);
        A.add(90);
        String s = "[50,70,90]";
        if (A.toString().replaceAll(" ", "").equals(s)) {
             System.out.println("PASSED: Add and sort works correctly.");
            passed++;
        }
         else {
            System.out.println("FAILED: There shouldn't be a gap or null but got " + A.toString());
            failed++;
         }
         

         // Test 2: การเพิ่มข้อมูลที่ซ้ำซ้อน
         System.out.println("\n--- Testing adding duplicates ---");
        A.add(50); // เพิ่ม 50 ที่มีอยู่แล้ว
         if(A.size() == 3) {
            System.out.println("PASSED: Adding a duplicate does not change the size.");
            passed++;
         }else {
            System.out.println("FAILED: Size should be 3 but got " + A.size());
            failed++;
        }

        // Test 3: การลบข้อมูล
        System.out.println("\n--- Testing remove() ---");
        A.remove(50);
        String expected2 = "[70,90]";
        
         
        if (A.toString().replaceAll(" ", "").equals(expected2)) {
            System.out.println("PASSED: Remove works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected2 + " but got " + A.toString());
            failed++;
        }


        // Test 4: การตรวจสอบข้อมูล (contains)
        System.out.println("\n--- Testing contains() ---");
        if (A.contains(50) && !A.contains(70)) {
            System.out.println("PASSED: Contains works correctly after removal.");
            passed++;
        } else {
            System.out.println("FAILED: Contains check is incorrect.");
            failed++;
        }



         // --- สรุปผล ---
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }
    }
}
