(ns ogbe.fulcro.mui.icons.label
  #?(:cljs (:require
            ["@mui/icons-material/Label" :default Label]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-label
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Label)))