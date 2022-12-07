(ns ogbe.fulcro.mui.icons.villa
  #?(:cljs (:require
            ["@mui/icons-material/Villa" :default Villa]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-villa
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Villa)))