JFLAGS = -g 


.SUFFIXES: .java .class

.java.class:
	javac $(JFLAGS) $*.java

CLASSES = \
        Main.java \
		Morse.java \
		Search.java \
		Sum.java 

default: classes

MAIN = Main

compile: $(CLASSES:.java=.class)

clean:
	$(RM) *.class