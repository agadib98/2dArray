

public class task3 {
    public static void main(String[] args){
        int [][] array =new int[3][3];
     int ld =0,rd = 0;
        array[0][0] =3;
        array[0][1] =4;
        array[0][2] =9;
        array[1][0] =4;
        array[1][1] =6;
        array[1][2] =0;
        array[2][0] =2;
        array[2][1] =9;
        array[2][2] =11;

        int row =0;
        int collum = 0;
        System.out.println("the sum of row");
        for(int i =0;i<3;i++){
            row = 0;
            collum = 0;

            for(int j =0;j<3;j++){
                if(i == j)
                   ld=ld+array[i][j];
                if(i+j == 2)
                    rd=rd+array[i][j];

                row = row+array[i][j];
                collum = collum+array[j][i];
                    }

            System.out.println("row"+(i+1)+" "+row);

                }
        System.out.println("the sum of collum");
        for(int i =0;i<3;i++){
            collum = 0;

            for(int j =0;j<3;j++){
                collum = collum+array[j][i];
            }
            System.out.println("collum"+(i+1)+" "+collum);}
        System.out.println("the sum of left diagonal "+ld);
        System.out.println("the sum of right diagonal "+rd);
            }
}
