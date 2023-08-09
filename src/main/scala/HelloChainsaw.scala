object HelloChainsaw extends App {

  // you can import Chainsaw.package as follow
  import Chainsaw._
  println(s"test import Chainsaw._ => hasVivado = $hasVivado")
  //you can also import Chainsaw.package.* as follow
  import Chainsaw.simWorkspace
  println(
    s"test import Chainsaw.val => simWorkspace = ${simWorkspace.getAbsolutePath}"
  )
  //besides, you can import any package in Chainsaw by import Chainsaw.<packageName>, for example:
  import Chainsaw.arithmetic
  println(
    s"test import Chainsaw.arithmetic => cpaWidthMax = ${arithmetic.cpaWidthMax}"
  )
}
