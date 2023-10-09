//  IDS03-J: Noncompliant Code
//   - Do not log ignore values returned by methods

public void deleteFile(){
 
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();
 
}