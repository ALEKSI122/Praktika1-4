package po_java.XREN;

public class sdfg {
    public static void main(String[] args) {
        int[] array =new int[5];
        int[][] Mas = new int[5][8];
        // Проверка по строкам
        for(int i=0;i<Mas.length;i++){
            // Проверка по столбцам
            for(int j=0;j<Mas[i].length;j++){
                // Рандом
                Mas[i][j]=(int)(Math.random()*90)+10;
                // Вывод нашего массива
                System.out.print(Mas[i][j]+" ");
            }
            System.out.println();
        }
    }
}