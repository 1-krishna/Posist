class Node{
  static int universalNodeCount = 0;
  long timestamp;
  Data data;
  int nodeNumber;
  String nodeId;
  String referenceNodeId;
  String childReferenceNodeId;
  String genesisReferenceNodeId;
  String hashValue;

  

  public Node(Data data, String referenceNodeId, String childReferenceNodeId, String genesisReferenceNodeId){

    this.timestamp = setTimestamp();
    this.data = data;
    this.nodeNumber = setNodeNumber();
    this.nodeId = generateNodeId();
    this.referenceNodeId = referenceNodeId;
    this.childReferenceNodeId = childReferenceNodeId;
    this.genesisReferenceNodeId = genesisReferenceNodeId;
    this.hashValue = generateHashValue(this.timestamp, this.data, this.nodeNumber, this.childReferenceNodeId, this.genesisReferenceNodeId);

  }



  public static long setTimestamp(){
    return System.currentTimeMillis();
  }

  public static int setNodeNumber(){
    universalNodeCount++;
    return universalNodeCount;
  }

}