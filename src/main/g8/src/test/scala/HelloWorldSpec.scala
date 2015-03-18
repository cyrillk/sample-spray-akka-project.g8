package $organization$.$name;format="lower,word"$

import org.specs2.mutable._

class HelloWorldSpec extends Specification {

  "hello world specification" >> {
    "where adding 1 to 1 should be 2" >> {
      1 + 1 must_== 2
    }
  }
}

