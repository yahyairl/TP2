# Le nom de votre classe principale
# Renommez si nécessaire
MAINCLASS=Main
## Le chemin vers où votre classe compilée est installée
# Renommez si nécessaire
INSTALLDIR=../out/production/TP2

MAINDIR=$(dir $(subst .,/,$(MAINCLASS)))

compile: $(subst .,/,$(MAINCLASS)).class

%.class: 
	javac -g  $*.java

clean:
	rm $(MAINDIR)*.class

install:
	cp $(MAINDIR)*.class $(INSTALLDIR)/$(MAINDIR)

cleanInstall:
	rm  $(INSTALLDIR)/$(MAINDIR)*.class
