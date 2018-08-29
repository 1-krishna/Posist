class Data{

  String encryptedData = "";

  private String ownerId;
  private float value;
  private String ownerName;
  private String hash;

  public Data(String ownerId, float value, String ownerName){
    this.ownerId = ownerId;
    this.value = value;
    this.ownerName = ownerName;
    this.hash = generateHash(this.ownerId, this.value, this.ownerName);
    this.encryptedData = setEncryptedData(this.ownerId, this.value, this.ownerName, this.hash);
  }

  public String generateHash(String ownerId, float value, String ownerName){
    //Generate hash
    return ownerId.hashCode() + value.hashCode() + ownerName.hashCode();
  }

  public setEncryptedString(String ownerId, float value, String ownerName, String hash){
    //Set Value of encryptedData
  }

  public getEncryptedString(){
    return encryptedData;
  }



}