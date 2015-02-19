package com.adform.laboratory.globus.services

import com.adform.laboratory.globus.domain.Employee

/** @author zenind */
class EmployeeServiceImpl(storage: EntityRepository[String, Employee]) {
  require(storage != null)

  def saveEmployee(e: Employee): Employee = storage.save(e)

}
