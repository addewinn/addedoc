//  point to location of apexdoc.jar file
// -s define source directory
// -t define target directory
// -p define scope
// -h point to location of custom home page
// -a point to location of custom banner
// -g define source code url where code is hosted
java -jar "C:\Program Files\Zulu\zulu-11\lib\addedoc.jar" -s "D:\Addepar\GitHub\Sfdc-Integration-master\force-app\main\default\classes" -t "D:\Addepar\GitHub\Sfdc-Integration-master" -p "global;public;private;testmethod;webService" -g "https://github.com/Addepar/Sfdc-Integration/tree/master/force-app/main/default/classes/"

java -jar "C:\Program Files\Zulu\zulu-11\lib\addedoc.jar" -s "D:\Addepar\GitHub\HelloWorldLightningComponent\force-app\main\default\classes" -t "D:\Addepar\GitHub\HelloWorldLightningComponent" -p "global;public;private;testmethod;webService" -g "https://github.com/addewinn/HelloWorldLightningComponent/tree/master/force-app/main/default/classes/"