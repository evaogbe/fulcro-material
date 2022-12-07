(ns ogbe.fulcro.mui.icons.html-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HtmlRounded" :default HtmlRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-html-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HtmlRounded)))