public boolean catDog(String str) {
  return str.replace("dog", "").length() == str.replace("cat", "").length();
}
