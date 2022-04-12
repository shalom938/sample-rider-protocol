# SampleRiderPlugin for Rider and ReSharper

to build:
./gradlew buildPlugin

if there are issues loading to intellij idea delete the .idea directory.

the project can be opened in idea to work on the jvm side (java/kotlin).
and can be opened in rider to work on the c# code.

this sample uses rider EAP, 2022.1-SNAPSHOT , with older versions the protocol api is dirrefernt, I think that it still changes a lot in every release.


to test 
execute runIde task


there are 4 actions on the editor context menu.

click SignalWithPropertyChangeAction: nothing should happen, its just sending a signal to resharper, resharper should update a value on the model. (this signal works only the first time, need to check why,but its good for now)
click CheckResultDialogAction: you should see the value in the dialog.

click SignalWithSourceAction: nothing should happen
click CheckResultDialogAction: you should see the value in the dialog.
repeate the two lines above as many times , the text should change every time.

click RpcDialogAction: a dialog should open with text "Result from RPC true", 'true' is the return from the RPC call, boolean is the most simple.


There is much more to the protocol but that's the general idea.
