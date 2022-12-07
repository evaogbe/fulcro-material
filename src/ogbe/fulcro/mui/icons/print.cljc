(ns ogbe.fulcro.mui.icons.print
  #?(:cljs (:require
            ["@mui/icons-material/Print" :default Print]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-print
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Print)))