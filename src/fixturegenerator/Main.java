package fixturegenerator;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        Genretor gen=new Genretor();
        gen.addTeam(new Fixture("fenerbahce"));
        gen.addTeam(new Fixture("galatasaray"));
        gen.addTeam(new Fixture("besiktas"));
        gen.addTeam(new Fixture("trabzonspor"));
        gen.addTeam(new Fixture("basaksehir"));
        gen.addTeam(new Fixture("bursaspor"));

        for(String i:gen.generateFixture()){
            System.out.println(i);
        }

    }
}
