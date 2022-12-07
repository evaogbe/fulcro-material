(ns ogbe.fulcro.mui.icons.javascript-outlined
  #?(:cljs (:require
            ["@mui/icons-material/JavascriptOutlined" :default JavascriptOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-javascript-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory JavascriptOutlined)))