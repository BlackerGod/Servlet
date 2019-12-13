<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>图书馆</title>
<style type="text/css"> 
        .sousuokuang{
	     position:absolute;
	     
	     margin-top: 70px;
	     margin-left:450px;}
		 
		 .topBar{
			position:absolute;
			margin-top: 25px;
			margin-left:1250px; }
		.button{
			position:absolute;
			margin-top: 70px;
			margin-left:870px;
			}
		.logo{
				position:absolute;
				
				margin-left:50px;}
		.fengexian{
					position:absolute;
					margin-top: 130px;
				}
				.fengexian2{
					position: absolute;
          margin-top: 170px;					
					
				}
				
		.fenlei{
			position:absolute;
			margin-top: 150px;
			margin-left:550px; 
		}

		.zong1{
			position:absolute;
			top: 30%;
			left: 15%;

		}
		.chatu1{
			position: absolute;
			float: left;
			
		}
		.wen1{
			position: relative;
      width: 200px;			
			left: 115%;
      margin-top: 70px;

		}
		a{
			text-decoration: none;
			
		}
		.zong2{
			position: absolute;
			top:30%;
			left: 50%;
		}
		.chatu2{
			position: absolute;
       left: 80%;

			}
			.wen2{
				position: relative;
				width: 200px;		
				left: 200%;
				margin-top: 70px;
				}
			.zong3{
				position:absolute;
				top: 90%;
				left: 15%;
				
			}
			.zong4{
				position:absolute;
				top: 90%;
				left: 50%;
				
				
			}
		

   
			
        </style>
</head>
<body bgcolor="lightblue">
<form method="post" action="tatal">

	<div class="logo">
				   <img src="img/u=375696152,3608813014&fm=214&gp=0.gif" alt="test" title="这是logo" width="100"heigh="200"/>
				
	</div>

    <div class="sousuokuang">
                    <input type="text"    style="width: 400px;height: 35px;"   id="keyword" name="keyword" value="请输入搜索内容">
    </div>
		 
		<div class="button">
			<input type="submit"  style="width: 80px;height: 40px;"  value="搜索">
	    </div>
		
		<div class="fengexian">
			<HR align=center width=99999 color=lightslategray SIZE=2>	
		</div>
		<div class="fenlei">
			<a href="Car.jsp" target="_self">去往购物车</a>
			
		</div>
	<div class="fengexian2">
			<HR align=center width=99999 color=lightslategray SIZE=2>	
    </div>
	<div class="zong1">
		<div class="chatu1">
			<input type="image" src="img/a.jpg" width="200"height="300"/>
		</div> 
		<div class="wen1">
			<p><a href="js/shijianjianshi.html"target="_blank">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;《时间简史》全书共十二章，讲述了关于宇宙本性的最前沿知识，包括：我们的宇宙图像、空间和时间、膨胀的宇宙、不确定性原理、黑洞、宇宙的起源和命运等内容，深入浅出地介绍了遥远星系、黑洞、粒子、反物质等知识，并对宇宙的起源、空间和时间以及相对论等古老命题进行了阐述。</a></p>
		
         <p>
            	请你输入购买数量(80):<input name = "amount1" type = "text" value="0"> 
             
         </p>
        
		</div>
	</div>
	<div class="zong2">
		<div class="chatu2">
			<input type="image" src="img/s3035238.jpg" width="200"height="300"/>
			
		</div>
		<div class="wen2">
			<p><a href="js/qigehuangyan.html"target="_blank">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;《七个谎言》史蒂芬·弗格成长于东德，自小渴望爱情、荣耀与自由，“美国”便是他最大的向往。有一天，他的梦想终于成真：他不仅娶到了心仪的美丽女子，甚至还离开了东德，移居美国。就在新生活刚刚展开之际，就要面临他极力隐藏的秘密遭到揭发的恐惧</a></p>
			
         <p>
            
                           请你输入购买数量(100):<input name = "amount2" type = "text" value="0"> 
         </p>
         
		</div>
		
	</div>
	
	
	<div class="zong3">
		<div class="chatu1">
			<input type="image" src="img/timg.jpg" width="200"height="300"/>
		</div> 
		<div class="wen1">
			<p><a href="js/shiji.html"target="_blank"target="_blank">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;《史记》是西汉史学家司马迁撰写的纪传体史书，是中国历史上第一部纪传体通史，记载了上至上古传说中的黄帝时代，下至汉武帝太初四年间共3000多年的历史。太初元年（前104年），司马迁开始了《太史公书》即后来被称为《史记》的史书创作。前后经历了14年，才得以完成</a></p>
		
         <p>
             
    			请你输入购买数量(120):<input name = "amount3" type = "text" value="0"> 
             
             
         </p>
         
		</div>
	</div>
	<div class="zong4">
		<div class="chatu2">
			<input type="image" src="img/8b13632762d0f70375cae9ff08fa513d2697c59d.jpg" width="200"height="300"/>
			
		</div>
		<div class="wen2">
			<p><a href="js/taigeershiji.html"target="_blank">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;《泰戈尔诗集》印度近代著名作家、诗人、哲学家——拉宾德拉纳特·泰戈尔（1861一1941）少年时代即开始文学创作，在半个多世纪的创作生涯中，他涉足诗歌、小说、戏剧等领域，且均获得杰出成就。其中，最能体现他的风格特征的，是他的诗。在印度以及许多国家，泰戈尔都被尊为“诗圣”。</a></p>
         <p>
             
			请你输入购买数量(140):<input name = "amount4" type = "text" value="0"> 
         </p>
		</div>
		<input type="submit" value="加入购物车">
	</div>
	
</form>

		        
		 
							 
							 
	</body>
</html>