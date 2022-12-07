(ns ogbe.fulcro.mui.icons.multiple-stop
  #?(:cljs (:require
            ["@mui/icons-material/MultipleStop" :default MultipleStop]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-multiple-stop
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MultipleStop)))