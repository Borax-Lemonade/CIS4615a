//  STR03-J: Noncompliant Code 
//   - Do not log unsanitized user input

BigInteger x = new BigInteger("530500452766");
byte[] byteArray = x.toByteArray();
String s = new String(byteArray);
byteArray = s.getBytes();
x = new BigInteger(byteArray);
