public class Vote {
    private final Person voter;
    private final String date;
    Vote(Person voter,String date){
        this.voter = voter;
        this.date = date;
    }
    Person getVoter(){
        return voter;
    }
    String getDate(){
        return date;
    }
    @Override
    public boolean equals(Object o){
        if(this == o)
        return true;
        if(!(o instanceof VotingSystem)) return false;
        VotingSystem that = (VotingSystem ) o;
        return Object.equals(getVotingList(), that.getVotingList())
    }
    @Override
    public int hashCode(){
        return Objects.hash(getVotingList);
    }
}
