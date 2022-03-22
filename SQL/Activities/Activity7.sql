SELECT SUM(PURCHASE_AMOUNT) AS "Total sum" FROM orders;
SELECT AVG(PURCHASE_AMOUNT) AS " Average Amount" FROM orders;

SELECT MAX(PURCHASE_AMOUNT) AS "MAX of Purchase amount" FROM orders;

SELECT MIN(PURCHASE_AMOUNT) AS "Minimum" FROM orders;

SELECT COUNT( distinct SALESMAN_ID) AS "Number of Salesman" FROM orders;