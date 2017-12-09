package statistics.matcher;

import java.util.ArrayList;

public class QueryBuilder {

    ArrayList<Matcher> listOfMatchers;

    public QueryBuilder() {
        this.listOfMatchers = new ArrayList();
    }

    public Matcher build() {
        Matcher[] matcherArray = this.listOfMatchers.toArray(new Matcher[this.listOfMatchers.size()]);
        this.listOfMatchers = new ArrayList();
        return new And(matcherArray);
    }

    public QueryBuilder playsIn(String team) {
        this.listOfMatchers.add(new PlaysIn(team));
        return this;
    }

    public QueryBuilder hasAtLeast(int value, String category) {
        this.listOfMatchers.add(new HasAtLeast(value, category));
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String category) {
        this.listOfMatchers.add(new HasFewerThan(value, category));
        return this;
    }

    public QueryBuilder oneOf(Matcher... matchers) {
        this.listOfMatchers.add(new Or(matchers));
        return this;
    }

    public QueryBuilder not(Matcher... matchers) {
        this.listOfMatchers.add(new Not(matchers));
        return this;
    }

    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    //Redundantti?//////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    public QueryBuilder and(Matcher... matchers) {
        this.listOfMatchers.add(new And(matchers));
        return this;
    }

}
