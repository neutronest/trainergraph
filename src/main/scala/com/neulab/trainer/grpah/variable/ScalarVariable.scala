package com.neulab.trainer.grpah.variable

import com.neulab.trainer.grpah.graph.{BinarySubGraph, Graph, LeafSubGraph}
import com.neulab.trainer.grpah.node.function.AddNode

class ScalarVariable[T: Numeric](
                    var _name: String,
                    var _graph: Graph[T]
                    ) extends Variable[T] {

  def name() : String = this._name

  var data : Option[T] = None

  def + (that: ScalarVariable[T]) : ScalarVariable[T]  = {
    new ScalarVariable[T](
      _name = "hidden",
      _graph = new BinarySubGraph[T](
        new AddNode[T]("add"),
        new LeafSubGraph[T](this),
        new LeafSubGraph[T](that)
      )
    )
  }

  override def eval(): T = {
    this.data match {
      case None => {
        if (this._graph == null) {
          throw new Exception("Empty!")
        } else {
          this._graph.compute()
        }
      }
      case Some(values) => values
    }
  }
}

object ScalarVariable {

  def apply(name: String) : ScalarVariable[Double] = {

    new ScalarVariable[Double](_name = name, _graph = null)
  }

  def apply(name: String, values: Double): ScalarVariable[Double] = {
    val scalarVariable = ScalarVariable(name)
    scalarVariable.data = Some(values)
    scalarVariable
  }

}
