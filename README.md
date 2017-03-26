<H1>Bootstrap-Scala.js-Play-Modal-Example</H1>

A basic example of using Bootstrap with Scala.js in Play using Karasiq's library to show a modal dialog.

Karasiq Scala.js – Bootstrap code works and the demo he provides is beautiful, however it is rather complicated and hard to understand. To grasp how it works one must have some understanding of the following technologies:

  Basic web technologies (HTML, JavaScript, CSS)
  
  Bootstrap
  
  Scala
  
  Scala Play
  
  Scala.js
  
  Scala Tags

Even having all that Karsiq's example has other technologies in use. Hence I decided to make the most basic Scala.js Bootstrap example.

The code is commented showing what is Scala.js, and Scala Tags to produce the bootstrap compatible HTML.

The important files in the project are:

<h5>ScalaJSExample.js</h5>

This file contains the Scala.js and Scala Tags code that will get converted into JavaScript on the completed page.

<h5>index.scala.html</h5>

This file has the layout of the viewed page. Note that the button is a standard Bootstrap button.

<h5>main.scala.html</h5>

This has the surrounding code that helps turn index.scala.html into a proper web page. It has the calls to Bootstrap and jQuery etc within it.

The rest of the files in the project follow Scala-Play conventions.

To run the project you must have installed minimally:

Scala 2.10.6

Play 2.5.2

SBT 13.13

The best way of doing this is getting at least a Java 8 compiler (JDK) , then SBT and creating a test Scala play project with it, which should download everything you need.

<h2>Running It</h2>

Go to the folder where you have unpacked the code and start 'sbt' by typing sbt at the command prompt. At the sbt prompt type in 'compile'. After everything has compiled type in 'run' and wait for the server to start. Then in your browser goto 127.0.0.1:9000 and you should see a simple page with a button. Clicking the button will bring up a Bootstrap modal dialog box.

Please remember that file permissions might have to be changed before the project will compile and run.
