class MatAddition
{
public static void main(String arg[])
{
int i,j;
int matA[][]={{1,3,4},{2,4,3},{3,4,5}};
int matB[][]={{1,3,4},{2,4,3},{1,2,4}};
int matC[][]=new int[3][3];
System.out.println("MATRIX ADDITION:");
for(i=0;i<=2;++i)
{
for(j=0;j<=2;++j)
{
matC[i][j]=(matA[i][j]+matB[i][j]);
}
}
System.out.println("MatrixA:");
for(i=0;i<=2;++i)
{
for(j=0;j<=2;++j)
{
System.out.print(""+matA[i][j]);
}
System.out.println();
}
System.out.println("MatrixB:");
for(i=0;i<=2;++i)
{
for(j=0;j<=2;++j)
{
System.out.print(""+matB[i][j]);
}
System.out.println();
}
System.out.println("The addition of given matrices is:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;++j)
{
System.out.print(""+matC[i][j]);
}
System.out.println();
}
}
}
