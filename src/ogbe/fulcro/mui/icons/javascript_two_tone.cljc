(ns ogbe.fulcro.mui.icons.javascript-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/JavascriptTwoTone" :default JavascriptTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-javascript-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory JavascriptTwoTone)))