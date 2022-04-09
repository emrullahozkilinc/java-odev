package fixturegenerator;

import java.lang.reflect.GenericArrayType;
import java.util.*;

public class Genretor {
    List<Fixture> teams;

    public Genretor(){
        teams = new LinkedList<>();
    }

    void addTeam(Fixture team){
        teams.add(team);
    }

    List<String> generateFixture(){

        List<String> matches=new LinkedList<>();
        List<Fixture> tempList = teams;

        if(teams.size()%2==1)
            teams.add(new Fixture("Bay"));

        for (int i = 0; i < 2*(teams.size()-1); i++) {

            String temp = "";

            if(i<(teams.size()-1))
                temp += teams.get(0).getName() + " vs. " + teams.get(1).getName();
            else
                temp += teams.get(1).getName() + " vs. " + teams.get(0).getName();

            int m = 2;
            int n = tempList.size() - 1;

            while (m != n + 1) {
                if(i<(teams.size()-1))
                    temp += "\n" + teams.get(m).getName() + " vs. " + teams.get(n).getName();
                else
                    temp += "\n" + teams.get(n).getName() + " vs. " + teams.get(m).getName();
                m++;
                n--;
            }
            matches.add(temp + "\n");
            tempList.add(1, tempList.get(tempList.size() - 1));
            tempList.remove(tempList.size() - 1);

        }
        return matches;
    }
}
