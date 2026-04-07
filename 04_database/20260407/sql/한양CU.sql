
-- 상품목록
-- 상품코드, 상품명, 판매단가, (상품원가), 입고일자 조회
select
    distinct g.goods_cd 상품코드,
    g.goods_nm 상품명,
    g.goods_price 판매단가,
    g.cost "(상품)원가",
--    '20' || 
--    substr(s.sale_ymd,1,2) || '-' ||
--    substr(s.sale_ymd,4,2) || '-' ||
--    substr(s.sale_ymd,7,2) 입고일자
    to_char(s.sale_ymd, 'yyyy-mm-dd') 입고일자
from goods_tbl_500 g
join sale_tbl_500 s
on g.goods_cd = s.goods_cd
join store_tbl_500 store
on store.store_cd = s.store_cd
order by 상품코드;

-- 점포별 매출현황
-- 점포명, 현금매출, 카드매출, 총매출
select 
    s.store_nm 점포명,
    sum(decode(o.pay_type,'01',(o.sale_cnt *g.goods_price),0)) 현금,
    sum(decode(o.pay_type,'02',(o.sale_cnt *g.goods_price),0)) 카드,
    sum(o.sale_cnt*g.goods_price) total
from sale_tbl_500 o
join goods_tbl_500 g
on o.goods_cd = g.goods_cd
join store_tbl_500 s
on s.store_cd = o.store_cd
group by s.store_nm;

-- 판매현황
-- 판매구분, 판매번호, 판매일자, 상품명, 판맴수량, 판매금액, 수취구분(카드) 조회
select
    case 
        when s.sale_fg = '1' then '판매'
        when s.sale_fg = '2' then '취소'
        else '기타'
    end 판매구분,
    s.sale_no 판매번호,
    to_char(s.sale_ymd, 'yyyy-mm-dd') 판매일자,
    g.goods_nm 상품명,
    s.sale_cnt 판매수량,
    (g.goods_price * s.sale_cnt) 판매금액,
    case 
        when s.pay_type = '01' then '현금'
        when s.pay_type = '02' then '카드'
        else '기타'
    end 수취구분
from sale_tbl_500 s
join goods_tbl_500 g
on s.goods_cd = g.goods_cd
order by s.sale_no;