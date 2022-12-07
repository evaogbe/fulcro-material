(ns ogbe.fulcro.mui.icons.javascript-rounded
  #?(:cljs (:require
            ["@mui/icons-material/JavascriptRounded" :default JavascriptRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-javascript-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory JavascriptRounded)))