package com.neulab.trainer.grpah.node

import scala.collection.immutable.Vector;

class MatrixNode[Matrix[Double]] (var variableName: String) extends VariableNode[Vector[Vector[Double]]] {

  var value: Vector[Vector[Double]] = Vector[Vector[Double]]()

  override def name: String = this.variableName

  override def eval(): Vector[Vector[Double]] = this.value

  override def feed(value: Vector[Vector[Double]]): Unit = {
    this.value = value
  }

}
