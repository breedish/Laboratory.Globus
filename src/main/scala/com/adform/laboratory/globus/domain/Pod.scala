package com.adform.laboratory.globus.domain

import scala.collection.immutable.Set

/** @author zenind */
case class Pod(id: String = null, name: String, employees: Set[Employee]) {
}
