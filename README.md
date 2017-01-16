# hybrisexercise
an example API for the hybris

There are two endpoints of the service: place-order and retrieve-history

1. Unimplemented requirement - Order - customer restriction
In requirements it is specified that each customer should have access only to his own orders.
As there is not authentication functionality in this service, this could be achieved perhaps
by adding IP address into orders and retrieving only orders mathing the IP address from where the request originated.

2. Unimplemented requirement - sorting orders by date
I would proceed with further abstraction of my data model from the request/response objects,
and add a new class representing order inside a response, and in this class add compareTo() method implementation
so that if the user specifies, for instance DESCENDING as date ordering in the request, I could sort the list of orders
in the response accordingly.

 3. Payment API Integration

 I would need to further evaluate the API and investigate Spring support for making REST service requests,
 but I had no time to continue.