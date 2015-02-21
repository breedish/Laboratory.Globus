package com.adform.laboratory.globus.services

import com.adform.laboratory.globus.domain.{Pod, Role, Employee}

/** @author zenind */
class EmployeeServiceImpl(storage: EntityRepository[String, Employee]) {

  def saveEmployee(e: Employee): Employee = storage.save(e)

  def assignEmployeeRole(e: Employee, role: Role):Employee = e.copy(roles = e.roles + role)
  def removeEmployeeRole(e: Employee, role:Role):Employee = e.copy(roles = e.roles - role)

  def assignEmployee(p: Pod, e: Employee) = p.copy(employees = p.employees + e)
  def unAssignEmployee(p: Pod, e: Employee) = p.copy(employees = p.employees - e)

}
