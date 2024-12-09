WinWaitActive("Open")
ControlSetText("Open", "", "Edit1", @WorkingDir & "\Logo\jpg.jpg")
ControlClick("Open", "", "Button1")