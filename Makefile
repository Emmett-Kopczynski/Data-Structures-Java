

build:
	javac src/structs/**/*.java -d bin

bt: buildTest
buildTest:
	javac -sourcepath src/:src/test/  src/test/*.java -d Tbin

clear:
	rm -r bin 2> /dev/null || echo "No bin Found"
	rm -r Tbin 2> /dev/null || echo "No Tbin found"


