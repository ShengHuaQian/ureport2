# ureport2
ureport2报表使用demo

TestBean类（针对bean数据源配置使用）
a.一个合法的Bean数据集方法要有三个参数，分别是String,String,Map，依次对应数据源名称、数据集名称以及外部传入的参数Map(只能保持这种结构)
b.对于数据集方法的返回值，目前来说可以支持两种类型，一种是我们TestBean中返回的Map<String,Object>类型的List集合；另一种就是返回一个POJO类型的List集合