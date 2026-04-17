

build:
	javac -Xlint:unchecked src/structs/**/*.java -d bin

bb:
	javac src/structs/**/*.java -d bin

bt: buildTest
buildTest:
	javac -sourcepath src/:src/test/  src/test/*.java -d Tbin


docs: clearD
	javadoc -sourcepath src/:src/test/ src/structs/**/*.java src/test/**/*.java -d docs

clearD:
	rm -r docs

clear:
	rm -r bin 2> /dev/null || echo "No bin Found"
	rm -r Tbin 2> /dev/null || echo "No Tbin found"


