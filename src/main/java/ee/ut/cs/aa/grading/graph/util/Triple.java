package ee.ut.cs.aa.grading.graph.util;

public class Triple {
    final public String oneEndpoint;
    final public String otherEndpoint;
    final public int value;

    public Triple(String oneEndpoint,String otherEndpoint,int value){
        this.oneEndpoint=oneEndpoint;
        this.otherEndpoint=otherEndpoint;
        this.value=value;
    }

}