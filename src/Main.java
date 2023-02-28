import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, kingdomName;
        final int  SIZE_OF_MAP = 10000;
        int[][] regions = new int[SIZE_OF_MAP][SIZE_OF_MAP];
        int op;
        Scanner input = new Scanner(System.in);
        // 0 - terra vazia
        // 1 - feudo do jogador
        // 2- feudo inimigo 1
        //3 - feudo inimigo 2
        // 4 - feudo inimigo 4
        fillFeudoinRegions(regions);
        Lord enemyLord1 = new Lord(30, 0, " Eduardo, o Imponente");
        Army enemyArmy1 = new Army();
       Feudo enemy1 = new Feudo("Sacro Império do Leste", 20000, 0.8, 900000, enemyLord1, enemyArmy1, 2);

       Lord enemyLord2 = new Lord(30,  0, "Pricipe Erevan ");
       Army enemyArmy2 = new Army();
       Feudo enemy2 = new Feudo("Principado de Arvendon", 2500, 0.1, 100000, enemyLord2, enemyArmy2, 3);

       Lord enemyLord3 = new Lord(80, 0, "Aethelred, o Ancião");
       Army enemyArmy3 = new Army();
       Feudo enemy3 = new Feudo("Reino de Petra", 300, 0, 2500, enemyLord3, enemyArmy3, 4);

       System.out.println("Começando criação do reino");
       System.out.println("Digite seu nome: ");
       name = input.nextLine();
       System.out.println("Digite o nome do seu reino");
       kingdomName = input.nextLine();

       Lord player = new Lord(20, 0, name);
       Army playerArmy = new Army();
       Feudo playerKingdom = new Feudo(kingdomName, 500, 0.1, 1000, player, playerArmy, 1);

        System.out.println("Digite a opção:\n [1] Visualizar informações \n [2] Ações");

    }

    public static void fillFeudoinRegions( int[][] regions)
    {
        int i,j;

        for(i = 5000; i < 5500; i++)
        {
            for(j=5000;j<5500;j++)
            {
                regions[i][j] = 1;
            }
        }

        for(i = 2500; i < 5500; i++)
        {
            for(j=1000;j<4400;j++)
            {
                regions[i][j] = 2;
            }
        }

        for(i = 0; i < 3000; i++)
        {
            for(j=7000;j<10000;j++)
            {
                regions[i][j] = 3;
            }
        }

        for(i = 6000; i < 8000; i++)
        {
            for(j=5000;j<7000;j++)
            {
                regions[i][j] = 4;
            }
        }


    }

}