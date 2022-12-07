(ns ogbe.fulcro.mui.icons.check
  #?(:cljs (:require
            ["@mui/icons-material/Check" :default Check]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-check
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Check)))