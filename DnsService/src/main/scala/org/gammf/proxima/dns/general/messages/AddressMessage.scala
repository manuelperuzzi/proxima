package org.gammf.proxima.dns.general.messages

import org.gammf.proxima.dns.utils.Service.StringService

/**
  * Represents a message to the DNS service, requesting the creation of a service address.
  * This message contains all the information needed to contact an external component offering a certain service.
 *
  * @param service the service offered by an external component.
  * @param ipAddress the ip address of the external component that offers the service.
  * @param port the port number to use to contact the external component that offers the service.
  */
case class AddressCreationRequestMessage(service: StringService, ipAddress: String, port: Int) extends CommunicationMessage

/**
  * It's a response to a [[AddressCreationRequestMessage]].
  * @param result true in case of success in the address creation operation, false otherwise.
  */
case class AddressCreationResponseMessage(result: Boolean) extends CommunicationMessage