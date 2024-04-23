JAR = jar
JAVA = java
JAVAC = javac

JARFILE = kthr.sample.jar

CLASSES = \
	kthr/sample/Main.class

all: $(JARFILE)

$(JARFILE): $(CLASSES)
	$(JAR) -e kthr.sample.Main -c -f $@ $(CLASSES)

clean:
	find . -name '*.jar' -delete
	find . -name '*.class' -delete

run: $(JARFILE)
	$(JAVA) -jar $(JARFILE)

.SUFFIXES: .java .class
.java.class:
	$(JAVAC) $<
