package com.adform.laboratory.globus.domain

import scala.collection.immutable.Set

/** @author zenind */
case class Pod(id: String = null, name: String, employees: Set[Employee]) {
  require(name != null && employees != null)

  def assignEmployee(e: Employee) = employees + e

  def assignEmployeeRole(id: String, role: Role): Unit = {
    manageEmployeeRole(id, role, (e, role) => e.assignRole(role))
  }

  def unAssignEmployeeRole(id: String, role: Role): Unit = {
    manageEmployeeRole(id, role, (e, role) => e.removeRole(role))
  }

  private def manageEmployeeRole(id: String, role: Role, updateFunc: (Employee, Role) => Unit) {
    employees.find(p => p.id == id) match {
      case Some(value) => updateFunc(value, role)
      case None => throw new IllegalArgumentException()
    }
  }

}
