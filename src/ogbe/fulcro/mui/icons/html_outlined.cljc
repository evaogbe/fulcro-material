(ns ogbe.fulcro.mui.icons.html-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HtmlOutlined" :default HtmlOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-html-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HtmlOutlined)))