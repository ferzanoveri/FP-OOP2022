# Final Project PBO B

Nama  : Ferza Noveri

NRP   : 5025211097

Kelas : Pemrograman Berorientasi Objek B

Referensi : https://youtu.be/bI6e6qjJ8JQ

Implementasi
-----

### 1. Casting/Conversion

>GamePanel.java
```java
appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
```

### 2. Constructor

>GamePanel.java
```java
GamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }
```

### 3. Overloading

### 4. Overriding

### 5. Encapsulation

>GamePanel.java
```java
    private int applesEaten;
    public int getApplesEaten() {
        return applesEaten;
    }

    /**
     * @param applesEaten the applesEaten to set
     */
    public void setApplesEaten(int applesEaten) {
        this.applesEaten = applesEaten;
    }
```

### 6. Inheritance

>GameFrame.java
```java
public class GameFrame extends JFrame{
    GameFrame(){
        
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        
    }
    
}
```

### 7. Polymorphism

### 8. ArrayList

### 9. Exception Handling

>GameFrame.java
```java
try{
            // Input & Output
        File file = new File("highscore.txt");
        
        file.createNewFile();
        
        PrintWriter pw = new PrintWriter(file);   
	                        
        pw.println(applesEaten);

        pw.close();
        } catch(IOException e){
                e.printStackTrace();
            }
```

### 10. GUI
<img width="597" alt="Screenshot 2022-12-13 at 15 33 59" src="https://user-images.githubusercontent.com/110340182/207265871-a3dea90e-f4da-4a72-a5ec-d7539c97dd92.png">

### 11. Interface

>GameInterface.java
```java
public abstract interface GameInterface { //Abstract & Interface
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (int) ((double)(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE);//Casting / Convertion
    static final int DELAY = 75;
}
```

### 12. Abstract Class

>GameInterface.java
```java
public abstract interface GameInterface { //Abstract & Interface
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (int) ((double)(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE);//Casting / Convertion
    static final int DELAY = 75;
}
```

### 13. Generics
### 14. Collection
### 15. Input Output 

>GameFrame.java
```java
try{
            // Input & Output
        File file = new File("highscore.txt");
        
        file.createNewFile();
        
        PrintWriter pw = new PrintWriter(file);   
	                        
        pw.println(applesEaten);

        pw.close();
        } catch(IOException e){
                e.printStackTrace();
            }
```
