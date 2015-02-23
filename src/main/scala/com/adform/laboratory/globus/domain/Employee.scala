package com.adform.laboratory.globus.domain

/** @author zenind */
case class Employee(id: String, firstName: String, lastName: String, roles: Set[Role],
  icon: String, twitter:String, email: String, bio: String, pod: Pod)