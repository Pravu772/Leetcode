SELECT p.product_name,s.year,s.price
FROM Sales s Join Product p ON p.product_id=s.product_id;
