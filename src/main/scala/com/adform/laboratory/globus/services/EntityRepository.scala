package com.adform.laboratory.globus.services

import com.adform.laboratory.globus.domain.Role

/** @author zenind */
trait EntityRepository[ID, T] {

  def find(id:ID):T
  def find(criterion: Map[String, String]):Set[T]
  def save(e:T):T

}
