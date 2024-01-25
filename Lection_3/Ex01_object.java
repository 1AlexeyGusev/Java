package Lection_3;

public class Ex01_object {
    public static void main(String[] args) {
        //     Object o = 1; GetType(o);         // java.lang.Integer
        //     o = 1.2; GetType(o);              // java. lang.Double
        // }
        // static void GetType(Object obj){
        //     System.out.println(obj.getClass().getName());
        // }

        //=============================
        // static Object Sum(Object a, Object b) {
        //     if (a instanceof Double && b instanceof Double) {
        //         return (Object) ((Double) a + (Double) b);
        //     } else if (a instanceof Integer && b instanceof Integer) {
        //         return (Object) ((Integer) a + (Integer) b);
        //     } else
        //         return 0;
        // }

        //Массивы========================================================
        // проблема, как увеличить размер массива?
        // есть массив из 2 элементов

        // int[] a = new int[] { 1, 9 };
        // int[] b = new int[3];
        // System.arraycopy(a, 0, b, 0, a.length);

        // for (int i : a) {
        //     System.out.printf("%d", i);  // 1 9
        // } 
        // for (int j : b) {
        //     System.out.printf("%d", b); // 0 9 0 0 0 0 0 0 0 0 
        // }
        
//Метод добавления элемента массива=============================
             
    static int[] AddItem(int[] array, int item){
        int length= array.length;
        int[] temp = new int[length+1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
        int[] a = new int[] {0,9};
        for(int i:a){
            System.out.printf("%d", i);
        }
        a=AddItem(a,2);
        a=AddItem(a,3);
        for(int j:a){
            System.out.printf("%d",j);
        }

    }
}