(ns ogbe.fulcro.mui.icons.invert-colors
  #?(:cljs (:require
            ["@mui/icons-material/InvertColors" :default InvertColors]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-invert-colors
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory InvertColors)))