package org.jeecgframework.tag.core.easyui;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.TagSupport;
import org.jeecgframework.core.util.oConvertUtils;

public class BaseTag extends TagSupport {
	private static final long serialVersionUID = 1L;
	protected String type = "default";

	public void setType(String type) {
		this.type = type;
	}

	public int doStartTag() throws JspException {
		return 6;
	}

	public int doEndTag() throws JspException {
		try {
			JspWriter out = this.pageContext.getOut();
			StringBuffer sb = new StringBuffer();

			String[] types = this.type.split(",");
			if (oConvertUtils.isIn("jquery", types)) {
				sb.append("<script type=\"text/javascript\" src=\"plug-in/jquery/jquery-1.8.0.min.js\"></script>");
			}
			if (oConvertUtils.isIn("easyui", types)) {
				sb.append("<link id=\"easyuiTheme\" rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/easyui/themes/default/easyui.css\">");
				sb.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/easyui/themes/icon.css\">");
//				sb.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"../demo.css\">");
//				sb.append("<script type=\"text/javascript\" src=\"../../jquery-1.8.0.min.js\"></script>");
				sb.append("<script type=\"text/javascript\" src=\"plug-in/easyui/jquery.easyui.min.js\"></script>");

//				sb.append("<script type=\"text/javascript\" src=\"plug-in/tools/dataformat.js\"></script>");
//				sb.append("<link id=\"easyuiTheme\" rel=\"stylesheet\" href=\"plug-in/easyui/themes/default/easyui.css\" type=\"text/css\"></link>");
//				sb.append("<link rel=\"stylesheet\" href=\"plug-in/easyui/themes/icon.css\" type=\"text/css\"></link>");
//				sb.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"plug-in/accordion/css/accordion.css\">");
//				sb.append("<script type=\"text/javascript\" src=\"plug-in/easyui/jquery.easyui.min.1.3.2.js\"></script>");
				sb.append("<script type=\"text/javascript\" src=\"plug-in/easyui/locale/easyui-lang-zh_CN.js\"></script>");
				sb.append("<script type=\"text/javascript\" src=\"plug-in/easyui/locale/easyui-lang-zh_TW.js\"></script>");
				sb.append("<script type=\"text/javascript\" src=\"plug-in/easyui/locale/easyui-lang-en.js\"></script>");
//				sb.append("<script type=\"text/javascript\" src=\"plug-in/tools/syUtil.js\"></script>");
			}
			if (oConvertUtils.isIn("DatePicker", types)) {
				sb.append("<script type=\"text/javascript\" src=\"plug-in/My97DatePicker/WdatePicker.js\"></script>");
			}
			if (oConvertUtils.isIn("jqueryui", types)) {
				sb.append("<link rel=\"stylesheet\" href=\"plug-in/jquery-ui/css/ui-lightness/jquery-ui-1.9.2.custom.min.css\" type=\"text/css\"></link>");
				sb.append("<script type=\"text/javascript\" src=\"plug-in/jquery-ui/js/jquery-ui-1.9.2.custom.min.js\"></script>");
			}
			if (oConvertUtils.isIn("prohibit", types))
				sb.append("<script type=\"text/javascript\" src=\"plug-in/tools/prohibitutil.js\"></script>");
			if (oConvertUtils.isIn("designer", types)) {
				sb.append("<script type=\"text/javascript\" src=\"plug-in/designer/easyui/jquery-1.7.2.min.js\"></script>");
				sb.append("<link id=\"easyuiTheme\" rel=\"stylesheet\" href=\"plug-in/designer/easyui/easyui.css\" type=\"text/css\"></link>");
				sb.append("<link rel=\"stylesheet\" href=\"plug-in/designer/easyui/icon.css\" type=\"text/css\"></link>");
				sb.append("<script type=\"text/javascript\" src=\"plug-in/designer/easyui/jquery.easyui.min.1.3.0.js\"></script>");
				sb.append("<script type=\"text/javascript\" src=\"plug-in/designer/easyui/locale/easyui-lang-zh_CN.js\"></script>");
				sb.append("<script type=\"text/javascript\" src=\"plug-in/tools/syUtil.js\"></script>");

				sb.append("<script type='text/javascript' src='plug-in/jquery/jquery-autocomplete/lib/jquery.bgiframe.min.js'></script>");
				sb.append("<script type='text/javascript' src='plug-in/jquery/jquery-autocomplete/lib/jquery.ajaxQueue.js'></script>");
				sb.append("<script type='text/javascript' src='plug-in/jquery/jquery-autocomplete/jquery.autocomplete.min.js'></script>");
				sb.append("<link href=\"plug-in/designer/designer.css\" type=\"text/css\" rel=\"stylesheet\" />");
				sb.append("<script src=\"plug-in/designer/draw2d/wz_jsgraphics.js\"></script>");
				sb.append("<script src='plug-in/designer/draw2d/mootools.js'></script>");
				sb.append("<script src='plug-in/designer/draw2d/moocanvas.js'></script>");
				sb.append("<script src='plug-in/designer/draw2d/draw2d.js'></script>");
				sb.append("<script src=\"plug-in/designer/MyCanvas.js\"></script>");
				sb.append("<script src=\"plug-in/designer/ResizeImage.js\"></script>");
				sb.append("<script src=\"plug-in/designer/event/Start.js\"></script>");
				sb.append("<script src=\"plug-in/designer/event/End.js\"></script>");
				sb.append("<script src=\"plug-in/designer/connection/MyInputPort.js\"></script>");
				sb.append("<script src=\"plug-in/designer/connection/MyOutputPort.js\"></script>");
				sb.append("<script src=\"plug-in/designer/connection/DecoratedConnection.js\"></script>");
				sb.append("<script src=\"plug-in/designer/task/Task.js\"></script>");
				sb.append("<script src=\"plug-in/designer/task/UserTask.js\"></script>");
				sb.append("<script src=\"plug-in/designer/task/ManualTask.js\"></script>");
				sb.append("<script src=\"plug-in/designer/task/ServiceTask.js\"></script>");
				sb.append("<script src=\"plug-in/designer/gateway/ExclusiveGateway.js\"></script>");
				sb.append("<script src=\"plug-in/designer/gateway/ParallelGateway.js\"></script>");
				sb.append("<script src=\"plug-in/designer/boundaryevent/TimerBoundary.js\"></script>");
				sb.append("<script src=\"plug-in/designer/boundaryevent/ErrorBoundary.js\"></script>");
				sb.append("<script src=\"plug-in/designer/subprocess/CallActivity.js\"></script>");
				sb.append("<script src=\"plug-in/designer/task/ScriptTask.js\"></script>");
				sb.append("<script src=\"plug-in/designer/task/MailTask.js\"></script>");
				sb.append("<script src=\"plug-in/designer/task/ReceiveTask.js\"></script>");
				sb.append("<script src=\"plug-in/designer/task/BusinessRuleTask.js\"></script>");
				sb.append("<script src=\"plug-in/designer/designer.js\"></script>");
				sb.append("<script src=\"plug-in/designer/mydesigner.js\"></script>");
			}

			if (oConvertUtils.isIn("tools", types)) {
				sb.append("<script type=\"text/javascript\" src=\"plug-in/lhgDialog/lhgdialog.min.js?skin=iblue\"></script>");
				sb.append("<script type=\"text/javascript\" src=\"plug-in/tools/curdtools.js\"></script>");
				sb.append("<script type=\"text/javascript\" src=\"plug-in/tools/easyuiextend.js\"></script>");
			}
			if (oConvertUtils.isIn("toptip", types)) {
				sb.append("<link rel=\"stylesheet\" href=\"plug-in/toptip/css/css.css\" type=\"text/css\"></link>");
				sb.append("<script type=\"text/javascript\" src=\"plug-in/toptip/manhua_msgTips.js\"></script>");
			}
			sb.append("<link rel=\"stylesheet\" href=\"resources/css/base.css\" type=\"text/css\"></link>");

			out.print(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 6;
	}
}
