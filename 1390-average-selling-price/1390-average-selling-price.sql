SELECT p.product_id,IFNULL(ROUND(SUM(price*units)/SUM(units),2),0) as average_price
FROM Prices p LEFT JOIN UnitsSold u ON p.product_id=u.product_id
and  u.purchase_date Between p.start_date and p.end_date
Group BY product_id;
