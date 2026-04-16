

build:
	javac src/structs/**/*.java -d bin

bt: buildTest
buildTest:
	javac -sourcepath src/:src/test/  src/test/*.java -d Tbin

clear:
	rm -r bin/* || echo "No bin Found"
	rm -r Tbin/* || echo "No Tbin found"


