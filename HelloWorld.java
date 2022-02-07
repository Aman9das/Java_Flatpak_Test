// This is a simple Java program.
// FileName : "HelloWorld.java".

import java.io.IOException;
  
class HelloWorld
{
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(String args[])
    {
        System.out.println("Hello, World");
        try
        {
            Runtime.getRuntime().exec("xdg-open https://www.duckduckgo.com");
        }
        catch (IOException | SecurityException e)
        {
            System.out.println("Sad");
        }
    }
}
