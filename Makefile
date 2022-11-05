.SILENT: all game

all: game

game:
	javac --source-path src/ -d out/production/untitled/ src/*.java
	java -cp /home/levi/projects/ascii_game_java/out/production/untitled/ Game
    
clean:
	rm -Rf out/production/untitled/*