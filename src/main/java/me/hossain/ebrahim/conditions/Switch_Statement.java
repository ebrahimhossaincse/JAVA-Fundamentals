package me.hossain.ebrahim.conditions;

public class Switch_Statement {
    public static void main(String[] args) {
        char branch = 'E'; // C - CSE, E - ECE, M - Mech
        int year = 2;

        switch( year )
        {
            case 1:
                System.out.println("English, Maths, Drawing");
                break;
            case 2:
                switch( branch )
                {
                    case 'C':
                        System.out.println("Data structures, Java, Computer Organization");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch( branch ) // LINE D
                {
                    case 'C':
                        System.out.println("Operating System, RDBMS");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
        }

    }
}
