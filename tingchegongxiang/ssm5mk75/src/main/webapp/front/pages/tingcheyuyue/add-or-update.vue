<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 020rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(255, 153, 0, 1)","textAlign":"left"}' class="title">停车场名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(255, 153, 0, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.tingchechangmingcheng" v-model="ruleForm.tingchechangmingcheng" placeholder="停车场名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 020rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(255, 153, 0, 1)","textAlign":"left"}' class="title">停车场地址</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(255, 153, 0, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.tingchechangdizhi" v-model="ruleForm.tingchechangdizhi" placeholder="停车场地址"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(255, 153, 0, 1)","textAlign":"left"}' class="title">车位数量</view>
				<picker @change="cheweishuliangChange" :value="cheweishuliangIndex" :range="cheweishuliangOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(255, 153, 0, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' class="uni-input">{{ruleForm.cheweishuliang?ruleForm.cheweishuliang:"请选择车位数量"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 020rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(255, 153, 0, 1)","textAlign":"left"}' class="title">停车费</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(255, 153, 0, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.tingchefei" v-model="ruleForm.tingchefei" placeholder="停车费"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group" @tap="fengmianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(255, 153, 0, 1)","textAlign":"left"}' class="title">封面</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-if="ruleForm.fengmian" :src="ruleForm.fengmian" mode="aspectFill"></image>
					<image :style='{"width":"88rpx","boxShadow":"0 0 16rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"88rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 020rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(255, 153, 0, 1)","textAlign":"left"}' class="title">账号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(255, 153, 0, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.zhanghao" v-model="ruleForm.zhanghao" placeholder="账号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 020rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(255, 153, 0, 1)","textAlign":"left"}' class="title">姓名</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(255, 153, 0, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xingming" v-model="ruleForm.xingming" placeholder="姓名"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 020rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(255, 153, 0, 1)","textAlign":"left"}' class="title">手机</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(255, 153, 0, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.shouji" v-model="ruleForm.shouji" placeholder="手机"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 020rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(255, 153, 0, 1)","textAlign":"left"}' class="title">车牌号</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(255, 153, 0, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.chepaihao" v-model="ruleForm.chepaihao" placeholder="车牌号"></input>
			</view>
												<view :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"#ccc","margin":"0 0 020rpx 0","borderWidth":"0","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"170rpx","fontSize":"28rpx","color":"rgba(255, 153, 0, 1)","textAlign":"left"}' class="title">停车时间</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(255, 153, 0, 1)","borderRadius":"16rpx","color":"rgba(0, 0, 0, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.tingcheshijian" placeholder="停车时间" @tap="toggleTab('tingcheshijian')"></input>
			</view>
																		
			<!-- 否 -->
 
			
			          				          				          				          				          				          				          				          				          				          				          							
			          				          				          				          				          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"rgba(255, 153, 0, 1)","borderColor":"rgba(255, 255, 0, 1)","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"1","width":"80%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																																										<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="tingcheshijianConfirm" ref="tingcheshijian" themeColor="#333333"></w-picker>
											
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												tingchechangmingcheng: '',
																tingchechangdizhi: '',
																cheweishuliang: '',
																tingchefei: '',
																fengmian: '',
																zhanghao: '',
																xingming: '',
																shouji: '',
																chepaihao: '',
																tingcheshijian: '',
																userid: '',
												},
																												cheweishuliangOptions: [],
				cheweishuliangIndex: 0,
																																																																												// 登陆用户信息
				user: {},
                                ro:{
                                   tingchechangmingcheng : false,
                                   tingchechangdizhi : false,
                                   cheweishuliang : false,
                                   tingchefei : false,
                                   fengmian : false,
                                   zhanghao : false,
                                   xingming : false,
                                   shouji : false,
                                   chepaihao : false,
                                   tingcheshijian : false,
                                   userid : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																							this.ruleForm.zhanghao = this.user.zhanghao
												this.ruleForm.xingming = this.user.xingming
												this.ruleForm.shouji = this.user.shouji
												this.ruleForm.chepaihao = this.user.chepaihao
																					
																								// 自定义下拉框值
			this.cheweishuliangOptions = "1".split(',')
																																																									
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`tingcheyuyue`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='tingchechangmingcheng'){
					this.ruleForm.tingchechangmingcheng = obj[o];
					this.ro.tingchechangmingcheng = true;
					continue;
					}
					if(o=='tingchechangdizhi'){
					this.ruleForm.tingchechangdizhi = obj[o];
					this.ro.tingchechangdizhi = true;
					continue;
					}
					if(o=='cheweishuliang'){
					this.ruleForm.cheweishuliang = obj[o];
					this.ro.cheweishuliang = true;
					continue;
					}
					if(o=='tingchefei'){
					this.ruleForm.tingchefei = obj[o];
					this.ro.tingchefei = true;
					continue;
					}
					if(o=='fengmian'){
					this.ruleForm.fengmian = obj[o];
					this.ro.fengmian = true;
					continue;
					}
					if(o=='zhanghao'){
					this.ruleForm.zhanghao = obj[o];
					this.ro.zhanghao = true;
					continue;
					}
					if(o=='xingming'){
					this.ruleForm.xingming = obj[o];
					this.ro.xingming = true;
					continue;
					}
					if(o=='shouji'){
					this.ruleForm.shouji = obj[o];
					this.ro.shouji = true;
					continue;
					}
					if(o=='chepaihao'){
					this.ruleForm.chepaihao = obj[o];
					this.ro.chepaihao = true;
					continue;
					}
					if(o=='tingcheshijian'){
					this.ruleForm.tingcheshijian = obj[o];
					this.ro.tingcheshijian = true;
					continue;
					}
					if(o=='userid'){
					this.ruleForm.userid = obj[o];
					this.ro.userid = true;
					continue;
					}
				}
				this.ruleForm.cheweishuliang = 0;
				this.ro.cheweishuliang = false;
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																																								
			// 多级联动参数
																																																																								
																																																																					
																																																															// 日长控件选择日期时间
			tingcheshijianConfirm(val) {
				console.log(val)
				this.ruleForm.tingcheshijian = val.result;
				this.$forceUpdate();
			},
												
																					// 下拉变化
			cheweishuliangChange(e) {
				this.cheweishuliangIndex = e.target.value
				this.ruleForm.cheweishuliang = this.cheweishuliangOptions[this.cheweishuliangIndex]
			},
																																																						
																																													fengmianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.fengmian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																																																															
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																																																												var obj = uni.getStorageSync('crossObj');
				var table = uni.getStorageSync('crossTable');
				obj.cheweishuliang = obj.cheweishuliang - this.ruleForm.cheweishuliang
				if(obj.cheweishuliang<0){
					this.$utils.msg("车位数量数量不足");
					return
				}
				await this.$api.update(`${table}`, obj);
																																																																																																																																																																if(this.ruleForm.cheweishuliang&&(!this.$validate.isIntNumer(this.ruleForm.cheweishuliang))){
					this.$utils.msg(`车位数量应输入整数`);
					return
				}
																																												if(this.ruleForm.tingchefei&&(!this.$validate.isIntNumer(this.ruleForm.tingchefei))){
					this.$utils.msg(`停车费应输入整数`);
					return
				}
																																																																																																																																																																																																																																																																																																if(this.ruleForm.id){
					await this.$api.update(`tingcheyuyue`, this.ruleForm);
				}else{
					await this.$api.add(`tingcheyuyue`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 88rpx;
	}
	
	.select .uni-input {
		line-height: 88rpx;
	}
	
	.input .right-input {
		line-height: 88rpx;
	}
</style>
