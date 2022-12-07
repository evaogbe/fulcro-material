(ns ogbe.fulcro.mui.icons.plus-one
  #?(:cljs (:require
            ["@mui/icons-material/PlusOne" :default PlusOne]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-plus-one
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlusOne)))