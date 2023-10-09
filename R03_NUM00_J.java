public static int multAccum(int oldAcc, int newVal, int scale) {
  return Math.addExact(oldAcc, Math.multiplyExact(newVal, scale));
}