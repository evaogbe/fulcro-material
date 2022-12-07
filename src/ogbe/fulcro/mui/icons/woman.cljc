(ns ogbe.fulcro.mui.icons.woman
  #?(:cljs (:require
            ["@mui/icons-material/Woman" :default Woman]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-woman
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Woman)))