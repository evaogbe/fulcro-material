(ns ogbe.fulcro.mui.icons.gmobiledata
  #?(:cljs (:require
            ["@mui/icons-material/GMobiledata" :default GMobiledata]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-gmobiledata
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory GMobiledata)))