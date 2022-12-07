(ns ogbe.fulcro.mui.icons.dataset
  #?(:cljs (:require
            ["@mui/icons-material/Dataset" :default Dataset]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dataset
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Dataset)))