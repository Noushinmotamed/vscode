 class Voting {
    private int type;
    private String question;
    private HashMap<String, HashSet<Vote>> choices;
    Voting(int type,String question){
        this.type = type;
        this.question = question;
        
    }
}
