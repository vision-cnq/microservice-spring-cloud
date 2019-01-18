接入Feign，添加 fallbackFactory 属性来触发请求进行容灾降级


1、在一些场景中，简单的触发在 FeignClient 加入 Fallback 属性即可，而另外有一些场景需要访问导致回退触发的原因，
那么这个时候可以在 FeignClient 中加入 FallbackFactory 属性即可；
2、而在使用 Fallback 和 FallbackFactory 时候，我仅仅表述个人观点，发现二者混合一起用的话，会发生冲突情况，
所以大家用的时候注重考虑一下场景，二者属性用其一即可。


