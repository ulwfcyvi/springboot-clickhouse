
CREATE TABLE cs_user_info (
  `id` UInt64,
  `user_name` String,
  `pass_word` String,
  `phone` String,
  `email` String,
  `create_day` Date DEFAULT CAST(now(),'Date')
) ENGINE = MergeTree(create_day, intHash32(id), 8192);



drop table bs_order;
CREATE TABLE bs_order (
  `id` UInt64,
  `sku_id` String,
  `total_amount` DECIMAL(36,9),
  `create_time` Date DEFAULT CAST(now(),'Date')
) ENGINE = MergeTree(create_time, intHash32(id), 8192);


