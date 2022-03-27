package traits


//trait Father {
//  def print()
//}
//
//class Son extends Father {
//  def print() {
//    println("Hello!")
//  }
//
//}
//
//object TraitDemo {
//  def main(args: Array[String]) {
//    var s = new Son()
//    s.print()
//  }
//}  
//===============================
 
// third example:



//trait GrandFather {
//  def printGF()
//}
//
//trait Fathers {
//  def showF()
//}
//
//class TestClass extends GrandFather with Fathers {
//  def printGF() {
//    println("This is from GrandFather")
//  }
//
//  def showF() {
//    println("This is from Father");
//  }
//}
//
//object TraitDemo3 {
//  def main(args: Array[String]) {
//    var tc = new TestClass()
//    tc.printGF()
//    tc.showF()
//  }
//
//}

//===========================
// fourth example:



trait King {
  def print() // Abstract method - no method body
  def show() { // Non-abstract method - with method body
    println("This is a regular method method from King")
  }
}

class Prince extends King {
  def print() {
    println("This is an implementation of an abstract method from King")
  }
}

object TraitDemo4 {
  def main(args: Array[String]) {
    var p = new Prince()
    p.print()
    p.show()
  }
}

//==============================

// fifth example:



//trait PrintTrait { // a trait with an abstract method
//  def print()
//}
//
//abstract class PrintAbs { // an abstract class with an abstract method
//  def printabs()
//}
//
//class TraitAndAbs extends PrintAbs with PrintTrait { // abstract class first, trait at the end
//  def print() { // Trait print
//    println("print from PrintTrait")
//  }
//
//  def printabs() { // Abstract class: PrintAbs, abstract method: printabs
//    println("Print from abstract class PrintAbs")
//  }
//}
//
//object TraitDemo5 {
//  def main(args: Array[String]) {
//    var tna = new TraitAndAbs()
//    tna.print()
//    tna.printabs()
//  }
//}  

//===============================
// sixth example:
//
//package scalademo
//
//trait PrintMyName {
//  def printName()
//}
//
//abstract class PrintDetails {
//  def printAll()
//}
//
//class TraitsDemo extends PrintDetails {
//  def printName() { // Trait print
//    println("My Name is Khan")
//  }
//
//  def printAll() { // Abstract class printA4
//    println("Print all the details")
//  }
//}
//
//object TraitDemo6 {
//  def main(args: Array[String]) { // first extend the abstract class, then with trait
//    var td = new TraitsDemo with PrintMyName // abstract class can be extended during object creation like this
//    td.printName()
//    td.printAll()
//  }
//}  

//==========================
// seventh example:



//trait Trait1 {
//  def printFromTrait()
//}
//
//abstract class Abstract1{
//  def printFromAbstract1()
//}
//
//// this is OK: class TraitExample extends Abstract1 with Trait1{
//  
//class TraitExample extends Trait1 with Abstract1{ // classes first, Traits later
//def printFromTrait() { // Trait print
//    println("I am from Trait1")
//  }
//  
//  def printFromAbstract1() { // Abstract class printA4
//    println("I am from Abstract class")
//  }
//}
//
//object TraitDemo7 {
//
//  def main(args: Array[String]) {
//    var te = new TraitExample()
//    te.printFromTrait()
//    te.printFromAbstract1()
//  }
//}  

//object TraitsDemo {
//  
//}