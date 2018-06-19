package com.neulab.trainer.grpah.node

trait VariableNode[T] extends BasicGraphNode {

  def name : String;

  def feed  (value: T): Unit;

  def eval() : T;
}
