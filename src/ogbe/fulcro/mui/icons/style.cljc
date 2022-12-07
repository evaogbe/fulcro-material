(ns ogbe.fulcro.mui.icons.style
  #?(:cljs (:require
            ["@mui/icons-material/Style" :default Style]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-style
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Style)))