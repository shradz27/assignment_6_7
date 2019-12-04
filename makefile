JFLAGS = -g
JC = javac
JVM = java

.SUFFIXES: .java .class
.java.class:
	$(JC) $*.java

CLASSES = MyApplication.java

MAIN = MyApplication

default: classes

clean: 
	$(RM) *.class

classes: $(CLASSES:.java=.class)

run : classes
		$(JVM) $(MAIN)