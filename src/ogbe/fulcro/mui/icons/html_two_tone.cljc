(ns ogbe.fulcro.mui.icons.html-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/HtmlTwoTone" :default HtmlTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-html-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HtmlTwoTone)))