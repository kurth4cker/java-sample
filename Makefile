include config.mk

JARFILE = kthr.sample.jar

CLASSES = \
	kthr/sample/Main.class

all: $(JARFILE)

$(JARFILE): $(CLASSES)
	$(JAR) -e kthr.sample.Main -c -f $@ $(CLASSES)

clean:
	find . -name '*.jar' -delete
	find . -name '*.class' -delete

.SUFFIXES: .java .class
.java.class:
	$(JAVAC) $<
