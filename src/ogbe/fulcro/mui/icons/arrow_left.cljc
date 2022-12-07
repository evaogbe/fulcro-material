(ns ogbe.fulcro.mui.icons.arrow-left
  #?(:cljs (:require
            ["@mui/icons-material/ArrowLeft" :default ArrowLeft]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-arrow-left
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ArrowLeft)))