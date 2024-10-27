class Participant extends Party {
    private  String participantName;
    private String participantParty;
    public  int count = 0;

    public Participant(String participantName, String party) {
        this.participantName = participantName;
        this.participantParty = party;

    }

    public String getName() {
        return this.participantName;
    }

    public String getParty() {
        return this.participantParty;
    }

}
