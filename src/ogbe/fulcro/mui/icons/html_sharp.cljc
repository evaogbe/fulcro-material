(ns ogbe.fulcro.mui.icons.html-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HtmlSharp" :default HtmlSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-html-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HtmlSharp)))