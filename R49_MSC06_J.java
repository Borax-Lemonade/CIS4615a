
List<Widget> widgetList = new ArrayList<Widget>();
 
public void widgetOperation() {
  // May throw ConcurrentModificationException
  for (Widget w : widgetList) {
    doSomething(w);
  }
}