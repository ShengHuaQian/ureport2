<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>ureport图表HTML测试</title>
    <script type="text/javascript" src="/ureport/res/ureport-asserts/venderjs/jquery.min.js"></script>
    <script type="text/javascript" src="/ureport/res/ureport-asserts/venderjs/bootstrap.min.js"></script>
    <script type="text/javascript" src="/ureport/res/ureport-asserts/venderjs/Chart.bundle.min.js"></script>
    <script type="text/javascript" src="/ureport/res/ureport-asserts/venderjs/chartjs-plugin-datalabels.min.js"></script>
    <script type="text/javascript" src="/ureport/res/ureport-asserts/venderjs/bootstrap-datetimepicker.js"></script>
    <script type="text/javascript" src="/ureport/res/ureport-asserts/js/preview.bundle.js"></script>


    <style type="text/css">
        ${htmlReport.style}
    </style>
</head>
<body>
<p></p>
${htmlReport.content}

<script type="text/javascript">
    window._server="/ureport";
    $(document).ready(function(){
        _buildChartDatas(${(chartDatas)!});
    });
</script>
</body>
</html>
