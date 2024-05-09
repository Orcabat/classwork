import java.util.*;
public class MyProgram
{
    static double AtkCalculator(int level, double batk){
           double number = 5;
           for(int i = 1;i<level;i++){
               number = number+batk*0.02;
           }
           return number;
            
       }
    static double HPCalculator(int level, double bHealth){
        double number = 11;
        for(int i=1;i<level;i++){
            number = number+((bHealth*0.02)+1);
        }
        return number;
    }
    static double dfCalculator(int level, double df){
        double number = 5;
        for(int i = 1;i<level;i++){
            number = number+df*0.02;
            
        }
        return number;
    }
    public static void main(String[] args)
    {
       
       
       
       
       //base hp and attack inputters as well as level stuff
       Scanner scan = new Scanner(System.in);
       System.out.println("Input the base HP of your first pokemon");
       double bhp1 = scan.nextDouble();
       System.out.println("Input the base attack of your first pokemon");
       double batk1=scan.nextDouble();
       System.out.println("Input the level of your pokemon");
       int lvlNumeroUno = scan.nextInt();
       System.out.println("Enter the defense of your first pokemon: ");
       double bdf1 = scan.nextDouble();
       System.out.println("Enter the typing of your first pokemon: ");
       scan.nextLine();
       String typing1 = scan.nextLine();
       System.out.println("What is the name of your first pokemon: ");
       String name1 = scan.nextLine();
       
       System.out.println("Input the base HP of your second pokemon");
       double bhp2 = scan.nextDouble();
       System.out.println("Input the base attack of your second pokemon");
       double batk2 = scan.nextDouble();
       System.out.println("Input the level of your second pokemon");
       int lvlNumeroDos = scan.nextInt();
       System.out.println("Enter the defense of your second pokemon: ");
       double bdf2 = scan.nextDouble();
       System.out.println("Enter the typing of your second pokemon: ");
       scan.nextLine();
       String typing2 = scan.nextLine();
       System.out.println("What is the name of your second pokemon: ");
       String name2 = scan.nextLine();
       
       
       if(bhp1 == 44 && batk1 ==48){
       System.out.println("               _,........__");
       System.out.println("            ,-'            \"`-.");
       System.out.println("          ,'                   `-.");
       System.out.println("        ,'                        \\");
       System.out.println("      ,'                           .");
       System.out.println("      .'\\               ,\"\".       `");
       System.out.println("     ._.'|             / |  `       \\");
       System.out.println("     |   |            `-.'  ||       `.");
       System.out.println("     |   |            '-._,'||       | \\");
       System.out.println("     .`.,'             `..,'.'       , |`-.");
       System.out.println("     l                       .'`.  _/  |   `.");
       System.out.println("     `-.._'-   ,          _ _'   -\" \\  .     `");
       System.out.println("`.\"\"\"\"\"'-.`-...,---------','         `. `....__.");
       System.out.println(".'        `\"-..___      __,'\\          \\  \\     \\");
       System.out.println("\\_ .          |   `\"\"\"\"'    `.           . \\     \\");
       System.out.println("  `.          |              `.          |  .     L");
       System.out.println("    `.        |`--...________.'.        j   |     |");
       System.out.println("      `._    .'      |          `.     .|   ,     |");
       System.out.println("         `--,\\       .            `7\"\"' |  ,      |");
       System.out.println("            ` `      `            /     |  |      |    _,-'\"\"\"`-.");
       System.out.println("             \\ `.     .          /      |  '      |  ,'          `.");
       System.out.println("              \\  v.__  .        '       .   \\    /| /              \\");
       System.out.println("               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |");
       System.out.println("                `        .        `._ ___,j.  `/ .-       ,---.     |");
       System.out.println("                ,`-.      \\         .\"     `.  |/        j     `    |");
       System.out.println("               /    `.     \\       /         \\ /         |     /    j");
       System.out.println("              |       `-.   7-.._ .          |\"          '         /");
       System.out.println("              |          `./_    `|          |            .     _,'");
       System.out.println("              `.           / `----|          |-............`---'");
       System.out.println("                \\          \\      |          |");
       System.out.println("               ,'           )     `.         |");
       System.out.println("                7____,,..--'      /          |");
       System.out.println("                                  `---.__,--.'");
        typing1 = "water";
       }
       
       if(bhp1 == 39 && batk1 ==52){
           System.out.println("              _.--\"\"`-..");
           System.out.println("            ,'          `.");
           System.out.println("          ,'          __  `.");
           System.out.println("         /|          \" __   \\");
           System.out.println("        , |           / |.   .");
           System.out.println("        |,'          !_.'|   |");
           System.out.println("      ,'             '   |   |");
           System.out.println("     /              |`--'|   |");
           System.out.println("    |                `---'   |");
           System.out.println("     .   ,                   |                       ,\".");
           System.out.println("      ._     '           _'  |                    , ' \\ `");
           System.out.println("  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|");
           System.out.println("  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\");
           System.out.println("-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .");
           System.out.println("  `,         \"\"\"\"'     `.              ,'         |   |  ',,");
           System.out.println("    `.      '            '            /          '    |'. |/");
           System.out.println("      `.   |              \\       _,-'           |       ''");
           System.out.println("        `._'               \\   \"\\                .      |");
           System.out.println("           |                '     \\                `._  ,'");
           System.out.println("           |                 '     \\                 .'|");
           System.out.println("           |                 .      \\                | |");
           System.out.println("           |                 |       L              ,' |");
           System.out.println("           `                 |       |             /   '");
           System.out.println("            \\                |       |           ,'   /");
           System.out.println("          ,' \\               |  _.._ ,-..___,..-'    ,'");
           System.out.println("         /     .             .      `!             ,j'");
           System.out.println("        /       `.          /        .           .'/");
           System.out.println("       .          `.       /         |        _.'.'");
           System.out.println("        `.          7`'---'          |------\"'_.'");
           System.out.println("       _,.`,_     _'                ,''-----\"'");
           System.out.println("   _,-_    '       `.     .'      ,\\");
           System.out.println("   -\" /`.         _,'     | _  _  _.|");
           System.out.println("    \"\"--'---\"\"\"\"\"'        `' '! |! /");
           System.out.println("                            `\" \" -'");
           typing1 = "fire";
       }
       
       System.out.println("*****************************");
       System.out.println("This is your first pokemon, "+name1+":");
       int atk1 = (int)(AtkCalculator(lvlNumeroUno, batk1));
       int hp1 = (int)(HPCalculator(lvlNumeroUno,bhp1));
       int df1 = (int)(dfCalculator(lvlNumeroUno, bdf1));
       System.out.println("Typing: "+typing1);
       System.out.println("Attack: "+atk1+"             ");
       System.out.println("HP: "+hp1+"                ");
       System.out.println("******************************");
       
       
       
       
       
       if(bhp2 == 44 && batk2 ==48){
       System.out.println("               _,........__");
       System.out.println("            ,-'            \"`-.");
       System.out.println("          ,'                   `-.");
       System.out.println("        ,'                        \\");
       System.out.println("      ,'                           .");
       System.out.println("      .'\\               ,\"\".       `");
       System.out.println("     ._.'|             / |  `       \\");
       System.out.println("     |   |            `-.'  ||       `.");
       System.out.println("     |   |            '-._,'||       | \\");
       System.out.println("     .`.,'             `..,'.'       , |`-.");
       System.out.println("     l                       .'`.  _/  |   `.");
       System.out.println("     `-.._'-   ,          _ _'   -\" \\  .     `");
       System.out.println("`.\"\"\"\"\"'-.`-...,---------','         `. `....__.");
       System.out.println(".'        `\"-..___      __,'\\          \\  \\     \\");
       System.out.println("\\_ .          |   `\"\"\"\"'    `.           . \\     \\");
       System.out.println("  `.          |              `.          |  .     L");
       System.out.println("    `.        |`--...________.'.        j   |     |");
       System.out.println("      `._    .'      |          `.     .|   ,     |");
       System.out.println("         `--,\\       .            `7\"\"' |  ,      |");
       System.out.println("            ` `      `            /     |  |      |    _,-'\"\"\"`-.");
       System.out.println("             \\ `.     .          /      |  '      |  ,'          `.");
       System.out.println("              \\  v.__  .        '       .   \\    /| /              \\");
       System.out.println("               \\/    `\"\"\\\"\"\"\"\"\"\"`.       \\   \\  /.''                |");
       System.out.println("                `        .        `._ ___,j.  `/ .-       ,---.     |");
       System.out.println("                ,`-.      \\         .\"     `.  |/        j     `    |");
       System.out.println("               /    `.     \\       /         \\ /         |     /    j");
       System.out.println("              |       `-.   7-.._ .          |\"          '         /");
       System.out.println("              |          `./_    `|          |            .     _,'");
       System.out.println("              `.           / `----|          |-............`---'");
       System.out.println("                \\          \\      |          |");
       System.out.println("               ,'           )     `.         |");
       System.out.println("                7____,,..--'      /          |");
       System.out.println("                                  `---.__,--.'");
        typing2 = "water";
       }
       
       if(bhp2 == 39 && batk2 ==52){
           System.out.println("              _.--\"\"`-..");
           System.out.println("            ,'          `.");
           System.out.println("          ,'          __  `.");
           System.out.println("         /|          \" __   \\");
           System.out.println("        , |           / |.   .");
           System.out.println("        |,'          !_.'|   |");
           System.out.println("      ,'             '   |   |");
           System.out.println("     /              |`--'|   |");
           System.out.println("    |                `---'   |");
           System.out.println("     .   ,                   |                       ,\".");
           System.out.println("      ._     '           _'  |                    , ' \\ `");
           System.out.println("  `.. `.`-...___,...---\"\"    |       __,.        ,`\"   L,|");
           System.out.println("  |, `- .`._        _,-,.'   .  __.-'-. /        .   ,    \\");
           System.out.println("-:..     `. `-..--_.,.<       `\"      / `.        `-/ |   .");
           System.out.println("  `,         \"\"\"\"'     `.              ,'         |   |  ',,");
           System.out.println("    `.      '            '            /          '    |'. |/");
           System.out.println("      `.   |              \\       _,-'           |       ''");
           System.out.println("        `._'               \\   \"\\                .      |");
           System.out.println("           |                '     \\                `._  ,'");
           System.out.println("           |                 '     \\                 .'|");
           System.out.println("           |                 .      \\                | |");
           System.out.println("           |                 |       L              ,' |");
           System.out.println("           `                 |       |             /   '");
           System.out.println("            \\                |       |           ,'   /");
           System.out.println("          ,' \\               |  _.._ ,-..___,..-'    ,'");
           System.out.println("         /     .             .      `!             ,j'");
           System.out.println("        /       `.          /        .           .'/");
           System.out.println("       .          `.       /         |        _.'.'");
           System.out.println("        `.          7`'---'          |------\"'_.'");
           System.out.println("       _,.`,_     _'                ,''-----\"'");
           System.out.println("   _,-_    '       `.     .'      ,\\");
           System.out.println("   -\" /`.         _,'     | _  _  _.|");
           System.out.println("    \"\"--'---\"\"\"\"\"'        `' '! |! /");
           System.out.println("                            `\" \" -'");
           typing2 = "fire";
       }
       
       System.out.println("*****************************");
       System.out.println("This is your second pokemon, "+name2+":");
       int atk2 = (int)(AtkCalculator(lvlNumeroDos, batk2));
       int hp2 = (int)(HPCalculator(lvlNumeroDos,bhp2));
       int df2 = (int)(dfCalculator(lvlNumeroDos, bdf2));
       System.out.println("Typing: "+typing2);
       System.out.println("Attack: "+atk2+"             ");
       System.out.println("HP: "+hp2+"                ");
       System.out.println("******************************");
       while(hp1>0 && hp2>0){
            //random damage generator
            double random = Math.random();
            while(random<0.85){
            random = Math.random();
            }
            
            random=(int)(random*100);
            random=(double)(random/100);
            hp1=hp1-(int)(random*((2*lvlNumeroDos+10)/250 + (atk2/df2) + 2));
            System.out.println(name1+" is down to "+hp1+" hp");
            
            
            random = Math.random();
            while(random<0.85){
            random = Math.random();
            }
            random=(int)(random*100);
            random=(double)(random/100);
            hp2 = hp2-(int)(random*((2*lvlNumeroUno+10)/250 + (atk1/df1) + 2));
            System.out.println(name2+" is down to "+hp2+" hp");
            
            
            
            
       }
       if(hp1>0){
           System.out.println(name1+" wins!");
       }
       if(hp2>0){
           System.out.println(name2+ "wins!");
       }
       
    }
}
