(ns ogbe.fulcro.mui.icons.all-out
  #?(:cljs (:require
            ["@mui/icons-material/AllOut" :default AllOut]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-all-out
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AllOut)))