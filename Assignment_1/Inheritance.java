// Interface for displaying 
interface DisplayInterface {
    void display();
}

// Interface for playing 
interface PlayInterface {
    void play();
}

// Class that implements DisplayInterface
class Image implements DisplayInterface {
    @Override
    public void display() {
        System.out.println("Displaying the image");
    }
}

// Class that implements DisplayInterface and PlayInterface
class Video implements DisplayInterface, PlayInterface {
    @Override
    public void display() {
        System.out.println("Displaying the video");
    }

    @Override
    public void play() {
        System.out.println("Playing the video");
    }
}

class Inheritance {
    public static void main(String[] args) {
        Image img = new Image();
        Video vid = new Video();

        img.display();
        vid.display();
        vid.play();
    }
}