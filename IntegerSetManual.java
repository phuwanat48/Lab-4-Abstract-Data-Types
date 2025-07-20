
public class IntegerSetManual {
    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;
        
       IntegerSet  A = new IntegerSet();
         
        System.out.println("--- Starting CharSet Manual Tests ---");
        // Test 1: การสร้างเพิ่มข้อมูล
        A.add(50);
        A.add(70);
        A.add(90);
        String s = "[50,70,90]";
        if (A.toString().replaceAll(" ", "").equals(s)) {
             System.out.println("Tase Case 1 :PASSED: Add and sort works correctly.");
            passed++;
        }
         else {
            System.out.println("Tase Case 1 :FAILED: There shouldn't be a gap or null but got " + A.toString());
            failed++;
         }
         

         // Test 2: การเรียงลำดับค่า
         System.out.println("\n--- Testing sorted in ascending  ---");
        A.add(30);
        A.add(20);
        A.add(5);
        String s1 = "[5,20,30,50,70,90]";
        if (A.toString().replaceAll(" ","").equals(s1)) {
            System.out.println("Tase Case 2 : PASSED: sort works correctly.");
            passed++;
        }else {
            System.out.println("Tast Case 2 : FAILED: exception " + A.toString() + " but got " + s1);
            failed++;
    }

        // Test 3: การเพิ่มข้อมูลที่ซ้ำซ้อน
        System.out.println("\n--- Testing adding redundant data ---");
        A.add(1); 
        A.add(30); //   30 ที่มีอยู่แล้ว
        A.add(5); //    5 ที่มีอยู่แล้ว
        A.add(-3);
        A.add(2); 
        A.add(4); 
        String s2 = "[-3,1,2,4,5,20,30,50,70,90]";
        if (A.toString().replaceAll(" ","").equals(s2)) {
            System.out.println("Tase Case 3 : PASSED: Adding a duplicate does not change the size.");
            passed++;
        }else {
            System.out.println("Tast Case 3 : FAILED: exception " + A.toString() + " but got " + s2);
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
