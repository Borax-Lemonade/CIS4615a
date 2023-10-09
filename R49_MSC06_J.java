
List<Widget> widgetList =
    Collections.synchronizedList(new ArrayList<Widget>());
 
public void widgetOperation() {
  synchronized (widgetList) { // Client-side locking
    for (Widget w : widgetList) {
      doSomething(w);
    }
  }
}