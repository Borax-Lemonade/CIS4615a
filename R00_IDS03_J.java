//  IDS03-J: Noncompliant Code 
//   - Do not log unsanitized user input

if (loginSuccessful) {
  logger.severe("User login succeeded for: " + username);
} else {
  logger.severe("User login failed for: " + username);
}
