//  IDS03-J: Noncompliant Code
//   - Do not log unsanitized user input

if (loginSuccessful) {
  logger.severe("User login succeeded for: " + sanitizedInput(username));
} else {
  logger.severe("User login failed for: " + sanitizedInput(username));
}

public String sanitizedInput(String username) {
    return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
}