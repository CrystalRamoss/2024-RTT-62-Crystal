-- select 
-- 	l.name, format(max(o.amount),2) as max_offer,
-- 	format(min(o.amount),2) as min_offer, 
-- 	format(round(avg(o.amount),2),2) as avg_offer, 
--     count(*) as offers
-- from lots l, offers o
-- where l.id = o.lot_id
-- group by o.lot_id;


SELECT
    l.name,
    FORMAT(MAX(o.amount),2) AS max_offer,
    FORMAT(MIN(o.amount),2) AS min_offer,
    FORMAT(ROUND(AVG(o.amount),2),2) AS avg_offer,
    COUNT(*) AS offers
FROM
    lots l, offers o
WHERE
    l.id = o.lot_id
GROUP BY
    l.name;

