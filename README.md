# Payment Service
Java EE application which coverage payment scenarios, such as:

Create payment
URL: http://127.0.0.1:8080/trabalho-web/api/payment/create
Request Body: {"productCode": 12345, "paymentDate": "02/01/2000", "dueDate": "12/01/2000", "value": 100.50, "paymentType": "Debit"}

Get Payment
URL: http://127.0.0.1:8080/trabalho-web/api/payment/get/{PRODUCT_CODE}

Get all payments
URL: http://127.0.0.1:8080/trabalho-web/api/payment/getAll

Update payment
URL: http://127.0.0.1:8080/trabalho-web/api/payment/update/{PRODUCT_CODE}
Request Body: {"paymentDate": "25/01/2000", "dueDate": "05/02/2000", "value": 2000.00, "paymentType": "Cash"}